package Model;

public class UsuarioSeguro {
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario) {
        if (nombreUsuario == null || nombreUsuario.trim().isEmpty()) {
            System.out.println("El nombre de usuario no puede ser nulo ni vacío.");
        } else {
            this.nombreUsuario = nombreUsuario;
        }
    }

    public void setPassword(String password) {
        if (password == null || password.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return;
        }

        boolean mayuscula = false;
        boolean minuscula = false;
        boolean digito = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                mayuscula = true;
            }
            if (Character.isLowerCase(c)) {
                minuscula = true;
            }
            if (Character.isDigit(c)) {
                digito = true;
            }
        }

        if (mayuscula == false) {
        System.out.println("La contraseña debe tener al menos una mayuscula.");
        }
        if (minuscula == false) {
        System.out.println("La contraseña debe tener al menos una minuscula.");
        }
        if (digito == false) {
        System.out.println("La contraseña debe tener al menos un digito.");
        }


         if (mayuscula && minuscula && digito) {
        this.password = password;
        
    } else {
        //contraseña invalida
    }

    }

    public boolean autenticar(String intentPassword) {
        
        if(intentPassword.equals(password)){
            return true;
        }else{
            return false;
        }

    }
}



