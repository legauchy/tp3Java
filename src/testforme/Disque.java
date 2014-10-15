package testforme;

/**
 *
 * @author Henry Lefevre - Anthony Gauchy
 */
public class Disque extends Forme {
    
    private double rayon;
    
    public Disque(Point p, double rayon) {
        super(p);
        this.rayon = rayon;
    }
    
    public Disque(double x, double y, double rayon) {
        this(new Point(x, y), rayon);
    }
    
    public double getRayon() {
        return this.rayon;
    }
    
    public double diamtre() {
        return 2 * getRayon();
    }
    
    public double aire() {
     return Math.PI * Math.pow(getRayon(), 2);   
    }
    
    public double perimetre() {
        return 2 * Math.PI * getRayon();
    }
    
    public boolean estDansDisque(Point p) {
        return Math.sqrt(Math.pow(this.p.getX() - p.getX(), 2) + Math.pow(this.p.getY() - p.getY(), 2)) < getRayon();
    }
    
    public boolean estSurLeCercle(Point p) {
        return Math.sqrt(Math.pow(this.p.getX() - p.getX(), 2) + Math.pow(this.p.getY() - p.getY(), 2)) - getRayon() < 0.001;
    }
    
    public String toString() {
        return "Disque de centre " + this.p.toString() + ", de rayon " + getRayon();
    }
}
