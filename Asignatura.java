import java.util.ArrayList;

public class Asignatura {
    private ArrayList<Alumno> lista;

    public Asignatura() {
        lista = new ArrayList<>();
    }

    public void altaAlumno(Alumno alumno) {
        lista.add(alumno);
    }

    public void mostrarAlumnos() {
        for (Alumno a : lista) {
            System.out.println("Nombre: " + a.getNombre() +
                               ", Nota1: " + a.getNota1() +
                               ", Nota2: " + a.getNota2() +
                               ", Nota3: " + a.getNota3() +
                               ", Promedio: " + a.promedio());
        }
    }

    public double notaMedia() {
        if (lista.isEmpty()) return 0;
        double suma = 0;
        for (Alumno a : lista) {
            suma += a.promedio();
        }
        return suma / lista.size();
    }
}