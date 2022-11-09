public class TarjetaPresentacion {
    String nombre;
    String trabajo;
    int telefono;
    String correo;

    public TarjetaPresentacion() {
    }

    @Override
    public String toString() {
        return "{" +
            " nombre='" + getNombre() + "'" +
            ", trabajo='" + getTrabajo() + "'" +
            ", telefono='" + getTelefono() + "'" +
            ", correo='" + getCorreo() + "'" +
            "}";
    }

    public TarjetaPresentacion(String nombre, String trabajo, int telefono, String correo) {
        this.nombre = nombre;
        this.trabajo = trabajo;
        this.telefono = telefono;
        this.correo = correo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTrabajo() {
        return this.trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public int getTelefono() {
        return this.telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }


    
}
