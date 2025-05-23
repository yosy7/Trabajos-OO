package Model;

public class circle {
private double radio;

 public double getAreaCircle() {
        return 3.1416 * radio * radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double getRadio() {
        return this.radio;
    }

    public double getPerimeterCircle() {
        return 2 * 3.1416 * radio;
    }
}
