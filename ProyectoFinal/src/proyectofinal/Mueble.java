
package proyectofinal;

import javax.swing.ImageIcon;

public class Mueble {
    
    String tipo;
    int numSerie;
    double precio;
    String descripcion;
    String medidas;
    ImageIcon imagen;
    
    //Constructor
    
    public Mueble(String tipo, int numSerie, double precio, String descripcion, String medidas,ImageIcon imagen){
        
        this.tipo = tipo;
        this.numSerie = numSerie;
        this.precio = precio;
        this.descripcion = descripcion;
        this.medidas = medidas;
        this.imagen =  imagen;
        
    }

    public void setImagen(ImageIcon imagen) {
        this.imagen = imagen;
    }

    public ImageIcon getImagen() {
        return imagen;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNumSerie(int numSerie) {
        this.numSerie = numSerie;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMedidas(String medidas) {
        this.medidas = medidas;
    }
    

    public String getTipo() {
        return tipo;
    }

    public int getNumSerie() {
        return numSerie;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMedidas() {
        return medidas;
    }
    
    
}


