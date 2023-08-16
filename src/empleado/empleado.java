package empleado;

public class Empleado {
	private String cedula = "";
	private String direccion = "";
	private String fechaNacimiento = "";
	private String telefono1 = "";
	private String telefono2 = "";
	private String nombre = "";

	// Creamos un constructor para inicializar los atributos de la clase
	public Empleado(String cedula, String direccion, String fechaNacimiento, String telefono1, String telefono2,
			String nombre) {
		this.cedula = cedula;
		this.direccion = direccion;
		this.fechaNacimiento = fechaNacimiento;
		this.telefono1 = telefono1;
		this.telefono2 = telefono2;
		this.nombre = nombre;
	}

	public String consultarNombre() {
		return nombre;
	}

	public String consultarCedula() {
		return cedula;
	}

	public String consultarDireccion() {
		return direccion;
	}

	public String consultarFechadenacimiento() {
		return fechaNacimiento;
	}

	public String consultarTelefono1() {
		return telefono1;
	}

	public String consutarTelefono2() {
		return telefono2;
	}
}
