public class Libro
{
    private String titulo;
    private String autor;
    private int anoPublicacion;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacion() {
        return anoPublicacion;
    }

    public void setAnoPublicacion(int anoPublicacion) {
        this.anoPublicacion = anoPublicacion;
    }

    public void mostrarDetalles() {
        System.out.println("El título del libro es: " + titulo);
        System.out.println("El nombre del autor es: " + autor);
        System.out.println("El año en que se público fue el: " + anoPublicacion);
    }
}
