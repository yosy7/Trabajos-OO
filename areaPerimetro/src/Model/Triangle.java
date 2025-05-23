package Model;

public class Triangle {
    private double ladoTriangulo;


    private double baseTriangulo;
    private double alturaTriangulo;

    public double getAreaTriangle() {
        return (baseTriangulo * alturaTriangulo) / 2;
    }
    public void setBaseTriangulo(double baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }
    public double getBaseTriangulo() {
        return this.baseTriangulo;
    }
    public void setAlturaTriangulo(double alturaTriangulo) {
        this.alturaTriangulo = alturaTriangulo;
    }
    public double getAlturaTriangulo() {
        return this.alturaTriangulo;
    }

    public void setLadoTriangulo(double ladoTriangulo) {
        this.ladoTriangulo = ladoTriangulo;
    }
    public double getLadoTriangulo() {
        return this.ladoTriangulo;
    }

    public double getPerimeterTriangle() {
        return 2 *  ladoTriangulo + baseTriangulo;
    }

}
