import java.util.ArrayList;

/**
 * Gestiona una asignatura con una lista de alumnos.
 * Permite dar de alta alumnos, mostrar el listado y calcular la nota media.
 */
public class Asignatura {
    /** Lista de alumnos de la asignatura */
    private ArrayList<Alumno> lista;

    /**
     * Crea una nueva asignatura sin alumnos.
     */
    public Asignatura() {
        lista = new ArrayList<>();
    }

    /**
     * Da de alta un nuevo alumno en la asignatura.
     * @param alumno Alumno a añadir
     */
    public void altaAlumno(Alumno alumno) {
        lista.add(alumno);
    }

    /**
     * Muestra por pantalla el listado de alumnos con sus datos y promedio.
     */
    public void mostrarAlumnos() {
        for (Alumno a : lista) {
            System.out.println(Textos.NOMBRE + a.getNombre()
                    + Textos.NOTA1 + a.getNota1()
                    + Textos.NOTA2 + a.getNota2()
                    + Textos.NOTA3 + a.getNota3()
                    + Textos.PROMEDIO + a.promedio());
        }
    }

    /**
     * Calcula la nota media de todos los alumnos de la asignatura.
     * @return Nota media de la asignatura, o 0 si no hay alumnos
     */
    public double notaMedia() {
        if (lista.isEmpty()) return 0;
        double suma = 0;
        for (Alumno a : lista) {
            suma += a.promedio();
        }
        return suma / lista.size();
    }
}