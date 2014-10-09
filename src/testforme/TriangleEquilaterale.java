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
public class TriangleEquilaterale extends TriangleIsocele{

    public TriangleEquilaterale(double x, double y, double alpha, double L) {
        super(x, y, alpha, L, 60);
    }

    public TriangleEquilaterale(Point p, double alpha, double L) {
        super(p, alpha, L, 60);
    }

    @Override
    protected String getClassName() {
        return "Triangle equilaterale";
    }
    
    
    
}
