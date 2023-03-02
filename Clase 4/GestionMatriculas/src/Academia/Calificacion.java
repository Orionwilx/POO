package Academia;

public class Calificacion {
    private float nota;
    private Alumno alumno;

    //CONTRUCTORES
    public Calificacion(float nota, Alumno alumno) {
        this.nota = nota;
        this.alumno = alumno;
    }
    //CONSULTABLE NO MODIFICABLE
    public float getNota() {
        return nota;
    }
    public Alumno getAlumno() {
        return alumno;
    }
    
    
    

}
