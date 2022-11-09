/*
 * Oscar Flores, Ignacio Méndez y Ariela Mishaan
 * POO Sección 40
 * Laboratorio #4
 * 11-11-2022
 * Clase que modela un contacto
 */

public class Contacto {
    
    //atributos 

    private String nombre;
    private int telefono;
    
    //constructores

    public Contacto() {
        this.nombre = "";
        this.telefono = 0;
    }
    
    public Contacto(String nombre, int telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    
    //métodos, sets y gets

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
    
    //toString
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "\n" +
            "Teléfono: " + getTelefono() + "\n";
    }
}
