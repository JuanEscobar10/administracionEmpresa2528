package administracionEmpresa528;

public class Administrador528 {
    private Usuario528 usuario;

    // Constructor
    public Administrador528(String nombre, String email) {
        this.usuario = new Usuario528(nombre, email, "Administrador");
    }

    // Método para mostrar detalles del administrador
    public void mostrarDetalles() {
        System.out.println("Detalles del Administrador:");
        usuario.mostrarDetalles();
    }

    // Métodos para gestionar un solo usuario
    public Usuario528 crearUsuario(String nombre, String email, String rol) {
        System.out.println("Usuario creado: " + nombre + " (" + rol + ")");
        return new Usuario528(nombre, email, rol);
    }

    public void eliminarUsuario(Usuario528 usuario) {
        System.out.println("Usuario eliminado: " + usuario.nombre + " (" + usuario.rol + ")");
    }

    public void mostrarUsuario(Usuario528 usuario) {
        if (usuario != null) {
            usuario.mostrarDetalles();
        } else {
            System.out.println("No hay usuario para mostrar.");
        }
    }
}
