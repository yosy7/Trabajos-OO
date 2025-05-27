package Model;

public class Main {
    public static void main(String[] args) throws Exception {
        CuentaBancaria cuenta = new CuentaBancaria("yoselinne");
        //cuenta.setTitular("Yoselinne");
        
        System.out.println("CLIENTE: " + cuenta.getTitular());
        cuenta.depositar(1000);
         System.out.println("Saldo: " + cuenta.getSaldo());
         cuenta.retirar(200);
         System.out.println("Saldo: " + cuenta.getSaldo());
         cuenta.retirar(10000);
        System.out.println("Saldo: " + cuenta.getSaldo());

        
        


    }

}
