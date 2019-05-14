
package entidades;

public class Ropa {

    String nombre;
    String descripcion; 
    
    public Ropa (String pnombre, String pdescripcion) {
        setDescripcion(pdescripcion);
        setNombre(pnombre);
               
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
