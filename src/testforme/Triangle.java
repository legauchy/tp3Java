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
public class Triangle extends Polygone{

    protected double angleB;

    public Triangle(double x, double y, double alpha, double L, double A, double B) {
        super(new Point(x, y), alpha, L, A);
        this.angleB = B;
    }
    
    public Triangle(Point p, double alpha, double L, double A, double B) {
        super(p, alpha, L, A);
        this.angleB = B;
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
    public double perimetre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString()
                + "Angle B = " + this.angleB;
                
    }
    
    @Override
    protected String getClassName() {
        return "Triangle";
    }
    
    public boolean estTriRect() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean estEquilaterale() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean estIsocele() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
