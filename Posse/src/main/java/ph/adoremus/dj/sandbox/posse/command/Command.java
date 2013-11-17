/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.adoremus.dj.sandbox.posse.command;

import ph.adoremus.dj.sandbox.posse.model.Mower;

/**
 *
 * @author djadoremus
 */
public interface Command {
    public void updateOrientation(String orientation);
    public void moveMower();
}
