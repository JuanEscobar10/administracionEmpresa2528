package administracionEmpresa528;
import java.util.Scanner;
public class Usuario528 {

        public String nombre;
        public String email;
        public String rol;

        // Constructor
        public Usuario528(String nombre, String email, String rol) {
            this.nombre = nombre;
            this.email = email;
            this.rol = rol;
        }

        // Método para mostrar detalles del usuario
        public void mostrarDetalles() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Email: " + email);
            System.out.println("Rol: " + rol);
        }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Crear instancias iniciales (sin listas ni arrays)
        EmpleadoRegular528 empleado = new EmpleadoRegular528("Juan Pérez", "juan@empresa.com");
        Supervisor528 supervisor = new Supervisor528("Ana López", "ana@empresa.com");
        Administrador528 administrador = new Administrador528("Carlos Ruiz", "carlos@empresa.com");
        Usuario528 usuarioExtra = null; // Usuario temporal para agregar/eliminar

        boolean salir = false;

        while (!salir) {
            System.out.println("\nSistema de Administración de Usuarios");
            System.out.println("1. Mostrar detalles del empleado regular");
            System.out.println("2. Mostrar detalles del supervisor");
            System.out.println("3. Mostrar detalles del administrador");
            System.out.println("4. Crear un nuevo usuario (Administrador)");
            System.out.println("5. Eliminar el último usuario creado (Administrador)");
            System.out.println("6. Supervisar el empleado regular (Supervisor)");
            System.out.println("7. Salir");
            System.out.print("Elige una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    empleado.mostrarDetalles();
                    break;
                case 2:
                    supervisor.mostrarDetalles();
                    break;
                case 3:
                    administrador.mostrarDetalles();
                    break;
                case 4:
                    System.out.print("Nombre del usuario: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Email del usuario: ");
                    String email = scanner.nextLine();
                    System.out.print("Rol (Empleado Regular/Supervisor/Administrador): ");
                    String rol = scanner.nextLine();
                    usuarioExtra = administrador.crearUsuario(nombre, email, rol);
                    break;
                case 5:
                    if (usuarioExtra != null) {
                        administrador.eliminarUsuario(usuarioExtra);
                        usuarioExtra = null; // Resetear el usuario eliminado
                    } else {
                        System.out.println("No hay usuario para eliminar.");
                    }
                    break;
                case 6:
                    supervisor.supervisarEmpleado(empleado.usuario);
                    break;
                case 7:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
    }


