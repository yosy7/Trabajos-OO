package Model;

public class CuentaBancaria {
  private String titular;
  private double saldo;

  public CuentaBancaria(String titular){
     this.titular = titular;
  }
  
  //public CuentaBancaria(Double saldo){
   // this.saldo = saldo;
  //}
  
  public void depositar(double monto){
     if(monto > 0){
        saldo += monto;
        System.out.println("Deposito exitoso de:" + monto);
        //System.out.println("Saldo: " + saldo);
     }else{
        System.out.println("Deposito fallido");
     }
  }

  public boolean retirar(double monto){
    if(monto > 0 && saldo >= monto){
        saldo -= monto;

        System.out.println("Retiro de " + monto);
        return true;
    }else{
        System.out.println("retiro fallido");
        return false;
        
    }
  }
  public String getTitular() {
    return titular;
  }
  public Double getSaldo() {
    return saldo;
  }
  public void setTitular(String titular) {
    this.titular = titular;
  }

  
  
}
