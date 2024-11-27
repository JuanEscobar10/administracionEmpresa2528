package administracionEmpresa528;

public class Supervisor528 {

    private Usuario528 usuario;

    // Constructor
    public Supervisor528(String nombre, String email) {
        this.usuario = new Usuario528(nombre, email, "Supervisor");
    }

    // Método para mostrar detalles del supervisor
    public void mostrarDetalles() {
        System.out.println("Detalles del Supervisor:");
        usuario.mostrarDetalles();
    }

    // Método para supervisar un empleado
    public void supervisarEmpleado(Usuario528 empleado) {
        if (empleado.rol.equals("Empleado Regular")) {
            System.out.println("Supervisando empleado:");
            empleado.mostrarDetalles();
        } else {
            System.out.println("El usuario no es un empleado regular.");
        }
    }
}