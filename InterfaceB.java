/*
 * Oscar Flores, Ignacio Méndez y Ariela Mishaan
 * POO Sección 40
 * Laboratorio #4
 * 11-11-2022
 * Interface para el grupo B
 */

public interface InterfaceB{
    
    public String cambiarVolumen(int subirBajar);
    public String cambiarRadio();
    public String cambiarEmisora(int subirBajar);
    public void guardarEmisora();
    public String cargarEmisora(int numeroEmisora);
    public String desplegarEmisoras();
    public String desplegarListas(String archivo);
    public String cambiarModo(int modo);
    public String seleccionarLista(int lista);
    public String cambiarCancion(int subirBajar);
    public String escucharCancion(int cancion);
    public String conectar(int numeroTelefono);
    public String desplegarCanciones();
    public String desplegarContactos(String archivo);
    public String encenderApagar();
    public String llamarColgar(int opcion, int contacto);
    public String desplegarTarjetas();
    public String desconectar();
    public String toString();
    public boolean verificar(int numero);
}
