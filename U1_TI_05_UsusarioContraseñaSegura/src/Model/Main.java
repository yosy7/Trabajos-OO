package Model;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {

         String usuario = JOptionPane.showInputDialog("Ingrese su nombre de usuario:");
        String password = JOptionPane.showInputDialog("Ingrese su contraseña:");

        UsuarioSeguro usuarioSeguro = new UsuarioSeguro();
        usuarioSeguro.setNombreUsuario(usuario);
        usuarioSeguro.setPassword(password);

        if (usuarioSeguro.autenticar(password)) {
            System.out.println("Usuario inicializado correctamente.");
        } else {
            System.out.println("Error al inicializar el usuario.");
            return;
        }

        boolean acceso = usuarioSeguro.autenticar(password);
        if (acceso){
            JOptionPane.showMessageDialog(null, "Acceso concedido");

        }else{
            JOptionPane.showMessageDialog(null, "Acceso denegado");
        }
    }

}
