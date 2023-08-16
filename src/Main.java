import empleado.EmpleadoAdministrativo;
import empleado.Operario;

public class Main {
	public static void main(String[] args) {

		// Creamos un empleado administrativo y un operario
		EmpleadoAdministrativo empleadoAdmin = new EmpleadoAdministrativo("123456789", "Dirección1", "1990-01-01",
				"111-111-1111", "222-222-2222", "Juan", "Recursos Humanos");

		Operario operario = new Operario("987654321", "Dirección2", "1985-05-05", "333-333-3333", "444-444-4444",
				"Carlos", 3);

		System.out.println("Detalles del Empleado Administrativo:");
		System.out.println("Nombre: " + empleadoAdmin.consultarNombre());
		System.out.println("Cédula: " + empleadoAdmin.consultarCedula());
		System.out.println("Dirección: " + empleadoAdmin.consultarDireccion());
		System.out.println("Fecha de Nacimiento: " + empleadoAdmin.consultarFechadenacimiento());
		System.out.println("Teléfono 1: " + empleadoAdmin.consultarTelefono1());
		System.out.println("Teléfono 2: " + empleadoAdmin.consutarTelefono2());
		System.out.println("Área: " + empleadoAdmin.consultarArea());

		System.out.println("\nDetalles del Operario:");
		System.out.println("Nombre: " + operario.consultarNombre());
		System.out.println("Cédula: " + operario.consultarCedula());
		System.out.println("Dirección: " + operario.consultarDireccion());
		System.out.println("Fecha de Nacimiento: " + operario.consultarFechadenacimiento());
		System.out.println("Teléfono 1: " + operario.consultarTelefono1());
		System.out.println("Teléfono 2: " + operario.consutarTelefono2());
		System.out.println("Antigüedad: " + operario.consultarAntiguedad());
	}
}
