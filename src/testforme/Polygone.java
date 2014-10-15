package testforme;

import java.util.ArrayList;

/**
 *
 * @author Henry Lefevre - Anthony Gauchy
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
        ArrayList<Point> arrayPoints = points();
        int nbPoints = arrayPoints.size();
        double distance = 0;
        for (int i = 0; i < nbPoints; i++) {
            distance += Utility.distance(arrayPoints.get(i), arrayPoints.get((i+1) % nbPoints));
        }
        
        return Utility.round(distance);
    }
    
    @Override
    public String toString() {
       String s = getClassName() +" :\n"
               + "Liste des points : ";
        for(Point p : points()) {
            s += p.toString()+" ";
        }
       
       s +=  "\nAire = " + this.aire() + "\n"
            + "Perimètre =" + this.perimetre() + "\n"
            + "Rotation = " + this.alpha + "\n"
            + "Angle A = " + this.angleA + "\n"
            + "Longueur = " + this.L + "\n";
       
       return s;
    }
    
    protected abstract String getClassName();

}
