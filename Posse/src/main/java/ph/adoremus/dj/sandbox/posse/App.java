package ph.adoremus.dj.sandbox.posse;

import ph.adoremus.dj.sandbox.posse.command.MoveCommand;
import ph.adoremus.dj.sandbox.posse.controller.MowerController;
import ph.adoremus.dj.sandbox.posse.model.Mower;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        MowerController controller = new MowerController();
        
        Mower mower = new Mower(3, 3, "E");
        MoveCommand moveCommand = new MoveCommand(mower);
         
        controller.setCommand(moveCommand);
        controller.moveMower("MMRMMRMRRM");
        
        System.out.println(mower.getX() + " " + mower.getY() + " " + mower.getOrientation());
        
    }
}
