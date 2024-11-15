package proyectofinal;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class MetodosPFinal {
    // Carrito de compras
    private static ArrayList<Mueble> carrito = new ArrayList<>();
    private static double totalCompra = 0.0;
    private static Usuario usuario;
    
    //Metodo para registrar al usuario, devuelve un objeto de valor usuario
    public static Usuario registrarUsuario() {
        JOptionPane.showMessageDialog(null, "¡Hola buenos dias, bienvenido a la tienda online de Caramuru Muebles!\n"
                + "Primero le vamos a pedir si pudiera ingresar los siguientes datos",
                "Bienvenida", JOptionPane.INFORMATION_MESSAGE);

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        String apellido = JOptionPane.showInputDialog("Ingrese su apellido");

        int cedula = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su cedula"));

        int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero de contacto"));

        String direccion = JOptionPane.showInputDialog("Ingrese una direccion");

        String correo;
        while (true) {
            correo = JOptionPane.showInputDialog("Ingrese un correo electronico");
            if (correo.contains("@")) {
                break;  // Si el correo contiene "@", continúa con el registro
            } else {
                JOptionPane.showMessageDialog(null, "Correo inválido. Asegúrese de que contenga '@'.",
                        "Error de validación", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        Usuario usuario1 = new Usuario(nombre, apellido, cedula, telefono, direccion, correo);
    usuario = usuario1;  // Asignar el usuario registrado a la variable estática para todo el programa

    // Mostrar los datos del usuario registrado en un cuadro de diálogo
    String mensaje = "Registro completado:\n" +
                     "Nombre: " + usuario1.getNombre() + "\n" +
                     "Apellido: " + usuario1.getApellido() + "\n" +
                     "Cédula: " + usuario1.getCedula() + "\n" +
                     "Teléfono: " + usuario1.getTelefono() + "\n" +
                     "Dirección: " + usuario1.getDireccion() + "\n" +
                     "Correo: " + usuario1.getCorreo();

    JOptionPane.showMessageDialog(null, mensaje, "Datos del Usuario", JOptionPane.INFORMATION_MESSAGE);

    return usuario1;
}
        
        

        
    

    //imagenes
    ImageIcon mesa1Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/mesa1.jpg"));
    ImageIcon mesa2Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/mesa2.jpg"));
    ImageIcon mesa3Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/mesa3.jpg"));
    ImageIcon mesa4Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/mesa4.jpg"));
    ImageIcon mesa5Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/mesa5.jpg"));
    ImageIcon cristalero1Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/cristalero1.jpg"));
    ImageIcon cristalero2Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/cristalero2.jpg"));
    ImageIcon cristalero3Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/cristalero3.jpg"));
    ImageIcon cristalero4Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/cristalero4.jpg"));
    ImageIcon cristalero5Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/cristalero5.jpg"));
    ImageIcon consola1Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/consola1.jpg"));
    ImageIcon consola2Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/consola2.jpg"));
    ImageIcon consola3Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/consola3.jpg"));
    ImageIcon consola4Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/consola4.jpg"));
    ImageIcon consola5Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/consola5.jpg"));

    //Mesas
    Mueble mesa1 = new Mueble("Mesa", 1, 35900, "Mesa de marmol negro", "180x90", mesa1Icon);
    Mueble mesa2 = new Mueble("Mesa", 2, 19900, "Mesa nueva para 2", "60x80x78 de altura", mesa2Icon);
    Mueble mesa3 = new Mueble("Mesa", 3, 15900, "Mesa curva de lapacho", "150x56 de ancho cada mesa", mesa3Icon);
    Mueble mesa4 = new Mueble("Mesa", 4, 18900, "Mesa redonda", "120 de diametro", mesa4Icon);
    Mueble mesa5 = new Mueble("Mesa", 5, 21900, "Mesa redonda de cedro y rattan", "125 de diametro", mesa5Icon);

    //Cristaleros
    Mueble cristalero1 = new Mueble("Cristalero", 6, 29900, "Biblioteca marron oscuro", "220x120x40", cristalero1Icon);
    Mueble cristalero2 = new Mueble("Cristalero", 7, 31900, "Cristalero en roble", "largo 84 x 240 altura x 65 prof", cristalero2Icon);
    Mueble cristalero3 = new Mueble("Cristalero", 8, 34900, "Cristalero curvo", "largo 118, altura 218, profundidad 56", cristalero3Icon);
    Mueble cristalero4 = new Mueble("Cristalero", 9, 23900, "Cristalero negro", "largo 79x42 prof x 184 altura", cristalero4Icon);
    Mueble cristalero5 = new Mueble("Cristalero", 10, 31900, "Aparador", "180x50 prof abajo x 25 prof arriba x 217 altura", cristalero5Icon);

    //Consolas
    Mueble consola1 = new Mueble("Consola", 11, 13900, "Consola con esterilla", "129x43x74 de altura", consola1Icon);
    Mueble consola2 = new Mueble("Consola", 12, 13900, "Consola en eucalipto", "140x40x85 de alto", consola2Icon);
    Mueble consola3 = new Mueble("Consola", 13, 18900, "Consola en lapacho", "110x130x40", consola3Icon);
    Mueble consola4 = new Mueble("Consola", 14, 18900, "Consola con velas", "150x45x79 de altura", consola4Icon);
    Mueble consola5 = new Mueble("Consola", 15, 18900, "Consola de teca", "150x45x78 de altura", consola5Icon);

    

    // Método principal para mostrar el menú
    public static void mostrarMenuPrincipal() {
        String[] opciones = {"Mesas", "Cristaleros", "Consolas", "Ver Carrito y Total", "Finalizar Compra"};
        String tipoSeleccionado = (String) JOptionPane.showInputDialog(
                null, "Seleccione el tipo de mueble o vea el carrito:", "Menú Principal",
                JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]);

        if (tipoSeleccionado != null) {
            MetodosPFinal metodos = new MetodosPFinal();  // Crear una instancia para acceder a los muebles
            switch (tipoSeleccionado) {
                case "Mesas":
                    metodos.mostrarMenuMesas();
                    break;
                case "Cristaleros":
                    metodos.mostrarMenuCristaleros();
                    break;
                case "Consolas":
                    metodos.mostrarMenuConsolas();
                    break;
                case "Ver Carrito y Total":
                    verCarrito();
                    break;
                case "Finalizar Compra":
                    finalizarCompra();
                    break;
            }
        }
    }

    // Mostrar menú de mesas
    private void mostrarMenuMesas() {
        Mueble[] mesas = {mesa1, mesa2, mesa3, mesa4, mesa5};
        mostrarMenuMuebles(mesas, "Mesas");
    }

    // Mostrar menú de cristaleros
    private void mostrarMenuCristaleros() {
        Mueble[] cristaleros = {cristalero1, cristalero2, cristalero3, cristalero4, cristalero5};
        mostrarMenuMuebles(cristaleros, "Cristaleros");
    }

    // Mostrar menú de consolas
    private void mostrarMenuConsolas() {
        Mueble[] consolas = {consola1, consola2, consola3, consola4, consola5};
        mostrarMenuMuebles(consolas, "Consolas");
    }

    // Menú genérico para mostrar opciones de muebles de un tipo específico
    private void mostrarMenuMuebles(Mueble[] muebles, String tipo) {
        String[] nombresMuebles = new String[muebles.length];
        for (int i = 0; i < muebles.length; i++) {
            nombresMuebles[i] = muebles[i].getDescripcion();
        }

        String muebleSeleccionado = (String) JOptionPane.showInputDialog(
                null, "Seleccione un " + tipo + ":", tipo + " Disponibles",
                JOptionPane.QUESTION_MESSAGE, null, nombresMuebles, nombresMuebles[0]);

        if (muebleSeleccionado != null) {
            for (Mueble mueble : muebles) {
                if (mueble.getDescripcion().equals(muebleSeleccionado)) {
                    mostrarDetallesMueble(mueble);
                    break;
                }
            }
        }
    }

    // Método para mostrar los detalles de un mueble y agregar al carrito
    private void mostrarDetallesMueble(Mueble mueble) {
        String[] opciones = {"Agregar al carrito", "Volver al menú principal"};
        int seleccion = JOptionPane.showOptionDialog(null,
                "Descripción: " + mueble.getDescripcion() + "\n"
                + "Medidas: " + mueble.getMedidas() + "\n"
                + "Precio: $" + mueble.getPrecio(),
                "Detalles del Mueble", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                mueble.getImagen(), opciones, opciones[0]);

        if (seleccion == 0) { // Si elige "Agregar al carrito"
            carrito.add(mueble);
            totalCompra += mueble.getPrecio();
            JOptionPane.showMessageDialog(null, "Mueble agregado al carrito.");
            mostrarMenuPrincipal();  // Volver al menú principal
        } else {
            mostrarMenuPrincipal();  // Volver al menú principal sin agregar
        }
    }

    // Método para ver el carrito y el total de la compra
    private static void verCarrito() {
        String mensajeCarrito = "Carrito de compras:\n\n";
        for (Mueble mueble : carrito) {
            mensajeCarrito += mueble.getDescripcion() + " - $" + mueble.getPrecio() + "\n";
        }
        mensajeCarrito += "\nTotal de la compra: $" + totalCompra;
        JOptionPane.showMessageDialog(null, mensajeCarrito, "Carrito y Total", JOptionPane.INFORMATION_MESSAGE);

        mostrarMenuPrincipal();  // Volver al menú principal
    }

    private static void finalizarCompra() {
        if (carrito.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El carrito está vacío. Agregue productos antes de finalizar la compra.",
                    "Carrito vacío", JOptionPane.WARNING_MESSAGE);
            mostrarMenuPrincipal();
            return;
        }

        String mensajeCompra = "Productos en el carrito:\n";
        for (Mueble mueble : carrito) {
            mensajeCompra += mueble.getDescripcion() + " - $" + mueble.getPrecio() + "\n";
        }
        mensajeCompra += "\nTotal de la compra: $" + totalCompra;

        String[] opciones = {"Finalizar Compra", "Modificar Carrito", "Volver al Menú Principal"};
        int seleccion = JOptionPane.showOptionDialog(null, mensajeCompra, "Resumen de Compra",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opciones, opciones[0]);

        if (seleccion == 0) {  // Finalizar compra
            confirmarEntrega();
        } else if (seleccion == 1) {  // Modificar carrito
            modificarCarrito();
        } else {
            mostrarMenuPrincipal();
        }
    }
    // Confirmar método de entrega

    private static void confirmarEntrega() {
        String[] opciones = {"Retiro en Local", "Envío a Domicilio"};
        int seleccion = JOptionPane.showOptionDialog(null, "¿Cómo desea recibir su compra?",
                "Método de Entrega", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, opciones, opciones[0]);

        if (seleccion == 1) { // Envío a Domicilio
            String direccionConfirmada = JOptionPane.showInputDialog(null,
                    "Por favor confirme la dirección de envío:", "Confirmación de Dirección",
                    JOptionPane.QUESTION_MESSAGE, null, null, usuario.getDireccion()).toString();

            JOptionPane.showMessageDialog(null, "Gracias por su compra. Se enviará a la dirección: " + direccionConfirmada,
                    "Compra Finalizada", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Gracias por su compra. Puede retirar los productos en nuestro local.",
                    "Compra Finalizada", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    // Modificar carrito eliminando un producto
    private static void modificarCarrito() {
        if (carrito.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El carrito está vacío. No hay productos para eliminar.",
                    "Carrito vacío", JOptionPane.WARNING_MESSAGE);
            finalizarCompra();
            return;
        }

        String[] productos = new String[carrito.size()];
        for (int i = 0; i < carrito.size(); i++) {
            productos[i] = carrito.get(i).getDescripcion() + " - $" + carrito.get(i).getPrecio();
        }

        String productoSeleccionado = (String) JOptionPane.showInputDialog(
                null, "Seleccione el producto que desea eliminar:", "Modificar Carrito",
                JOptionPane.QUESTION_MESSAGE, null, productos, productos[0]);

        if (productoSeleccionado != null) {
            for (Mueble mueble : carrito) {
                if ((mueble.getDescripcion() + " - $" + mueble.getPrecio()).equals(productoSeleccionado)) {
                    carrito.remove(mueble);
                    totalCompra -= mueble.getPrecio();
                    JOptionPane.showMessageDialog(null, "Producto eliminado del carrito.");
                    break;
                }
            }
        }
        finalizarCompra();  // Volver al menú de finalización de compra para ver los cambios
    }

    
}
