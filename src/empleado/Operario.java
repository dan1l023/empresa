package empleado;

public class Operario extends empleado{

    private int antiguedadInicial;

    public void crearOperarioConAntiguedad(int antiguedad) {
        antiguedadInicial = antiguedad;
    }

    public int consultarAntiguedad() {
        return antiguedadInicial;
    }
}
