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
public class TriangleIsocele extends Triangle{

    public TriangleIsocele(double x, double y, double alpha, double L, double A) {
        super(x, y, alpha, L, A, A);
    }

    public TriangleIsocele(Point p, double alpha, double L, double A) {
        super(p, alpha, L, A, A);
    }

    @Override
    protected String getClassName() {
        return "Triangle isocele";
    }
    
    
    
}
