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
        banda = "FM";
        frecuencia = "90 megahercios";
        estacionActual = (float)0.5;
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

    /** 
     * @param subirBajar
     * @return String
     * Sirve para subir y bajar el volumen. 
     */

    @Override
    public String cambiarVolumen(int subirBajar) {
        // TODO Auto-generated method stub
        String resultado = "";
        switch(subirBajar){
            case 1:{
                this.volumen = this.volumen + 1;
                resultado = resultado + "Se ha subido el volumen.";
                break;
            }
            case 2:{
                this.volumen = this.volumen - 1;
                resultado = resultado + "Se ha bajado el volumen.";
                break;
            }
        }
        return resultado + "\n" + this.toString();
    }

    
    /** 
     * @return String
     * Sirve para cambiar de FM a AM, cuando se está en el modo de radio
     */
    @Override
    public String cambiarRadio() {
        // TODO Auto-generated method stub
        String resultado = "";
        if (this.banda.equalsIgnoreCase("FM")){
            this.banda = "AM";
            resultado = resultado + "\nSe ha cambiado a 'AM'.";
        }

        else if (this.banda.equalsIgnoreCase("AM")){
            this.banda = "FM";
            resultado = resultado + "\nSe ha cambiado a 'FM'.";
        }
        return resultado  + "\n" + this.toString();
    }

    
    /** 
     * @param subirBajar
     * @return String
     * Sirve para subir o bajar 0.5 de la emisora en la que se está
     */
    @Override
    public String cambiarEmisora(int subirBajar) {
        // TODO Auto-generated method stub
        String resultado = "";

        switch(subirBajar){
            case 1:{
                this.estacionActual = (float) (this.estacionActual + 0.5);
                break;
            }
            case 2:{
                if(estacionActual <= 0.5){
                    resultado = "No se puede bajar más de emisora.";
                }
                else{
                    this.estacionActual = (float) (this.estacionActual - 0.5);
                }
                break;
            }
        }
        resultado = resultado + "\n" + this.toString();
        
        return resultado;
    }

    /**
     * Sirve para guardar la emisora actual en la lista de emisoras favoritas.
     */
    @Override
    public void guardarEmisora() {
        // TODO Auto-generated method stub
        this.listaEmisoras.add(estacionActual);
    }

    
    /** 
     * @param numeroEmisora
     * @return String
     * Sirve para buscar una emisora y ponerla en el radio. 
     */
    @Override
    public String cargarEmisora(int numeroEmisora) {
        // TODO Auto-generated method stub
        this.estacionActual = listaEmisoras.get(numeroEmisora-1);
        return "Sintonizando..." + "\n" + this.toString();
    }

    
    /** 
     * @return String
     * Sirve para desplegar todas las emisoras que hay en la lista de emisoras favoritas.
     */
    @Override
    public String desplegarEmisoras() {
        // TODO Auto-generated method stub
        String resultado = "";

        if (this.listaEmisoras.size() != 0){
            resultado = resultado + "\n--- EMISORAS ---\n";
            for (int i = 0; i < listaEmisoras.size(); i++){
                float actual = listaEmisoras.get(i);
                resultado = resultado + (i+1) + ") " + actual + "\n";
            }
        }
        else{
            resultado = resultado + "\nNo ha guardado ninguna emisora.";
        }
        return resultado;
    }

    
    /** 
     * @return String
     * Sirve para desplegar todas las listas de reproducción del teléfono conectado
     */
    @Override
    public String desplegarListas(String archivo) {
        // TODO Auto-generated method stub
        String resultado = "";
        if (this.listaListasReproduccion.size() != 0){
            
            resultado = "\n--- LISTAS DE REPRODUCCIÓN ---\n";
            for (int i = 0; i < listaListasReproduccion.size(); i++){
                ArrayList<Cancion> actual = listaListasReproduccion.get(i);
                resultado = resultado + "\nLista " + (i+1) + ":\n";
                for (int j = 0; j < actual.size(); j++){
                    Cancion actual2 = actual.get(j);
                    resultado = resultado + "  - " + actual2.getNombre() + "\n";

                }
            }
        }
        else{
            resultado = resultado + "\nNo hay ningún teléfono conectado. Por favor conéctalo en el modo 'Teléfono'.";
        }
        return resultado + "\n" + this.toString();
    }

    
    /** 
     * @param modo
     * @return String
     * Sirve para cambiar el modo del radio (radio, reproducción, teléfono o productividad)
     */
    @Override
    public String cambiarModo(int modo) {
        // TODO Auto-generated method stub
        String resultado = "";
        switch(modo){
            case 1:{ //Radio
                this.modo = 1; 
                resultado = resultado + "Se ha cambiado al modo 'Radio'.";
                break;
            }
            case 2:{//Reproducción
                this.modo = 2;
                resultado = resultado + "Se ha cambiado al modo 'Reproducción'.";
                break;
            }
            case 3:{ //Teléfono
                this.modo = 3;
                resultado = resultado + "Se ha cambiado al modo 'Teléfono'.";
                break;
            }
            case 4:{ //Productividad
                this.modo = 4;
                resultado = resultado + "Se ha cambiado al modo 'Productividad'.";
                break;
            }
        }
        return resultado + "\n";
    }

    
    /** 
     * @param lista
     * @return String
     * Sirve para seleccionar una lista de reproducción y ponerla a reproducir.
     */
    @Override
    public String seleccionarLista(int lista) {
        // TODO Auto-generated method stub
        this.listaReproduccionActual = listaListasReproduccion.get(lista-1);
        return "Se ha seleccionado la lista..." + "\n" + this.toString();
    }

    
    /** 
     * @param subirBajar
     * @return String
     * Cuando se está reproduciendo una lista, este método sube o baja de canción. 
     */
    @Override
    public String cambiarCancion(int subirBajar) {
        // TODO Auto-generated method stub
        int indice = 0;
        String resultado = "";

        for (int i = 0; i < listaReproduccionActual.size(); i++){
            Cancion actual = listaReproduccionActual.get(i);
            String nombreActual = actual.getNombre();
            
            if (nombreActual.equalsIgnoreCase(this.cancionActual.getNombre())){
                indice = i;
            }
        }

        switch(subirBajar){
            case 1:{
                this.cancionActual = listaReproduccionActual.get(indice+1);
                resultado = resultado + "Se ha cambiado de canción.";
                break;
            }
            case 2:{
                if (indice != 0 && indice < 5){
                    this.cancionActual = listaReproduccionActual.get(indice-1);
                    resultado = resultado + "Se ha cambiado de canción.";
                }
                
                else if (indice == 5){
                    indice = 1;
                    this.cancionActual = listaReproduccionActual.get(indice);
                    resultado = resultado + "Se ha cambiado de canción.";
                }
                
                else{
                    resultado = resultado + "No es posible regresar a la canción anterior porque esta es la primera canción de la lista de reproducción.";
                }
                break;
            }
        }
        return resultado + "\n" + this.toString();
    }

    
    /** 
     * @param cancion
     * @return String
     * Sirve para escuchar una canción específica de la lista de reproducción actual.
     */
    @Override
    public String escucharCancion(int cancion) {
        // TODO Auto-generated method stub
        String resultado = "";

        cancionActual = listaReproduccionActual.get(cancion-1);
        resultado = "\nSe ha puesto la canción " + cancionActual.getNombre();
        resultado = resultado + "\n" + this.toString();

        return resultado;
    }

    
    /** 
     * @param numeroTelefono
     * @return String
     * Sirve para conectar un teléfono (abre los archvos csv)
     */
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
            String duracion = cancionString[1];
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
            String duracion = cancionString2[1];
            String nombre = cancionString2[2];
            String genero = cancionString2[3];

            Cancion cancion = new Cancion(cantante, duracion, nombre, genero);
            playList2.add(cancion);
        }
        listaListasReproduccion.add(playList2);
        
        this.telefonoConectado = true;
        String resultado = "\nSe ha conectado el teléfono.";
        return resultado;
    }

    
    /** 
     * @return String
     * Sirve para desconectar el teléfono (vacía las listas)
     */
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
        return resultado + "\n" + this.toString();
    }

    
    /** 
     * @return String
     * Despliega todas las canciones de la lista que se está reproduciendo actualmente
     */
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
                resultado = resultado + i + ". " + cancion.getNombre() + " - " + cancion.getCantante() + "\n";
                i++;
            }
        }

        return this.toString()+ "\n"+ resultado;
    }

    
    /** 
     * @return String
     * Despliega todos los contactos del teléfono que está conectado.
     */
    @Override
    public String desplegarContactos(String archivo) {
        // TODO Auto-generated method stub
        String resultado = "";

        if(telefonoConectado = false){
            resultado = "\nNo hay ningún teléfono conectado. No se pueden mostrar contactos.";
        }
        else{
            int i = 1;
            resultado = "\n--- CONTACTOS ---\n";
            for (Contacto contacto : listaContactos) {
                resultado = resultado + i + ". " + contacto.getNombre() + ": " + contacto.getTelefono() + "\n";
                i++;
            }
        }
        return resultado + "\n" + this.toString();
    }

    
    /** 
     * @return String
     * Enciende o apaga el radio, según el estado en el que se encuentre.
     */
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

    
    /** 
     * @param opcion
     * @param contacto
     * @return String
     * Llama a un contacto de la lista de contactos del teléfono que está conectado (o cuelga con él)
     */
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
                    ultimoContacto = contactoActual;
                    break;

                case 2://colgar
                    resultado = "\nSe ha colgado la llamada con " + contactoActual.getTelefono() + " (" + contactoActual.getNombre() + ")" + "...";
                    break;
            
                default:
                    break;
            }
        }
        return resultado + "\n" + this.toString();
    }

    
    /** 
     * @return String
     * Despliega todas las tarjetas de presentación guardadas en el teléfono actualmenta conectado.
     */
    @Override
    public String desplegarTarjetas() {
        // TODO Auto-generated method stub
        String resultado = "";

        if(telefonoConectado == false){
            resultado = "\nNo hay ningún teléfono conectado. No se pueden mostrar las tarjetas de presentación.";
        }
        else{
            int i = 1;
            resultado = "\n--- TARJETAS DE PRESENTACIÓN ---\n";
            for (TarjetaPresentacion tarjeta : listaTarjetasPresentacion) {
                resultado = resultado + i + ". " + tarjeta.toString();
                i++;
            }
        }
        return resultado + "\n" + this.toString();
    }

    
    /** 
     * @return String
     * Despliega la información importante del radio.
     */
    @Override
    public String toString(){
        String resultado = "\n--------- RADIO ---------\n";
        
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
                    "\n\nCanción que se está reproduciendo: " + "\n" + cancionActual.toString();
                break;

            case 3:
                resultado = resultado  + "\nMODO TELÉFONO" + 
                    "\nVolumen: " + volumen +
                    "\nÚltimo contacto con el que se habló: " + ultimoContacto.getNombre() + " (" + ultimoContacto.getTelefono() + ")";
                break;

            case 4:
                resultado = resultado  + "\nMODO PRODUCTIVIDAD" + 
                "\nVolumen: " + volumen;
                if(listaTarjetasPresentacion.size()!= 0){
                    resultado = resultado + "\n\nMi Tarjeta de presentación: " + listaTarjetasPresentacion.get(0).toString();
                }
                break;
        
            default:
                break;
        }
        
        return resultado;
    }

    @Override
    public boolean verificar(int numero) {
        // TODO Auto-generated method stub
        boolean resultado = false;
        switch(numero){
            case 1:
                if (listaEmisoras.size() != 0){
                    resultado = true;
                }
                else{
                    resultado = false;
                }
                break;
            
            case 2:
                if (listaListasReproduccion.size() != 0){
                    resultado = true;
                }
            
                else{
                    resultado = false;
                }
                break;

            case 3:
                if(listaReproduccionActual.size() != 0){
                    resultado = true;
                }
                else{
                    resultado = false;
                }
                break;

            default:
                break;
                
        }
        return resultado;
    }
    
}
