package testforme;

/**
 *
 * @author Henry Lefevre - Anthony Gauchy
 */
public class Carre extends Rectangle {

    public Carre(Point p, double alpha, double L) {
        super(p, alpha, L, L);
    }
    
    public Carre(double x, double y, double alpha, double L) {
        this(new Point(x, y), alpha, L);
    }
    
    @Override
    public boolean estLosange() {
        return true;
    }
    
    @Override
    public boolean estCarre() {
        return true;
    }
    
    @Override
    protected String getClassName() {
        return "Carre";
    }
}
