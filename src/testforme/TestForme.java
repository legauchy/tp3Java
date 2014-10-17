package testforme;

/**
 *
 * @author Henry Lefevre - Anthony Gauchy
 */
public class TestForme {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Parallelogramme para = new Parallelogramme(0, 5, 0, 5, Math.PI/6, 2);
        Carre carre = new Carre(0, 0, Math.PI/2, 10);
        Rectangle rectangle = new Rectangle(0, 0, Math.PI/4, 10, 5);
        Losange losange = new Losange(0, 0, 0, 10, (120.0  / 180.0) * Math.PI);
        Triangle tri = new Triangle(-2, -3.5, Math.PI/10, 8, Math.PI/3, Math.PI/7);
        TriangleEquilaterale teq = new TriangleEquilaterale(0, 0, Math.PI/3, 10);
        TriangleRectangle tr = new TriangleRectangle(0, 0, 0, 10,5);
        TriangleIsocele ti = new TriangleIsocele(0, 0, 0, 10, Math.PI/4);
        Disque d = new Disque(10, 10, 5);
        
        System.out.println(para);
        System.out.println();
        System.out.println(carre);
        System.out.println();
        System.out.println(rectangle);
        System.out.println();
        System.out.println(losange);
        System.out.println();
        System.out.println(tri);
        System.out.println();
        System.out.println(teq);
        System.out.println();
        System.out.println(tr);
        System.out.println();
        System.out.println(ti);
        System.out.println();
        System.out.println(d);
    }
    
}
