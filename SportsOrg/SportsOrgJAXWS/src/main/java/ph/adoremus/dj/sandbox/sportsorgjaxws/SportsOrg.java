/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.adoremus.dj.sandbox.sportsorgjaxws;

import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 *
 * @author djadoremus
 */
@WebService
public class SportsOrg {
	@WebMethod
	public List<String> getSchools(String name) {
            List<String> schools = new ArrayList<String>();
            
            schools.add("DLSU");
            schools.add("ADMU");
            schools.add("UST");
            schools.add("UP");
            schools.add("FEU");
            schools.add("NU");
            schools.add("AdU");
            
            return schools;
	}
    
}
