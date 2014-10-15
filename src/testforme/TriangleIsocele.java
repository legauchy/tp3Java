package testforme;

/**
 *
 * @author Henry Lefevre - Anthony Gauchy
 */
public class TriangleIsocele extends Triangle{

    public TriangleIsocele(Point p, double alpha, double L, double A) {
        super(p, alpha, L, A, A);
        if (A >= Math.PI/2) {
            throw new ArithmeticException("Angle >= 90°, angle : " + (A/Math.PI)*180.0);
        }
    }
    
    public TriangleIsocele(double x, double y, double alpha, double L, double A) {
        this(new Point(x, y), alpha, L, A);
    }
    
    @Override
    public boolean estIsocele() {
        return true;
    }
    
    @Override
    protected String getClassName() {
        return "Triangle isocele";
    }
    
    
    
}
