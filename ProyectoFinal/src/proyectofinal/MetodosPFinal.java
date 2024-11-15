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
        ImageIcon registro = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/registro.jpg"));
        ImageIcon logoCaramuru = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/logoCaramuru.jpg"));

        JOptionPane.showMessageDialog(null, "¡Hola buenos dias, bienvenido a la tienda online de Caramuru Muebles!\n"
                + "Primero le vamos a pedir si pudiera ingresar los siguientes datos",
                "Bienvenida", JOptionPane.INFORMATION_MESSAGE, logoCaramuru);

        String nombre = (String) JOptionPane.showInputDialog(null, "Ingrese su nombre", "Informacion Personal", JOptionPane.INFORMATION_MESSAGE, registro, null, null);
        String apellido = (String) JOptionPane.showInputDialog(null, "Ingrese su apellido", "Informacion Personal", JOptionPane.INFORMATION_MESSAGE, registro, null, null);

        int cedula = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Ingrese su cedula", "Informacion Personal", JOptionPane.INFORMATION_MESSAGE, registro, null, null));

        int telefono = Integer.parseInt((String) JOptionPane.showInputDialog(null, "Ingrese un numero de contacto", "Informacion Personal", JOptionPane.INFORMATION_MESSAGE, registro, null, null));

        String direccion = (String) JOptionPane.showInputDialog(null, "Ingrese una direccion", "Informacion Personal", JOptionPane.INFORMATION_MESSAGE, registro, null, null);

        String correo;
        while (true) {
            correo = (String) JOptionPane.showInputDialog(null, "Ingrese un correo electronico", "Informacion Personal", JOptionPane.INFORMATION_MESSAGE, registro, null, null);
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
        String mensaje = "Registro completado:\n"
                + "Nombre: " + usuario1.getNombre() + "\n"
                + "Apellido: " + usuario1.getApellido() + "\n"
                + "Cédula: " + usuario1.getCedula() + "\n"
                + "Teléfono: " + usuario1.getTelefono() + "\n"
                + "Dirección: " + usuario1.getDireccion() + "\n"
                + "Correo: " + usuario1.getCorreo();

        JOptionPane.showMessageDialog(null, mensaje, "Datos del Usuario", JOptionPane.INFORMATION_MESSAGE, registro);

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
    ImageIcon espejo1Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/espejo1.jpg"));
    ImageIcon espejo2Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/espejo2.jpg"));
    ImageIcon espejo3Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/espejo3.jpg"));
    ImageIcon espejo4Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/espejo4.jpg"));
    ImageIcon espejo5Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/espejo5.jpg"));
    ImageIcon silla1Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/silla1.jpg"));
    ImageIcon silla2Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/silla2.jpg"));
    ImageIcon silla3Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/silla3.jpg"));
    ImageIcon silla4Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/silla4.jpg"));
    ImageIcon silla5Icon = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/silla5.jpg"));
    ImageIcon mesaMenu = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/mesaMenu.jpg"));
    ImageIcon sillaMenu = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/sillaMenu.jpg"));
    ImageIcon espejoMenu = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/espejoMenu.jpg"));
    ImageIcon cristaleroMenu = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/cristaleroMenu.jpg"));
    ImageIcon consolaMenu = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/consolaMenu.jpg"));
    ImageIcon agregadoCarrito = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/agregadoCarrito.jpg"));
    ImageIcon sacarCarrito = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/sacarCarrito.jpg"));
    ImageIcon envio = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/envio.jpg"));
    ImageIcon verCarrito = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/vercarrito.jpg"));

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

    //silla
    Mueble silla1 = new Mueble("Silla", 16, 8600, "Silla Thonet Madera natural", "", silla5Icon);
    Mueble silla2 = new Mueble("Silla", 17, 5900, "Silla Thoner Respaldo en madera", "", silla4Icon);
    Mueble silla3 = new Mueble("Silla", 18, 4900, "Silla Roja Asiento de mimbre", "", silla3Icon);
    Mueble silla4 = new Mueble("Silla", 19, 5500, "Silla Tapizada Asiento color blanco", "", silla2Icon);
    Mueble silla5 = new Mueble("Silla", 20, 6900, "Silla Combinada tapizada en terciopelo", "", silla1Icon);

    //espejos
    Mueble espejo1 = new Mueble("Espejo", 21, 8500, "Espejo Cuadrado Marco antiguo", "40x40 de lado", espejo2Icon);
    Mueble espejo2 = new Mueble("Espejo", 22, 4500, "Espejo en Petibiri Marco de madera", "68x95 de alto", espejo4Icon);
    Mueble espejo3 = new Mueble("Espejo", 23, 5200, "Espejo Ovalado Marco antiguo", "68x101 de alto", espejo5Icon);
    Mueble espejo4 = new Mueble("Espejo", 24, 7500, "Espejo Rectamgular Marco de madera", "95x68 de alto", espejo3Icon);
    Mueble espejo5 = new Mueble("Espejo", 25, 12500, "Espejo Rectangular Alto con marco de madera", "50x120 de alto", espejo1Icon);

    // Método principal para mostrar el menú
    public static void mostrarMenuPrincipal() {
        ImageIcon menu = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/menu.jpg"));

        String[] opciones = {"Mesas", "Cristaleros", "Consolas", "Sillas", "Espejos", "Ver Carrito y Total", "Finalizar Compra"};
        String tipoSeleccionado = (String) JOptionPane.showInputDialog(
                null, "Seleccione el tipo de mueble o vea el carrito:", "Menú Principal",
                JOptionPane.QUESTION_MESSAGE, menu, opciones, opciones[0]);

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
                case "Sillas":
                    metodos.mostrarMenuSillas();
                    break;
                case "Espejos":
                    metodos.mostrarMenuEspejos();
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

    //Mostrar menu de espejos
    private void mostrarMenuEspejos() {
        Mueble[] espejos = {espejo1, espejo2, espejo3, espejo4, espejo5};
        mostrarMenuMuebles(espejos, "Espejos", espejoMenu);
    }

    //Mostrar menu de sillas
    private void mostrarMenuSillas() {
        Mueble[] sillas = {silla1, silla2, silla3, silla4, silla5};
        mostrarMenuMuebles(sillas, "Sillas", sillaMenu);
    }

    // Mostrar menú de mesas
    private void mostrarMenuMesas() {
        Mueble[] mesas = {mesa1, mesa2, mesa3, mesa4, mesa5};
        mostrarMenuMuebles(mesas, "Mesas", mesaMenu);
    }

    // Mostrar menú de cristaleros
    private void mostrarMenuCristaleros() {
        Mueble[] cristaleros = {cristalero1, cristalero2, cristalero3, cristalero4, cristalero5};
        mostrarMenuMuebles(cristaleros, "Cristaleros", cristaleroMenu);
    }

    // Mostrar menú de consolas
    private void mostrarMenuConsolas() {
        Mueble[] consolas = {consola1, consola2, consola3, consola4, consola5};
        mostrarMenuMuebles(consolas, "Consolas", consolaMenu);
    }

    // Menú genérico para mostrar opciones de muebles de un tipo específico
    private void mostrarMenuMuebles(Mueble[] muebles, String tipo, ImageIcon imagen) {
        String[] nombresMuebles = new String[muebles.length + 1];
        for (int i = 0; i < muebles.length; i++) {
            nombresMuebles[i] = muebles[i].getDescripcion();
        }
        nombresMuebles[muebles.length] = "Volver al Menú Principal";

        String muebleSeleccionado = (String) JOptionPane.showInputDialog(
                null, "Seleccione un " + tipo + ":", tipo + " Disponibles",
                JOptionPane.QUESTION_MESSAGE, imagen, nombresMuebles, nombresMuebles[0]);

        if (muebleSeleccionado != null) {
            if (muebleSeleccionado.equals("Volver al Menú Principal")) {
                mostrarMenuPrincipal();  // Llamamos al menú principal
            } else {
                for (int i = 0; i < muebles.length; i++) {
                    if (muebles[i].getDescripcion().equals(muebleSeleccionado)) {
                        mostrarDetallesMueble(muebles[i]);
                        break;  // Sale del ciclo una vez que encuentra el mueble
                    }
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
            JOptionPane.showMessageDialog(null, "Mueble agregado al carrito.", "Exito", JOptionPane.INFORMATION_MESSAGE, agregadoCarrito);
            mostrarMenuPrincipal();  // Volver al menú principal
        } else {
            mostrarMenuPrincipal();  // Volver al menú principal sin agregar
        }
    }

    // Método para ver el carrito y el total de la compra
    private static void verCarrito() {
        ImageIcon verCarrito = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/vercarrito.jpg"));
        
        String mensajeCarrito = "Carrito de compras:\n\n";
        for (int i = 0; i < carrito.size(); i++) {
            Mueble mueble = carrito.get(i);  // Accedemos al mueble usando el índice
            mensajeCarrito += mueble.getDescripcion() + " - $" + mueble.getPrecio() + "\n";
        }
        mensajeCarrito += "\nTotal de la compra: $" + totalCompra;
        JOptionPane.showMessageDialog(null, mensajeCarrito, "Carrito y Total", JOptionPane.INFORMATION_MESSAGE,verCarrito);

        mostrarMenuPrincipal();  // Volver al menú principal
    }

    private static void finalizarCompra() {
        ImageIcon verCarrito = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/vercarrito.jpg"));
        
        if (carrito.isEmpty()) {
            JOptionPane.showMessageDialog(null, "El carrito está vacío. Agregue productos antes de finalizar la compra.",
                    "Carrito vacío", JOptionPane.WARNING_MESSAGE);
            mostrarMenuPrincipal();
            return;
        }

        String mensajeCompra = "Productos en el carrito:\n";
        for (int i = 0; i < carrito.size(); i++) {
            Mueble mueble = carrito.get(i);  // Usamos el índice para obtener el mueble
            mensajeCompra += mueble.getDescripcion() + " - $" + mueble.getPrecio() + "\n";
        }
        mensajeCompra += "\nTotal de la compra: $" + totalCompra;

        String[] opciones = {"Finalizar Compra", "Modificar Carrito", "Volver al Menú Principal"};
        int seleccion = JOptionPane.showOptionDialog(null, mensajeCompra, "Resumen de Compra",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,verCarrito , opciones, opciones[0]);

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
        ImageIcon envio = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/envio.jpg"));
        ImageIcon retiro = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/retiro.jpg"));

        String[] opciones = {"Retiro en Local", "Envío a Domicilio"};
        int seleccion = JOptionPane.showOptionDialog(null, "¿Cómo desea recibir su compra?",
                "Método de Entrega", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
                null, opciones, opciones[0]);

        if (seleccion == 1) { // Envío a Domicilio
            String direccionConfirmada = JOptionPane.showInputDialog(null,
                    "Por favor confirme la dirección de envío:", "Confirmación de Dirección",
                    JOptionPane.QUESTION_MESSAGE, null, null, usuario.getDireccion()).toString();

            JOptionPane.showMessageDialog(null, "Gracias por su compra. Se enviará a la dirección: " + direccionConfirmada,
                    "Compra Finalizada", JOptionPane.INFORMATION_MESSAGE, envio);
        } else {
            JOptionPane.showMessageDialog(null, "Gracias por su compra. Puede retirar los productos en nuestro local.",
                    "Compra Finalizada", JOptionPane.INFORMATION_MESSAGE, retiro);
        }
    }

    // Modificar carrito eliminando un producto
    private static void modificarCarrito() {
        ImageIcon verCarrito = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/vercarrito.jpg"));
        
        ImageIcon sacarCarrito = new ImageIcon(MetodosPFinal.class.getResource("/imagenes/sacarCarrito.jpg"));
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
                JOptionPane.QUESTION_MESSAGE, verCarrito, productos, productos[0]);

        if (productoSeleccionado != null) {
            for (int i = 0; i < carrito.size(); i++) {
                Mueble mueble = carrito.get(i);  // Accedemos al mueble usando el índice
                if ((mueble.getDescripcion() + " - $" + mueble.getPrecio()).equals(productoSeleccionado)) {
                    carrito.remove(i);  // Eliminamos el mueble en la posición i
                    totalCompra -= mueble.getPrecio();
                    JOptionPane.showMessageDialog(null, "Producto eliminado del carrito.", "Eliminado", JOptionPane.INFORMATION_MESSAGE, sacarCarrito);
                    break;
                }
            }
        }
        finalizarCompra();  // Volver al menú de finalización de compra para ver los cambios
    }

}
