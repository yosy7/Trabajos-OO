package Model;

public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario ){
        if(nombreUsuario == null){
           System.out.println("el usuario no puede estar vacio");
        }
      this.nombreUsuario = nombreUsuario; 
    }

    public void setPassword(String password){
        if(password.length() > 8 || password != null){
           //System.out.println("la contraseña debe tener al menos 8  caracteres");
        }
        for(int i = 0; i < password.length(); i++){
            char c = password.charAt(i); 
            if(Character.isUpperCase(c)==false){
             System.out.println("la contraseña debe tener al menos una mayuscula");
            }else if(Character.isLowerCase(c) == false){
             System.out.println("la contraseña debe tener al menos una minuscula");
            }else if(Character.isDigit(c)==false){
             System.out.println("la contraseña debe tener al menos un digito");
            }
            
            
        }
         this.password=password; 
        }

        public boolean autenticar(String intentPassword){
            if(intentPassword.equals(password)){
               return true;
            }else{
                return false;
            }
        }
    }




