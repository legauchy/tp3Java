/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testforme;

import java.util.ArrayList;

/**
 *
 * @author Goum
 */
public class Parallelogramme extends Polygone{

    protected double l;

    public Parallelogramme(double x, double y, double alpha, double L, double A, double l) {
        super(new Point(x, y), alpha, L,  A);
        this.l = l;
    }
    
    public Parallelogramme(Point p, double alpha, double L, double A, double l) {
        super(p, alpha, L,  A);
        this.l = l;
    }

    @Override
    public ArrayList<Point> points() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double aire() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString()
                + "Largeur = " + this.l;
                
    }
    
    @Override
    protected String getClassName() {
        return "Polygone";
    }
    
    public boolean estLosange() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean estRectangle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean estCarre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
