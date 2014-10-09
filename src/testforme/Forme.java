/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testforme;

/**
 *
 * @author Goum
 */
public abstract class Forme {
    
    protected Point p;
    
    Forme(Point p) {
        this.p = p;
    }
    
    Forme(double x, double y) {
        this(new Point(x, y));
    }
    
    public abstract double aire();
    public abstract double perimetre();
    
    @Override
    public abstract String toString();
    
}
