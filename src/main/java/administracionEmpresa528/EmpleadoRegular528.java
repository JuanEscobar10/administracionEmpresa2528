package administracionEmpresa528;

public class EmpleadoRegular528 {
    public Usuario528 usuario;

    // Constructor
    public EmpleadoRegular528(String nombre, String email) {
        this.usuario = new Usuario528(nombre, email, "Empleado Regular");
    }

    // Método para mostrar detalles del empleado regular
    public void mostrarDetalles() {
        System.out.println("Detalles del Empleado Regular:");
        usuario.mostrarDetalles();
    }

}
