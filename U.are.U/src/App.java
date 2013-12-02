
import com.digitalpersona.uareu.Fid;
import com.digitalpersona.uareu.Fmd;
import com.digitalpersona.uareu.Reader;
import com.digitalpersona.uareu.Reader.Description;
import com.digitalpersona.uareu.UareUException;
import com.digitalpersona.uareu.jni.Dpfj;
import com.digitalpersona.uareu.jni.Dpfpdd;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author djadoremus
 */
public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Dpfpdd dpfpdd = new Dpfpdd();
            dpfpdd.init();

            Description[] descriptions = dpfpdd.query_devices();

            for (Description description : descriptions) {
                System.out.println("Name : " + description.name + " \n"
                        + "Serial Number : " + description.serial_number + " \n"
                        + "ID : " + description.id.product_name + " " + description.id.vendor_name + " " + description.id.product_id + " " + description.id.vendor_id + "\n"
                        + "Modality : " + description.modality.name() + " \n"
                        + "Technology : " + description.technology.name() + " \n"
                        + "Version : " + description.version.toString() + " \n");
            }


            Dpfj dpfj = new Dpfj();
            dpfj.start_enrollment(Fmd.Format.ANSI_378_2004);

            // Get first device
            Description d = descriptions[0];
            Long reader = dpfpdd.open(d.name, Reader.Priority.EXCLUSIVE);
            
            System.out.println(dpfpdd.get_status(reader).status);
            
//            Reader.CaptureResult cr = dpfpdd.capture(reader,  150, Fid.Format.ANSI_381_2004, Reader.ImageProcessing.IMG_PROC_PIV, 150, 10000);
            System.out.println(reader);
            Reader.CaptureResult cr = dpfpdd.capture(reader, 150, Fid.Format.ANSI_381_2004, Reader.ImageProcessing.IMG_PROC_DEFAULT, 150, 10000);
            Fmd fmd = dpfj.create_fmd_from_fid(cr.image, Fmd.Format.ANSI_378_2004);
            List<Fmd> fmds = new ArrayList<Fmd>();
            fmds.add(fmd);
            while (!dpfj.add_to_enrollment(fmd, 0)) {
                System.out.println("not sufficient to create an enrollment FMD");
                reader = dpfpdd.open(d.name, Reader.Priority.EXCLUSIVE);
                cr = dpfpdd.capture(reader, 1500, Fid.Format.ANSI_381_2004, Reader.ImageProcessing.IMG_PROC_PIV, 1500, 10000);
                fmd = dpfj.create_fmd_from_fid(cr.image, Fmd.Format.ANSI_378_2004);
                fmds.add(fmd);
            }

            System.out.println("enrolling");
            dpfj.create_enrollment_fmd();
            dpfj.finish_enrollment();
            
            //"save" to db fmds
            System.out.println("fmds size " + fmds.size());

            dpfpdd.exit();
        } catch (UareUException ex) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
