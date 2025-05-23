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
    }

}
