
package proyectofinal;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class ProyectoFinal {

    public static void main(String[] args) {
        System.out.println("Hola ");
        
        Scanner input = new Scanner(System.in);
        String nombre,apellido,direccion,correo,tipo,descripcion;
        int cedula,telefono,numSerie;
        double precio,medidas;
        ArrayList<Mueble> muebles = new ArrayList<>();
        String[] menuMuebles = {"Sillas","Mesas","Cristaleros","Espejos","Consolas"};
        Mueble[] sillas = new Mueble [5];
        Mueble[] mesas = new Mueble [5];
        Mueble[] cristaleros = new Mueble [5];
        Mueble[] espejos = new Mueble [5];
        Mueble[] consolas = new Mueble [5];
        
        Usuario usuario1 = MetodosPFinal.registrarUsuario();
        
        // Mostrar los datos del usuario registrado en un cuadro de diálogo
        String mensaje = "Registro completado:\n" +
                         "Nombre: " + usuario1.getNombre() + "\n" +
                         "Apellido: " + usuario1.getApellido() + "\n" +
                         "Cedula: " + usuario1.getCedula() + "\n" +
                         "Telefono: " + usuario1.getTelefono() + "\n" +
                         "Direccion: " + usuario1.getDireccion() + "\n" +
                         "Correo: " + usuario1.getCorreo();
        
        JOptionPane.showMessageDialog(null, mensaje, "Datos del Usuario", JOptionPane.INFORMATION_MESSAGE);
    }
        
        
      
    }
    
