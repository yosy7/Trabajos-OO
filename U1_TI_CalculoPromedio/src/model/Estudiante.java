package model;

public class Estudiante {
    private String nombre;
    private String matricula;
    private double[] notas = new double[5];

    public Estudiante(String nombre, String matricula) {
        this.nombre = nombre;
        this.matricula = matricula;
    }

    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }

    public String aprobado() {
        double promedio = calcularPromedio();
        String mensaje;

        if (promedio >= 70) {
            mensaje = "Aprobado.";
        } else {
            mensaje ="Reprobado";
        }

        return mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota(int i) {
        return notas[i];
    }

    public void setNota(int i, double n) {
        if (i >= 0 && i < notas.length) {
            notas[i] = n;
        }
    }
}
