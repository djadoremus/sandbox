/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.adoremus.dj.sandbox.posse.model;

/**
 *
 * @author djadoremus
 */
public class Mower {
    private Integer x;
    private Integer y;
    private String orientation;
    private Boolean collided;

    public Mower(int x, int y, String orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
        this.collided = Boolean.FALSE;
    }

    public Mower() {
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    /**
     * @return the orientation
     */
    public String getOrientation() {
        return orientation;
    }

    /**
     * @param orientation the orientation to set
     */
    public void setOrientation(String orientation) {
        this.orientation = orientation;
    }

    /**
     * @return the collided
     */
    public Boolean getCollided() {
        return collided;
    }

    /**
     * @param collided the collided to set
     */
    public void setCollided(Boolean collided) {
        this.collided = collided;
    }

    
    
}
