public class Cancion {
    
    //atributos
    String cantante;
    float duracion;
    String nombre;
    String genero;

    //constructores

    public Cancion() {
    }

    public Cancion(String cantante, float duracion, String nombre, String genero) {
        this.cantante = cantante;
        this.duracion = duracion;
        this.nombre = nombre;
        this.genero = genero;
    }


    //Sets y gets
    public String getCantante() {
        return this.cantante;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public float getDuracion() {
        return this.duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    //toString

    @Override
    public String toString() {
        return "" +
            "\nCantante: " + getCantante() + "\n" +
            "Duración: '" + getDuracion() + "\n" +
            "Nombre: " + getNombre() + "\n" +
            "Género: " + getGenero() + "\n" +
            "";
    }


    
}

