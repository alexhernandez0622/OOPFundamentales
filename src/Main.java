import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        /*Crear un programa que me permita recibir mediante OOP los nombres y las edades de las persona*/
        Persona persona1 = new Persona("Juanita", 21);
        Persona persona2 = new Persona("Karina", 18);

        // Mostrar los datos de las personas
        persona1.mostrarInformacion();
        System.out.println();
        persona2.mostrarInformacion();


        /*---------------------------------------------------------------*/

        /*Crear un programa que mediante los OOP me
         calcule el área de un rectágulo*/

        Rectangulo rect = new Rectangulo(5.0, 3.0);
        double area = rect.calcularArea();
        System.out.println("El área " + "\n" + "del rectángulo es de: " + area);
        System.out.println("");
        System.out.println("");

        /*----------------------------------------------------------*/
        /*Crear un programa usando los OOP para que me permita ejecutar y mostrar los datos y detalles de un libro*/
        Libro miLibro = new Libro();

        miLibro.setTitulo("Java Programming");
        miLibro.setAutor("Manuel Cobos");
        miLibro.setAnoPublicacion(2024);

        System.out.println("Detalles del libro: ");
        miLibro.mostrarDetalles();

        /*---------------------------------------------------*/
        /*Crear un programa que solicite y registre el nombre del estudiante, su edad, el nombre de la materia y la nota que obtuvo*/

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre del estudiante: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la edad del estudiante: ");
        int edad =sc.nextInt();
        sc.nextLine();

        System.out.print("Ingrese el nombre de la materia: ");
        String materia = sc.nextLine();

        System.out.print("Ingrese la nota obtenida del estudiante: ");
        double notaObtenida = sc.nextDouble();

        // Creamos el Objeto Estudiante para ingrear la información obtenida por consola
        Estudiante estudiante1 = new Estudiante(nombre, edad, materia, notaObtenida);

        // Mostrar la información del estudiante
        System.out.println("\nInformación del estudiante:");
        System.out.println("Nombre: " + estudiante1.getNombre());
        System.out.println("Edad: " + estudiante1.getEdad());
        System.out.println("Materia: " + estudiante1.getMateria());
        System.out.println("Nota Obtenida: " + estudiante1.getNotaObtenida());

        sc.close();
    }
}