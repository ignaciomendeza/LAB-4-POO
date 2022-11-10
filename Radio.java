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
    private Cancion cancionActual;
    private Contacto ultimoContacto;
    private ArrayList <Cancion> listaReproduccionActual;
    private boolean telefonoConectado;

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
        cancionActual = new Cancion();
        ultimoContacto = new Contacto();
        listaReproduccionActual = new ArrayList <Cancion>();
        telefonoConectado = false;
    }

    public Radio(String banda, String frecuencia, float estacionActual, ArrayList<Contacto> listaContactos, 
        int modo, int volumen, ArrayList<ArrayList<Cancion>> listaListasReproduccion, ArrayList<TarjetaPresentacion> listaTarjetasPresentacion, 
        boolean encendido, ArrayList<Float> listaEmisoras, Cancion cancionActual, Contacto ultimoContacto, ArrayList<Cancion> listaReproduccionActual,
        boolean telefonoConectado) {
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
            this.cancionActual = cancionActual;
            this.ultimoContacto = ultimoContacto;
            this.listaReproduccionActual = listaReproduccionActual;
            this.telefonoConectado = telefonoConectado;
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
        String resultado = "";

        cancionActual = listaReproduccionActual.get(cancion-1);
        resultado = "\nSe ha puesto la canción " + cancionActual.getNombre();
        resultado = resultado + "\n" + this.toString();

        return resultado;
    }

    @Override
    public String conectar(int numeroTelefono) {
        // TODO Auto-generated method stub
        
        listaTarjetasPresentacion = new ArrayList<TarjetaPresentacion>();
        listaContactos = new ArrayList<Contacto>();
        listaListasReproduccion = new ArrayList<ArrayList<Cancion>>();

        //Archivo de tarjetas de presentación
        Archivo archivoTarjetasPresentacion = new Archivo("./tarjetasPresentacion" + numeroTelefono + ".csv");
        ArrayList<String>lineasTarjetas = archivoTarjetasPresentacion.leerArchivo();
        String [] tarjetaString = new String [4];

        for (String linea : lineasTarjetas) {
            
            tarjetaString = linea.split(",");
            String nombre = tarjetaString[0];
            String trabajo = tarjetaString[1];
            int telefono = Integer.valueOf(tarjetaString[2]);
            String correo = tarjetaString[3];

            TarjetaPresentacion tarjetaPresentacion = new TarjetaPresentacion(nombre, trabajo, telefono, correo);
            listaTarjetasPresentacion.add(tarjetaPresentacion);
        }

        //Archivo de contactos
        Archivo archivoContactos = new Archivo("./contactos" + numeroTelefono + ".csv");
        ArrayList<String> lineasContactos = archivoContactos.leerArchivo();
        String[] contactoString = new String[2];

        for (String linea : lineasContactos) {
            
            contactoString = linea.split(",");
            String nombre = contactoString[0];
            int telefono = Integer.valueOf(contactoString[1]);

            Contacto contacto = new Contacto(nombre, telefono);
            listaContactos.add(contacto);
        }

        //Archivo de canciones 1 
        Archivo archivoCanciones1 = new Archivo("./canciones" + numeroTelefono + "_1.csv");
        ArrayList<Cancion> playList1 = new ArrayList<Cancion>();
        ArrayList<String> lineasCanciones1 = archivoCanciones1.leerArchivo();
        String[] cancionString = new String[2];

        for (String linea : lineasCanciones1) {
            
            cancionString = linea.split(",");
            String cantante = cancionString[0];
            float duracion = Float.valueOf(cancionString[1]);
            String nombre = cancionString[2];
            String genero = cancionString[3];

            Cancion cancion = new Cancion(cantante, duracion, nombre, genero);
            playList1.add(cancion);
        }
        listaListasReproduccion.add(playList1);

        //Archivo de canciones 2
        Archivo archivoCanciones2 = new Archivo("./canciones" + numeroTelefono + "_2.csv");
        ArrayList<Cancion> playList2 = new ArrayList<Cancion>();
        ArrayList<String> lineasCanciones2 = archivoCanciones2.leerArchivo();
        String[] cancionString2 = new String[2];

        for (String linea : lineasCanciones2) {
            
            cancionString2 = linea.split(",");
            String cantante = cancionString2[0];
            float duracion = Float.valueOf(cancionString2[1]);
            String nombre = cancionString2[2];
            String genero = cancionString2[3];

            Cancion cancion = new Cancion(cantante, duracion, nombre, genero);
            playList2.add(cancion);
        }
        listaListasReproduccion.add(playList2);
        
        telefonoConectado = true;
        String resultado = "\nSe ha conectado el teléfono.";
        return resultado;
    }

    @Override
    public String desconectar() {
        // TODO Auto-generated method stub
        String resultado = "";
        
        if(telefonoConectado == false){
            resultado = "\nNo hay ningún teléfono conectado, no se puede desconectar.";
        }
        else{
            listaTarjetasPresentacion = new ArrayList<TarjetaPresentacion>();
            listaContactos = new ArrayList<Contacto>();
    
            telefonoConectado = false;
            resultado = "\nSe ha desconectado el teléfono. Ya no hay contactos ni listas de presentación para mostrar.";
        }
        return resultado;
    }

    @Override
    public String desplegarCanciones() {
        // TODO Auto-generated method stub
        String resultado = "";
        
        if(listaReproduccionActual.size() == 0){
            resultado = "\nNo se está reproduciendo ninguna lista o no hay canciones en ella.";
        }
        else{
            int i = 1;
            resultado = "\n--- CANCIONES ---\n";
            for (Cancion cancion : listaReproduccionActual) {
                resultado = resultado + i + ". " + cancion.getNombre() + " - " + cancion.getCantante();
                i++;
            }
        }

        return resultado;
    }

    @Override
    public String desplegarContactos() {
        // TODO Auto-generated method stub
        String resultado = "";

        if(telefonoConectado = false){
            resultado = "\nNo hay ningún teléfono conectado. No se pueden mostrar contactos.";
        }
        else{
            int i = 0;
            resultado = "\n--- CONTACTOS ---\n";
            for (Contacto contacto : listaContactos) {
                resultado = resultado + i + ". " + contacto.getNombre() + ": " + contacto.getTelefono();
                i++;
            }
        }
        return resultado;
    }

    @Override
    public String encenderApagar() {
        // TODO Auto-generated method stub
        String resultado = "";

        if(encendido == true){
            encendido = false;
            resultado = "\nSe ha apagado el radio.";
        }
        if(encendido == false){
            encendido = true;
            resultado = "\nSe ha encendido el radio.";
        }
        return resultado;
    }

    @Override
    public String llamarColgar(int opcion, int contacto) {
        // TODO Auto-generated method stub
        String resultado = "";

        if(telefonoConectado == false){
            resultado = "\nNo hay ningún teléfono conectado. No se puede realizar una llamada.";
        }
        else{
            Contacto contactoActual = listaContactos.get(contacto);
            switch (opcion) {
                case 1://llamar
                    resultado = "\nLlamando a " + contactoActual.getTelefono() + " (" + contactoActual.getNombre() + ")" + "...";
                    break;

                case 2://colgar
                    resultado = "\nSe ha colgado la llamada con " + contactoActual.getTelefono() + " (" + contactoActual.getNombre() + ")" + "...";
                    break;
            
                default:
                    break;
            }
        }
        return null;
    }

    @Override
    public String desplegarTarjetas() {
        // TODO Auto-generated method stub
        String resultado = "";

        if(telefonoConectado == false){
            resultado = "\nNo hay ningún teléfono conectado. No se pueden mostrar las tarjetas de presentación.";
        }
        else{
            int i = 0;
            resultado = "\n--- TARJETAS DE PRESENTACIÓN ---\n";
            for (TarjetaPresentacion tarjeta : listaTarjetasPresentacion) {
                resultado = resultado + i + ". " + tarjeta.toString();
                i++;
            }
        }
        return resultado;
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
