public class Contacto {
    private String nombre;
    private int telefono;
    
    public Contacto() {
        this.nombre = "";
        this.telefono = 0;
    }
    
    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    
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
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n" +
            "Teléfono: " + getTelefono() + "\n";
    }
}
