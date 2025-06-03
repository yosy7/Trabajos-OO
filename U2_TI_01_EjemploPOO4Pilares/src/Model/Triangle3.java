package Model;

public class Triangle3 extends FigureAbs {

    private double height;
    private double base;
    private double hypotenuse;

    public Triangle3(double base, double height, double hypotenuse) {
        this.base = base;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }
    
     public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

     public double getbase() {
        return base;
    }

    public void setbase(double base) {
        this.base = base;
    }

     public double getHypotenuse() {
        return hypotenuse;
    }

    public void setHypotenuse(double hypotenuse) {
        this.hypotenuse = hypotenuse;
    }

     @Override
    public double getArea() {
        return (base * height)/2;
    }

    @Override
    public double getPerimeter() {
        return base + height + hypotenuse;
    }


}


