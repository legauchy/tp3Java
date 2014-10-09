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
    protected double L;

    public Polygone(Point p, double alpha, double L) {
        super(p);
        this.L = L;
        this.alpha = alpha;
    }
    
    public abstract ArrayList<Point> points();

    public double getAlpha() {
        return alpha;
    }

    public double getL() {
        return L;
    }
    
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
            + "Rotation = " + this.getAlpha() + "\n"
            + "Longueur =" + this.getL() + "\n";
       
       return s;
    }
    protected abstract String getClassName();

}
