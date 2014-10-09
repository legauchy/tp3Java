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
public class Losange extends Parallelogramme{

    public Losange(double x, double y, double alpha, double L,double A) {
        super(new Point(x, y), alpha, L, A, L);
    }
    
    public Losange(Point p, double alpha, double L,double A) {
        super(p, alpha, L, A, L);
    }
    
    @Override
    protected String getClassName() {
        return "Losange";
    }
}
