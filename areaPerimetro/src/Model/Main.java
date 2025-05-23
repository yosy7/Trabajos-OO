package Model;

public class Main {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        square sq = new square();
        sq.setLado(10);
        sq.setMessage("");

        System.out.println(sq.getLado());
        
        System.out.println(sq.getPerimeter());
        sq.getPerimeter();
        System.out.println(sq.getArea());
        System.out.println();
        sq.getArea();
    }

}
