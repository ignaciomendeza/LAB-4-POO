public class Contacto {
    
    //atributos
    String nombre;
    int telefono;

    //constructores 

    public Contacto() {
    }

    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }

    //Sets y gets
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    //toString

    @Override
    public String toString() {
        return "" +
            "\nNombre: " + getNombre() + "\n" +
            "Teléfono: " + getTelefono() + "\n" +
            "";
    }

}
