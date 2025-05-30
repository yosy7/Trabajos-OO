package Model;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {

         String usuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
        String password = JOptionPane.showInputDialog("Ingrese su contraseña:");

        UsuarioSeguro UsuarioSeguro = new UsuarioSeguro();
        UsuarioSeguro.setNombreUsuario(usuario);
        UsuarioSeguro.setPassword(password);

        if (UsuarioSeguro.password != null || UsuarioSeguro.nombreUsuario != null) {
            System.out.println("Usuario inicializado correctamente.");
        } else {
            System.out.println("Error al inicializar el usuario.");
            return;
        }

        boolean acceso = UsuarioSeguro.autenticar("hola");
        if (acceso){
            JOptionPane.showMessageDialog(null, "Acceso concedido");

        }else{
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        }
    }

}
