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
public class MoveCommand implements Command {

    private Mower mower;

    public MoveCommand(Mower mower) {
        this.mower = mower;
    }

    public void updateOrientation(String orientation) {
        String currentOrientation = this.mower.getOrientation();
        if ("L".toLowerCase().equals(orientation.toLowerCase())) {
            updateCardinalsCounterClockwise(currentOrientation);
        } else if ("R".toLowerCase().equals(orientation.toLowerCase())) {
            updateCardinalsClockwise(currentOrientation);
        }
//        System.out.println("Updated Orientation : " + this.mower.getOrientation() + " from " + orientation);
    }

    public void updateCardinalsClockwise(String cardinal) {
        if ("N".toLowerCase().equals(cardinal.toLowerCase())) {
            this.mower.setOrientation("E");
        } else if ("E".toLowerCase().equals(cardinal.toLowerCase())) {
            this.mower.setOrientation("S");
        } else if ("W".toLowerCase().equals(cardinal.toLowerCase())) {
            this.mower.setOrientation("N");
        } else if ("S".toLowerCase().equals(cardinal.toLowerCase())) {
            this.mower.setOrientation("W");
        }
    }

    public void updateCardinalsCounterClockwise(String cardinal) {
        if ("N".toLowerCase().equals(cardinal.toLowerCase())) {
            this.mower.setOrientation("W");
        } else if ("E".toLowerCase().equals(cardinal.toLowerCase())) {
            this.mower.setOrientation("N");
        } else if ("W".toLowerCase().equals(cardinal.toLowerCase())) {
            this.mower.setOrientation("S");
        } else if ("S".toLowerCase().equals(cardinal.toLowerCase())) {
            this.mower.setOrientation("E");
        }
    }

    public void moveMower() {
        if ("N".toLowerCase().equals(this.mower.getOrientation().toLowerCase())) {
            mower.setX(mower.getX() + 1);
        } else if ("E".toLowerCase().equals(this.mower.getOrientation().toLowerCase())) {
            mower.setY(mower.getY() + 1);
        } else if ("W".toLowerCase().equals(this.mower.getOrientation().toLowerCase())) {
            mower.setY(mower.getY() - 1);
        } else if ("S".toLowerCase().equals(this.mower.getOrientation().toLowerCase())) {
            mower.setX(mower.getX() - 1);
        }
//        System.out.println("coords : " + coords[0] + " " + coords[1]);
//        System.out.println("Updated Coordinates : " + this.mower.getX() + " " + this.mower.getY());
    }
}
