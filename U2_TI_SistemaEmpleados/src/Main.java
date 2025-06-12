public class Main {
    public static void main(String[] args) throws Exception {
        EmpleadoTiempoCompleto empleado1 = new EmpleadoTiempoCompleto("MMVY12", "Aldo Lopez", 3000, "Seguro médico");
        empleado1.calcularSalario();

        EmpleadoPorHoras empleado2 = new EmpleadoPorHoras("MMVD12", "Luis Vazquez", 15, 40);
        empleado2.calcularSalario();

         System.out.println("ID: " + empleado1.getId() + " Nombre: " + empleado1.getNombre() + " Salario: " + empleado1.calcularSalario()+ " beneficios: " + empleado1.getBeneficios());
          System.out.println("ID: " + empleado2.getId() + " Nombre: " + empleado2.getNombre() + " Salario total: " + empleado2.calcularSalario() + " Salario por hora: " + empleado2.getSalarioBase());
    }
}


