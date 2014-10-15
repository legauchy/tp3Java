package testforme;

/**
 *
 * @author Henry Lefevre - Anthony Gauchy
 */
public class Rectangle extends Parallelogramme{
    
    public Rectangle(Point p, double alpha, double L, double l) {
        super(p, alpha, L, Math.PI/2, l);
    }
    
    public Rectangle(double x, double y, double alpha, double L, double l) {
        this(new Point(x, y), alpha, L, l);
    }
    
    @Override
    public boolean estRectangle() {
        return true;
    }
    
    @Override
    protected String getClassName() {
        return "Rectangle";
    }
}
