public class Principal {
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