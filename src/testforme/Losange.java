package testforme;

/**
 *
 * @author Henry Lefevre - Anthony Gauchy
 */
public class Losange extends Parallelogramme{

    public Losange(Point p, double alpha, double L, double A) {
        super(p, alpha, L, A, L);
    }
    
    public Losange(double x, double y, double alpha, double L, double A) {
        this(new Point(x, y), alpha, L, A);
    }
    
    @Override
    public boolean estLosange() {
        return true;
    }
    
    @Override
    protected String getClassName() {
        return "Losange";
    }
}
