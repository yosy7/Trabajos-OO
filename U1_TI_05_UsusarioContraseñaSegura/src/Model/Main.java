package Model;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        UsuarioSeguro usuario = new UsuarioSeguro();

        String nombre = JOptionPane.showInputDialog("Ingrese el nombre de usuario:");
        usuario.setNombreUsuario(nombre);

        String contrasena = JOptionPane.showInputDialog("Ingrese la contraseña:");
        usuario.setPassword(contrasena);

        if (usuario.autenticar(contrasena)) {
            System.out.println("Usuario inicializado correctamente.");

             String comprobacion = JOptionPane.showInputDialog("Ingrese su contraseña:");
            if (usuario.autenticar(comprobacion)) {
                JOptionPane.showMessageDialog(null, "acceso concedido");
                System.out.println("Acceso concedido");
            } else {
                System.out.println("Acceso denegado");
                 JOptionPane.showMessageDialog(null, "acceso denegado");
            }
        } else {
            System.out.println("Error al inicializar usuario.");
            return;
        }

        
       
       
    }
}
