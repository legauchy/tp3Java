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
        
        //Carre carre = new Carre(0, 0, Math.PI/2, 10);
        //Rectangle rectangle = new Rectangle(0, 0, Math.PI/4, 10, 5);
        //Losange losange = new Losange(0, 0, 0, 10, (120.0  / 180.0) * Math.PI);
        //TriangleEquilaterale te = new TriangleEquilaterale(0, 0, Math.PI/3, 10);
        //TriangleRectangle te = new TriangleRectangle(0, 0, 0, 10,5);
        TriangleIsocele te = new TriangleIsocele(0, 0, 0, 10, Math.PI/4);
        
        //System.out.println(losange);
        System.out.println("");
        System.out.println(te);
        
        //System.out.println(Forme.round(0.999999999999));
    }
    
}
