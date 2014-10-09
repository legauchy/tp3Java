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
public class Carre extends Rectangle {

    public Carre(double x, double y, double alpha, double L) {
        super(new Point(x, y), alpha, L, L);
    }

    public Carre(Point p, double alpha, double L) {
        super(p, alpha, L, L);
    }

    @Override
    protected String getClassName() {
        return "Carre";
    }
}
