public abstract class Empleado {
   /*
   Atributos (private):  
String id
String nombre
double salarioBase
Constructor con estos tres parámetros.
*/ 

private String id;
private String nombre;
private double salarioBase;

public Empleado(String id, String nombre, double salarioBase){
    this.id=id;
    this.nombre=nombre;
    this.salarioBase=salarioBase;

}

public abstract double calcularSalario();

public double getSalarioBase(){
return salarioBase;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setSalarioBase(double salarioBase) {
    this.salarioBase = salarioBase;
}






}
