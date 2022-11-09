public interface InterfaceB{
    
    public String cambiarVolumen(int subirBajar);
    public String cambiarRadio();
    public String cambiarEmisora(int subirBajar);
    public void guardarEmisora();
    public String cargarEmisora(int numeroEmisora);
    public String desplegarEmisoras();
    public String desplegarListas();
    public String cambiarModo(int modo);
    public String seleccionarLista(int lista);
    public String cambiarCancion(int subirBajar);
    public String escucharCancion(int cancion);
    public String conectar(int numeroTelefono);
    public String desplegarCanciones();
    public String desplegarContactos();
    public String encenderApagar();
    public String llamarColgar(int opcion, int contacto);
    public String desplegarTarjetas();
    public String desconectar();
    public String toString();
}
