/*
 * Oscar Flores, Ignacio Méndez y Ariela Mishaan
 * POO Sección 40
 * Laboratorio #4
 * 11-11-2022
 * Clase que modela una canción
 */

public class Cancion {
    
    //atributos
    
    private String cantante;
    private float duracion;
    private String nombre;
    private String genero;
    
    //atributos

    public Cancion() {
        this.cantante = "";
        this.duracion = 0;
        this.nombre = "";
        this.genero = "";
    }

    public Cancion(String cantante, float duracion, String nombre, String genero) {
        this.cantante = cantante;
        this.duracion = duracion;
        this.nombre = nombre;
        this.genero = genero;
    }

    //métodos

    /** 
     * @return String
     */
    public String getCantante() {
        return this.cantante;
    }

    
    /** 
     * @param cantante
     */
    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    
    /** 
     * @return float
     */
    public float getDuracion() {
        return this.duracion;
    }
    
    
    /** 
     * @param duracion
     */
    public void setDuracion(float duracion) {
        this.duracion = duracion;
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
     * @return String
     */
    public String getGenero() {
        return this.genero;
    }
    
    
    /** 
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //toString
    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Cantante: " + getCantante() + "\n" +
            "Duración: " + getDuracion() + "\n" +
            "Nombre: " + getNombre() + "\n" +
            "Género: " + getGenero() + "\n";
    }
    
}
