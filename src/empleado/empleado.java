package empleado;

public class empleado {
    private String cedula;
    private String direccion;
    private String fechaNacimiento;
    private String telefono1;
    private String telefono2;
    private String nombre;


    public String consultarNombre() {
        return nombre;
    }

    public String consultarCedula() {
        return cedula;
    }

    public String consultarDireccion(){
        return direccion;
    }

    public String consultarFechadenacimiento(){
        return fechaNacimiento;
    }

    public String consultarTelefono1(){
        return telefono1;
    }

    public String consutarTelefono2(){
        return telefono2;
    }
}
