public class PorSiAcaso {
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
    private Cancion cancionActual;
    private Contacto ultimoContacto;
    private ArrayList <Cancion> listaReproduccionActual;

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
        cancionActual = new Cancion();
        ultimoContacto = new Contacto();
        listaReproduccionActual = new ArrayList <Cancion>();
    }

    public Radio(String banda, String frecuencia, float estacionActual, ArrayList<Contacto> listaContactos, 
        int modo, int volumen, ArrayList<ArrayList<Cancion>> listaListasReproduccion, ArrayList<TarjetaPresentacion> listaTarjetasPresentacion, 
        boolean encendido, Cancion cancionActual, Contacto ultimoContacto, ArrayList<Cancion> listaReproduccionActual) {
            this.banda = banda;
            this.frecuencia = frecuencia;
            this.estacionActual = estacionActual;
            this.listaContactos = listaContactos;
            this.modo = modo;
            this.volumen = volumen;
            this.listaListasReproduccion = listaListasReproduccion;
            this.listaTarjetasPresentacion = listaTarjetasPresentacion;
            this.encendido = encendido;
            this.cancionActual = cancionActual;
            this.ultimoContacto = ultimoContacto;
            this.listaReproduccionActual = listaReproduccionActual;
    }


    //métodos 

    @Override
    public String cambiarVolumen(int subirBajar) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String cambiarRadio() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String cambiarEmisora(int subirBajar) {
        // TODO Auto-generated method stub
        return null;
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
    public String desconectar() {
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
    public String toString(){
        String resultado = "\n--------- RADIO ---------";
        
        switch (modo) {
            case 1:
                resultado = resultado  + "\nMODO RADIO" + 
                    "\nVolumen: " + volumen + 
                    "\nBanda: " + banda + 
                    "\nFrecuencia: " + frecuencia +
                    "\nEmisora: " + estacionActual;
                break;

            case 2:
                resultado = resultado  + "\nMODO REPRODUCCIÓN" + 
                    "\nVolumen: " + volumen + 
                    "\nCanción que se está reproduciendo: " + cancionActual.toString();
                break;

            case 3:
                resultado = resultado  + "\nMODO TELÉFONO" + 
                    "\nVolumen: " + volumen +
                    "\nÚltimo contacto con el que se habló: " + ultimoContacto;
                break;

            case 4:
                resultado = resultado  + "\nMODO PRODUCTIVIDAD" + 
                    "\nVolumen: " + volumen + 
                    "\nMi Tarjeta de presentación: " + listaTarjetasPresentacion.get(0).toString();
                break;
        
            default:
                break;
        }
        
        return resultado;
    }
    
}

}
