package Model;

public class Curso{
    public String codigo;
    public String nombre;
    private Estudiante[] inscritos;


     public Curso(String codigo, String nombre, int capacidad ){
         this.codigo=codigo;
         this.nombre=nombre;
         inscritos=new Estudiante[capacidad];

     }


     public boolean Inscribir(Estudiante e) {
         for (int i = 0; i < inscritos.length; i++) {
             if (inscritos[i] == null) {
                 inscritos[i] = e;
                 System.out.println("Estudiante: "+ e.getNombre() +" Inscrito");
                 return true;
             }

         }
         System.out.println("Estudiante: "+ e.getNombre() +" No inscrito");
         return false;
     }

    public double calcularPromedioGrupo() {
        double suma = 0;
        int contador = 0;
        for (int i = 0; i < inscritos.length; i++) {
            if (inscritos[i] != null) {
                suma += inscritos[i].getPromedio();
                contador++;
            }
        }
        if (contador > 0) {
            return suma / contador;
        } else {
            return 0;
        }
    }



}
