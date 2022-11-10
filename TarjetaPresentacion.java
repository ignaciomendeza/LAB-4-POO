/*
 * Oscar Flores, Ignacio Méndez y Ariela Mishaan
 * POO Sección 40
 * Laboratorio #4
 * 11-11-2022
 * Clase que modela una tarjeta de presentación
 */

public class TarjetaPresentacion {
    
    //atributos

    private String nombre;
    private String trabajo;
    private int telefono;
    private String correo;

    //constructores

    public TarjetaPresentacion() {
        nombre = "";
        trabajo = "";
        telefono = 0;
        correo = "";
    }

    public TarjetaPresentacion(String nombre, String trabajo, int telefono, String correo) {
        this.nombre = nombre;
        this.trabajo = trabajo;
        this.telefono = telefono;
        this.correo = correo;
    }

    //sets y gets

    /** Devuelve el nombre del dueño del teléfono
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** Cambia el nombre del dueño del teléfono
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    /** Devuelve el trabajo del dueño del teléfono
     * @return String
     */
    public String getTrabajo() {
        return this.trabajo;
    }

    
    /** Cambia el trabajo del dueño del teléfono
     * @param trabajo
     */
    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    
    /** Devuelve el número teléfonico del celular conectado al radio
     * @return int
     */
    public int getTelefono() {
        return this.telefono;
    }

    
    /** Cambia el número teléfonico del celular conectado al radio
     * @param telefono
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    
    /** Devuelve el correo electrónico del dueño del teléfono
     * @return String
     */
    public String getCorreo() {
        return this.correo;
    }

    
    /** Cambia el correo electrónico del dueño del teléfono
     * @param correo
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    //toString

    /** Devuelve todos los atributos de la clase con sus respectivos valores
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
