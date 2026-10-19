public class Videojuego {

    // Atributos
    public String nombre;
    public String genero;

    // Atributos con acceso por defecto
    String version;
    boolean activo;

    // Métodos públicos
    public void mostrarInformacion(){
        System.out.println("Nombre: " + nombre +
                            "\nGénero: " + genero +
                            "\nVersión: " + version +
                            "\nActivo: " + activo);
    }

    public void iniciar(){
        activo = true;
        System.out.println(nombre + " ha iniciado.");
    }

    // Métodos con acceso por defecto
    void cerrar(){
        activo = false;
        System.out.println(nombre + " se ha cerrado.");
    }

    void mostrarVersion(){
        System.out.println("Versión actual: " + version);
    }
}
