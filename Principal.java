/**
 * Clase principal de la aplicación.
 * Crea una asignatura, da de alta alumnos y muestra el listado y la nota media.
 */
public class Principal {
    /**
     * Método principal que ejecuta la aplicación.
     * @param args Argumentos de la línea de comandos (no se usan)
     */
    public static void main(String[] args) {
        Asignatura asignatura = new Asignatura();

        // Ejemplo de alta de alumnos
        asignatura.altaAlumno(new Alumno("Juan", 8, 7, 9));
        asignatura.altaAlumno(new Alumno("Ana", 6, 9, 8));
        asignatura.altaAlumno(new Alumno("Luis", 5, 7, 6));

        System.out.println(Textos.LISTADO_ALUMNOS);
        asignatura.mostrarAlumnos();

        System.out.println(Textos.NOTA_MEDIA + asignatura.notaMedia());
    }
}