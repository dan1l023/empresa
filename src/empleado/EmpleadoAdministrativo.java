package empleado;

public class EmpleadoAdministrativo extends Empleado {
  private String area;

  public EmpleadoAdministrativo(String cedula, String direccion, String fechaNacimiento, String telefono1,
      String telefono2, String nombre, String area) {
    super(cedula, direccion, fechaNacimiento, telefono1, telefono2, nombre);
    this.area = area;
  }

  public String consultarArea() {
    return area;
  }

  public void crearEmpleadoAdministrativo() {
    // Lógica para crear un empleado administrativo
    System.out.println("Creando empleado administrativo: " + consultarNombre());
    System.out.println("Cédula: " + consultarCedula());
    System.out.println("Dirección: " + consultarDireccion());
    System.out.println("Fecha de Nacimiento: " + consultarFechadenacimiento());
    System.out.println("Teléfono 1: " + consultarTelefono1());
    System.out.println("Teléfono 2: " + consutarTelefono2());
    System.out.println("Área: " + consultarArea());
    System.out.println("Empleado administrativo creado.");
  }
}
