public class TarjetaPresentacion {
    
    //atributos

    private String nombre;
    private String trabajo;
    private int telefono;
    private String correo;

    //constructores

    public TarjetaPresentacion() {
    }

    public TarjetaPresentacion(String nombre, String trabajo, int telefono, String correo) {
        this.nombre = nombre;
        this.trabajo = trabajo;
        this.telefono = telefono;
        this.correo = correo;
    }

    //sets y gets

    /** 
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** 
     * @return String
     */
    public String getTrabajo() {
        return this.trabajo;
    }

    
    /** 
     * @param trabajo
     */
    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    
    /** 
     * @return int
     */
    public int getTelefono() {
        return this.telefono;
    }

    
    /** 
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    /** 
     * @return String
     */
    public String getCorreo() {
        return this.correo;
    }

    
    /** 
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

     /** 
     * @return String
     */
    @Override
    public String toString() {
        return "" +
            "\nNombre: " + getNombre() + "\n" +
            "Trabajo: " + getTrabajo() + "\n" +
            "Teléfono: " + getTelefono() + "\n" +
            "Correo: " + getCorreo() + "\n" +
            "";
    }

    
}
