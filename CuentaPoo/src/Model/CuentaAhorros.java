package Model;

public class CuentaAhorros extends Cuenta{
    private double tasaInteresAnual;

    public void aplicarInteres(){
        double interes=saldo*(tasaInteresAnual/12);
        saldo = saldo + interes;
        //saldo += interes;
        setSaldo(getSaldo()+interes);
    }

    public double getTasainteresAnual(){
        return tasaInteresAnual;
    } 
public CuentaAhorros(String numeroCuenta, String titula, double saldo, double tasaInteresAnual){
    super(numeroCuenta, titula, saldo);
    this.tasaInteresAnual=tasaInteresAnual;
}

public void setTasaInteresAnual(double tasaInteresAnual){
this.tasaInteresAnual = tasaInteresAnual;
}
}

