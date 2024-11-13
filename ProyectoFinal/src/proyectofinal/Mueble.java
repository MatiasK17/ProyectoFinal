
package proyectofinal;

public class Mueble {
    
    String tipo;
    int numSerie;
    double precio;
    String descripcion;
    double medidas;
    
    //Constructor
    
    public Mueble(String tipo, int numSerie, double precio, String descripcion, double medidas){
        
        this.tipo = tipo;
        this.numSerie = numSerie;
        this.precio = precio;
        this.descripcion = descripcion;
        this.medidas = medidas;
        
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

    public void setMedidas(double medidas) {
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

    public double getMedidas() {
        return medidas;
    }
    
    
}


