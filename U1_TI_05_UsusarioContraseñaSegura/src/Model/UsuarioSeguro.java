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

        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneDigito = false;

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c)) {
                tieneMayuscula = true;
            }
            if (Character.isLowerCase(c)) {
                tieneMinuscula = true;
            }
            if (Character.isDigit(c)) {
                tieneDigito = true;
            }
        }

        if (tieneMayuscula == false) {
        System.out.println("La contraseña debe tener al menos una mayuscula.");
        }
        if (tieneMinuscula == false) {
        System.out.println("La contraseña debe tener al menos una minuscula.");
        }
        if (tieneDigito == false) {
        System.out.println("La contraseña debe tener al menos un digito.");
        }


        this.password = password;
    }

    public boolean autenticar(String intentPassword) {
        
        if(intentPassword.equals(password)){
            return true;
        }else{
            return false;
        }

    }
}



