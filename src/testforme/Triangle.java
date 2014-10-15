package testforme;

import java.util.ArrayList;

/**
 *
 * @author Henry Lefevre - Anthony Gauchy
 */
public class Triangle extends Polygone{

    protected double angleB;

    public Triangle(Point p, double alpha, double L, double A, double B) {
        super(p, alpha, L, A);
        this.angleB = B;
    }
    
    public Triangle(double x, double y, double alpha, double L, double A, double B) {
        this(new Point(x, y), alpha, L, A, B);
    }
    
    

    @Override
    public final ArrayList<Point> points() {
        double px = this.p.getX();
        double py = this.p.getY();
        double x, y;
        double l = L * Math.sin(angleB) / Math.sin(angleA + angleB);
        ArrayList<Point> arrayPoints = new ArrayList<>();
        arrayPoints.add(this.p);
        x = Utility.round(px + L * Math.cos(alpha));
        y = Utility.round(py + L * Math.sin(alpha));
        arrayPoints.add(new Point(x, y));
        x = Utility.round(px + l * Math.cos(alpha+angleA));
        y = Utility.round(py + l * Math.sin(alpha+angleA));
        arrayPoints.add(new Point(x, y));
        
        return arrayPoints;
    }

    @Override
    public double aire() {
        ArrayList<Point> arrayPoints = points();
        double a = Utility.distance(arrayPoints.get(0), arrayPoints.get(1));
        double b = Utility.distance(arrayPoints.get(1), arrayPoints.get(2));
        double c = Utility.distance(arrayPoints.get(2), arrayPoints.get(0));
        double s = 0.5 * (a + b + c);
        
        return Utility.round(Math.sqrt(s * (s-a) * (s-b) * (s-c)));
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
        return this.angleB == Math.PI/2;
    }
    
    public boolean estEquilaterale() {
        return this.angleA == Math.PI/3 && this.angleB == Math.PI/3;
    }
    
    public boolean estIsocele() {
        return this.angleA == this.angleB;
    }
}
