package empleado;

public class Operario extends Empleado {
	private int antiguedad;

	// Creamos un constructor para inicializar los atributos de la clase
	public Operario(String cedula, String direccion, String fechaNacimiento, String telefono1, String telefono2,
			String nombre, int antiguedad) {
		super(cedula, direccion, fechaNacimiento, telefono1, telefono2, nombre);
		this.antiguedad = antiguedad;
	}

	// Creamos un método para consultar la antigüedad
	public int consultarAntiguedad() {
		return antiguedad;
	}
}
