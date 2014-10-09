/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testforme;

/**
 *
 * @author goum
 */
public class Rectangle extends Parallelogramme{

    public Rectangle(double x, double y, double alpha, double L, double l) {
        super(new Point(x, y), alpha, L, 90, l);
    }
    
    public Rectangle(Point p, double alpha, double L, double l) {
        super(p, alpha, L, 90, l);
    }
    
    @Override
    protected String getClassName() {
        return "Rectangle";
    }
}
