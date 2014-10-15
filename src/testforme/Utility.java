package testforme;

/**
 *
 * @author Henry Lefevre - Anthony Gauchy
 */
public class Utility {
    public static double distance(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getX() - p2.getX(), 2) + Math.pow(p1.getY() - p2.getY(), 2));
    }
    
    public static double round(double d) {
        return (Math.round(d * 100000.0) / 100000.0);
    }
}
