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

    /** Devuelve el nombre del cantante
     * @return String
     */
    public String getCantante() {
        return this.cantante;
    }

    
    /** Cambia el nombre del cantante
     * @param cantante
     */
    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    
    /** Devuelve la duración de la canción
     * @return float
     */
    public float getDuracion() {
        return this.duracion;
    }
    
    
    /** Cambia la duración de la canción
     * @param duracion
     */
    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }
    
    
    /** Devuelve el nombre de la canción
     * @return String
     */
    public String getNombre() {
        return this.nombre;
    }

    
    /** Cambia el nombre de la canción
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    /** Devuelve el género musical de la canción
     * @return String
     */
    public String getGenero() {
        return this.genero;
    }
    
    
    /** Cambia el género musical de la canción
     * @param genero
     */
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    //toString
    
    /** Devuelve todos los atributos de la clase con sus respectivos valores
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
