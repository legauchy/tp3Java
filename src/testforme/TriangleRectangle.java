package testforme;

/**
 *
 * @author Henry Lefevre - Anthony Gauchy
 */
public class TriangleRectangle extends Triangle {
    
    public TriangleRectangle(Point p, double alpha, double L, double hauteur) {
        super(p, alpha, L, Math.atan(hauteur / L), Math.PI/2);
    }
    
    public TriangleRectangle(double x, double y, double alpha, double L, double hauteur) {
        this(new Point(x, y), alpha, L, hauteur);
    }
    
    @Override
    protected String getClassName() {
        return "Triangle rectangle";
    }
    
}
