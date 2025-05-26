package Model;

public class Main {
      public static void main(String [] args)throws Exception{
        //Computadora computer = new Computadora();
        Computadora computer = new Computadora("", "");
        computer.setModelo("OMEN");
        
        
        System.out.println("marca: "+ computer.getMarca());
        System.out.println("modelo: "+ computer.getModelo());
        computer.encender();
        computer.encender();
        computer.apagar();

      }
}
