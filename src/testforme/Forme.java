package testforme;

/**
 *
 * @author Henry Lefevre - Anthony Gauchy
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
