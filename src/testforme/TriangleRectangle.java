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
public class TriangleRectangle extends Triangle {

    public TriangleRectangle(double x, double y, double alpha, double L, double hauteur) {
        super(x, y, alpha, L, A, B);
    }

    public TriangleRectangle(Point p, double alpha, double L, double hauteur) {
        super(p, alpha, L, A, B);
    }
    
    @Override
    protected String getClassName() {
        return "Triangle rectangle";
    }
    
}
