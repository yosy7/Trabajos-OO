package Model;


public class Main {
    public static void main(String[] args)throws Exception {

        Curso curso1 = new Curso("7DD", "Programacion", 3);

        Estudiante e1 = new Estudiante("Ariadna", "ariadna@email.com", 9.2);
        Estudiante e2 = new Estudiante("Jassiel", "jassiel@email.com", 9.7);
        Estudiante e3 = new Estudiante("Daniel", "daniel@email.com", 8.9);
        Estudiante e4 = new Estudiante("Oswaldo", "oswaldo@email.com", 9.0);

        curso1.Inscribir(e1);
        curso1.Inscribir(e2);
        curso1.Inscribir(e3);
        curso1.Inscribir(e4);


        System.out.println("Promedio del grupo: " + curso1.calcularPromedioGrupo());





    }
}