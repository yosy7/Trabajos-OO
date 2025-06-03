package Model;

public class Triangle2 extends FigureAbs{
//private double base;
    //private double height;
    private double side;

    public Triangle2( double side) {
        //this.base = base;
        //this.height = height;
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

    /*public double getHeight() {
        return (Math.sqrt(3)/4)*(side);
    }*/

    /*public void setHeight(double height) {
        this.height = (Math.sqrt(3)/4)*(side);
    }*/

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        //return 1/2 *side*height;
        return (Math.sqrt(3)/4)*(side*side);
    }

    @Override
    public double getPerimeter() {
        return 3 * side;
    }


}
