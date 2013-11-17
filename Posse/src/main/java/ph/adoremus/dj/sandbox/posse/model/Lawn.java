/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ph.adoremus.dj.sandbox.posse.model;

/**
 *
 * @author djadoremus
 */
public class Lawn {
    private Integer[] area;

    public Lawn() {
        area = new Integer[2];
    }

    public Lawn(int x, int y) {
        area = new Integer[]{x, y};
    }

    public Integer[] getArea() {
        return area;
    }

    public void setArea(Integer[] area) {
        this.area = area;
    }
    
    
    
}
