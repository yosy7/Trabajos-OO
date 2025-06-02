package Model;

public class Triangle2 extends FigureAbs{
//private double base;
    private double height;
    private double side;

    public Triangle2(double base, double height, double side) {
        //this.base = base;
        this.height = height;
        this.side = side;
    }

    /*public Triangle2(double base) {
        this.base = base;

    }*/

    /*public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }*/

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (side * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }


}
