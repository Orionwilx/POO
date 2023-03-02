import java.util.ArrayList;

import Academia.Alumno;
import Academia.Curso;

public class App {
    public static void main(String[] args) throws Exception {
        Alumno a1 = new Alumno("PEPE", 34678904);
        Alumno a2 = new Alumno("Andrea", 17679456, 125);
        Alumno a3 = new Alumno("Antonio", 34972496, 200);
        Curso c1 = new Curso("Diseño de Bases de Datos", 50, 2);
        Curso c2 = new Curso("Administración de Bases de Datos", 75, 5);

        ArrayList<Curso> cursos;
        cursos = new ArrayList<>();

        cursos.add(c1);
        cursos.add(c2);

        for (int i=0; i<cursos.size(); i++) {
            cursos.get(i).matricularAlumno(a1);
            cursos.get(i).matricularAlumno(a2);
            cursos.get(i).matricularAlumno(a3);

            cursos.get(i).getAlumnosMatriculados().toString();
            
            cursos.get(i).calificarAlumno(a1, 10);
            cursos.get(i).calificarAlumno(a2, 10);
            cursos.get(i).calificarAlumno(a3, 10);
            
        }

    }    
}
