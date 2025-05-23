package Model;

public class Main {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        square sq = new square();
        sq.setLado(10);
        sq.setMessage("");


        System.out.println("SQUARE------------------------");
        
        System.out.println("lado: " + sq.getLado());
        
        System.out.println("Perimetro: " + sq.getPerimeter());
        sq.getPerimeter();
        System.out.println("Area: " + sq.getArea());
        System.out.println();
        sq.getArea();

        System.out.println("CIRCLE------------------------");
        circle c = new circle();
        c.setRadio(5);
        System.out.println("radio: " + c.getRadio());
        System.out.println("area: " + c.getAreaCircle());
        System.out.println("Perimetro: " + c.getPerimeterCircle());

        System.out.println();
        System.out.println("TRIANGLE------------------------");
        Triangle t = new Triangle();
        t.setBaseTriangulo(10);
        t.setAlturaTriangulo(15);
        t.setLadoTriangulo(18);
        System.out.println("Base: " +  t.getBaseTriangulo());
        System.out.println("Altura: " +  t.getAlturaTriangulo());
        System.out.println("Lado: " +  t.getLadoTriangulo());
        System.out.println("Area: " + t.getAreaTriangle());
        System.out.println("Perimetro: " + t.getPerimeterTriangle());
    }

}
