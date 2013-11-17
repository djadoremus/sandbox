/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.adoremus.dj.sandbox.posse.controller;

import ph.adoremus.dj.sandbox.posse.command.Command;

/**
 *
 * @author djadoremus
 */
public class MowerController {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void moveMower(String movement) {

        for (int i=0; i<movement.length(); i++){
            if (movement.charAt(i) == 'L' || movement.charAt(i) == 'l'){
                command.updateOrientation("" + movement.charAt(i));
            } else if (movement.charAt(i) == 'R' || movement.charAt(i) == 'r'){
                command.updateOrientation("" + movement.charAt(i));
            } else if (movement.charAt(i) == 'M' || movement.charAt(i) == 'm'){
                command.moveMower();
            }
        }
    }
}
