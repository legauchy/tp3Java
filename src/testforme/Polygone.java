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
public abstract class Polygone extends Forme{
    
    protected double alpha;
    protected double angleA;
    protected double L;

    public Polygone(Point p, double alpha, double L, double angleA) {
        super(p);
        this.L = L;
        this.angleA = angleA;
        this.alpha = alpha;
    }
    
    public abstract ArrayList<Point> points();
    
    @Override
    public double perimetre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
       String s = getClassName() +" :\n"
               + "Liste des points : ";
        for(Point p : this.points()) {
            s += p.toString()+" ";
        }
       
       s +=  "Aire = " + this.aire()
            + "Perimètre =" + this.perimetre() + "\n"
            + "Rotation = " + this.alpha+ "\n"
            + "Angle A = " + this.angleA + "\n"
            + "Longueur =" + this.L+ "\n";
       
       return s;
    }
    
    protected abstract String getClassName();

}
