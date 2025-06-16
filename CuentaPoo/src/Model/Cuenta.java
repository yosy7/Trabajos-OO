package Model;
public abstract class Cuenta {
private String numeroCuenta;
private String titula;
protected double saldo;

public Cuenta(String numeroCuenta, String titula, double saldo){
    this.titula = titula;
    this.numeroCuenta=numeroCuenta;
    this.saldo=saldo;
}

public void depositar(double cantidad){
    if(cantidad > 0){
        saldo += cantidad;
    }else{
        System.out.println("No se puede hacer un deposito de: " + cantidad);
    }
}

public void retirar(double cantidad){
   if (cantidad > 0 && saldo >= cantidad){
    if(cantidad %100 == 0){
        saldo -= cantidad;
    }else{
        System.out.println("");
    }
   }
}

public String getNumeroCuenta() {
    return numeroCuenta;
}

public void setNumeroCuenta(String numeroCuenta) {
    this.numeroCuenta = numeroCuenta;
}

public String getTitula() {
    return titula;
}

public void setTitula(String titula) {
    this.titula = titula;
}

public double getSaldo() {
    return saldo;
}

public void setSaldo(double saldo) {
    this.saldo = saldo;
}



}
