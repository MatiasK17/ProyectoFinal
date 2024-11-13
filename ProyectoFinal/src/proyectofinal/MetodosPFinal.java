
package proyectofinal;

import javax.swing.JOptionPane;

public class MetodosPFinal {
    
    
    //Metodo para registrar al usuario, devuelve un objeto de valor usuario
    public static Usuario registrarUsuario() {
        JOptionPane.showMessageDialog(null, "¡Hola buenos dias, bienvenido a la tienda online de Caramuru Muebles!\n" +
                                             "Primero le vamos a pedir si pudiera ingresar los siguientes datos", 
                                             "Bienvenida", JOptionPane.INFORMATION_MESSAGE);

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");
        
        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula"));
        
        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de contacto"));
        
        String direccion = JOptionPane.showInputDialog("Ingrese una direccion");
        
        String correo = JOptionPane.showInputDialog("Ingrese un correo electronico");

        return new Usuario(nombre, apellido, cedula, telefono, direccion, correo);
    }
    
}
