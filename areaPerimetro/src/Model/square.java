package Model;

public class square {
    private double lado;
    private String message;

    public double getPerimeter() {
            //double perimeter=lado * 4;
            //return perimeter;
               
        return lado * 4;
        
    }
    public double getArea() {
        if(!this.message.isEmpty()){
        getSecretMessage();
    }
        return lado * lado;

    }
    public void setLado(double lado) {
        this.lado = lado;
    }
    public double getLado() {
        return this.lado;
    }

    public void setMessage(String message) {
        this.message = message;
    }

     private void getSecretMessage() {
        System.out.println("este metodo solo es accesible desde la clase square, pero no desde afuera");
    }
}
