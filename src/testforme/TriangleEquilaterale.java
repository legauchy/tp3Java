package testforme;

/**
 *
 * @author Henry Lefevre - Anthony Gauchy
 */
public class TriangleEquilaterale extends TriangleIsocele{
    
    public TriangleEquilaterale(Point p, double alpha, double L) {
        super(p, alpha, L, Math.PI/3);
    }
    
    public TriangleEquilaterale(double x, double y, double alpha, double L) {
        this(new Point(x, y), alpha, L);
    }

    @Override
    public boolean estEquilaterale() {
        return true;
    }

    @Override
    protected String getClassName() {
        return "Triangle equilaterale";
    }
    
    
    
}
