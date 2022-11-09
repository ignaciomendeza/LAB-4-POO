import java.util.ArrayList;

/*
 * Oscar Flores, Ignacio Méndez y Ariela Mishaan
 * POO Sección 40
 * Laboratorio #4
 * 11-11-2022
 * Clase que modela la Radio. Es la controladora.
 */

public class Radio implements InterfaceB{

    //atributos
    private String banda;
    private String frecuencia;
    private float estacionActual;
    private ArrayList<Contacto> listaContactos;
    private int modo;
    private int volumen;
    private ArrayList <ArrayList<Cancion>> listaListasReproduccion;
    private ArrayList <TarjetaPresentacion> listaTarjetasPresentacion;
    private boolean encendido;
    private ArrayList<Float> listaEmisoras;

    //constructores

    public Radio() {
        banda = "";
        frecuencia = "";
        estacionActual = 0;
        listaContactos = new ArrayList<Contacto>();
        modo = 0;
        volumen = 0;
        listaListasReproduccion = new ArrayList<ArrayList<Cancion>>();
        listaTarjetasPresentacion = new ArrayList<TarjetaPresentacion>();
        encendido = false;
        listaEmisoras = new ArrayList<Float>();
    }

    public Radio(String banda, String frecuencia, float estacionActual, ArrayList<Contacto> listaContactos, int modo, int volumen, ArrayList<ArrayList<Cancion>> listaListasReproduccion, ArrayList<TarjetaPresentacion> listaTarjetasPresentacion, boolean encendido, ArrayList<Float> listaEmisoras) {
        this.banda = banda;
        this.frecuencia = frecuencia;
        this.estacionActual = estacionActual;
        this.listaContactos = listaContactos;
        this.modo = modo;
        this.volumen = volumen;
        this.listaListasReproduccion = listaListasReproduccion;
        this.listaTarjetasPresentacion = listaTarjetasPresentacion;
        this.encendido = encendido;
        this.listaEmisoras = listaEmisoras;
    }


    //métodos 

    @Override
    public String cambiarVolumen(int subirBajar) {
        // TODO Auto-generated method stub
        String resultado = "";
        switch(subirBajar){
            case 1:{
                this.volumen = this.volumen + 1;
                resultado = resultado + "Se ha subido el volumen.";
            }
            case 2:{
                this.volumen = this.volumen - 1;
                resultado = resultado + "Se ha bajado el volumen.";
            }
        }
        return resultado + "\n" + this.toString();
    }

    @Override
    public String cambiarRadio() {
        // TODO Auto-generated method stub
        String resultado = "";
        if (this.banda.equalsIgnoreCase("FM")){
            this.banda = "AM";
            resultado = resultado + "Se ha cambiado a 'AM'.";
        }

        else if (this.banda.equalsIgnoreCase("AM")){
            this.banda = "FM";
            resultado = resultado + "Se ha cambiado a 'FM'.";
        }
        return resultado  + "\n" + this.toString();
    }

    @Override
    public String cambiarEmisora(int subirBajar) {
        // TODO Auto-generated method stub
        switch(subirBajar){
            case 1:{
                this.estacionActual = (float) (this.estacionActual + 0.5);
            }
            case 2:{
                this.estacionActual = (float) (this.estacionActual - 0.5);
            }
        }
        return this.toString();
    }

    @Override
    public void guardarEmisora() {
        // TODO Auto-generated method stub
        
        
    }

    @Override
    public String cargarEmisora(int numeroEmisora) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String desplegarEmisoras() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String desplegarListas() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String cambiarModo(int modo) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String seleccionarLista(int lista) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String cambiarCancion(int subirBajar) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String escucharCancion(int cancion) {
        // TODO Auto-generated method stub

        return null;
    }

    @Override
    public String conectar(int numeroTelefono) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String desplegarCanciones() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String desplegarContactos() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String encenderApagar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String llamarColgar(int opcion, int contacto) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String desplegarTarjetas() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String desconectar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String toString(){
        return null;
    }
    
}
