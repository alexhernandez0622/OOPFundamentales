public class Estudiante
{
    private String nombre;
    private int edad;
    private String materia;
    private double notaObtenida;

    public Estudiante (String nombre, int edad, String materia, double notaObtenida)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.materia = materia;
        this.notaObtenida = notaObtenida;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getMateria() {
        return materia;
    }

    public double getNotaObtenida() {
        return notaObtenida;
    }
}

