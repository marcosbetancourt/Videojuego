void main() {
    Videojuego v1 = new Videojuego();
    Videojuego v2 = new Videojuego();
    Videojuego v3 = new Videojuego();

    v1.nombre = "The last of us";
    v1.genero = "Zombies";
    v1.version = "1.24";
    v1.activo = false;

    v2.nombre = "Súper Mario";
    v2.genero = "Aventura";
    v2.version = "16.2";
    v2.activo = false;

    v3.nombre = "GTA V";
    v3.genero = "Mundo abierto";
    v3.version = "4.5";
    v3.activo = false;

    v1.iniciar();
    v1.mostrarInformacion();
    v1.mostrarVersion();
    v1.cerrar();

    v2.iniciar();
    v2.mostrarInformacion();
    v2.mostrarVersion();
    v2.cerrar();

    v3.iniciar();
    v3.mostrarInformacion();
    v3.mostrarVersion();
    v3.cerrar();
}