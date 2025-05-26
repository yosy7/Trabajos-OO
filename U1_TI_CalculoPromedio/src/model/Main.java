package model;

public class Main {
    public static void main(String[] args) {
        Estudiante[] estudiantes = new Estudiante[5];

        estudiantes[0] = new Estudiante("Juan", "A123");
        estudiantes[1] = new Estudiante("Maria", "B123");
        estudiantes[2] = new Estudiante("Carlos", "C123");
        estudiantes[3] = new Estudiante("Dani", "D123");
        estudiantes[4] = new Estudiante("Jassiel", "E123");

        // Asignar cinco notas a cada estudiante
        double[][] notas = {
            {80, 75, 90, 85, 70},
            {60, 65, 55, 70, 75},
            {88, 92, 85, 90, 87},
            {50, 40, 55, 60, 45},
            {78, 80, 82, 85, 79}
        };

        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < 5; j++) {
                estudiantes[i].setNota(j, notas[i][j]);
            }
        }

        // Mostrar información de los estudiantes con mensaje condicional
        for (Estudiante estudiante : estudiantes) {
            System.out.println("Nombre: " + estudiante.getNombre());
            System.out.println("Matrícula: " + estudiante.getMatricula());
            System.out.println("Promedio: " + estudiante.calcularPromedio());
            System.out.println(estudiante.aprobado());
            System.out.println("----------------------");
        }
    }
}

