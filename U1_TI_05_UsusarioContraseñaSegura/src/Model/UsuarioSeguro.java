package Model;

public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario ){
        if(nombreUsuario== null){
           System.out.println("el usuario no puede estar vacio");
        }
      this.nombreUsuario = nombreUsuario; 
    }

    public void setPassword(String password){
        if(password.length() < 8 || password == null){
           System.out.println("la contraseña debe tener al menos 8  caracteres");
        } 
        

        }
    }




