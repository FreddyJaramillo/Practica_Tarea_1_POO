package uni1a;

public class Investigador {
    private String nombre;
    private String institucion;
    private String area;

    public Investigador(String nombre, String institucion, String area) {
        this.nombre = nombre;
        this.institucion = institucion;
        this.area = area;
    }

    public String getNombre() { return nombre; }
    public String getInstitucion() { return institucion; }
    public String getArea() { return area; }

    @Override
    public String toString() {
        return nombre + " - " + institucion + " (" + area + ")";
    }
}
