package testforme;

import java.util.ArrayList;

/**
 *
 * @author Henry Lefevre - Anthony Gauchy
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
    public final ArrayList<Point> points() {
        double px = this.p.getX();
        double py = this.p.getY();
        double x, y;
        ArrayList<Point> arrayPoints = new ArrayList<>();
        arrayPoints.add(p);
        x = Utility.round(px + L * Math.cos(alpha));
        y = Utility.round(py + L * Math.sin(alpha));
        arrayPoints.add(new Point(x, y));
        x = Utility.round(x + l * Math.cos(alpha + angleA));
        y = Utility.round(y + l * Math.sin(alpha + angleA));
        arrayPoints.add(new Point(x, y));
        x = Utility.round(px + l * Math.cos(alpha + angleA));
        y = Utility.round(py + l * Math.sin(alpha + angleA));
        arrayPoints.add(new Point(x, y));
        
        return arrayPoints;
    }

    @Override
    public double aire() {
        return Utility.round((l * Math.sin(angleA)) * L);
    }

    @Override
    public String toString() {
        return super.toString()
                + "Largeur = " + this.l;
                
    }
    
    @Override
    protected String getClassName() {
        return "Parallelogramme";
    }
    
    public boolean estLosange() {
        return this.L == this.l;
    }
    
    public boolean estRectangle() {
        return this.angleA == Math.PI/2;
    }
    
    public boolean estCarre() {
        return this.estLosange() && this.estRectangle();
    }
}
