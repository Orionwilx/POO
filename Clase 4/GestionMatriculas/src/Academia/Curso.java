package Academia;

import java.util.ArrayList;

public class Curso {
    private final String titulo;
    private final float precioMatricula;    
    private int numAlumnoMatriculado;
    private final int maxCupo;
    private ArrayList<Calificacion> calificaciones;
    private ArrayList<Alumno> alumnosMatriculados;

    //CONTRUCTORES
    public Curso(String titulo, float precioMatricula, int maxCupo) {
        this.titulo = titulo;
        this.precioMatricula = precioMatricula;
        this.maxCupo = maxCupo;
        this.numAlumnoMatriculado = 0;
        alumnosMatriculados = new ArrayList<>();
        calificaciones = new ArrayList<>();
    }

    //getters 
    public String getTitulo() {
        return titulo;
    }
    public float getPrecioMatricula() {
        return precioMatricula;
    }
    public int getNumAlumnoMatriculado() {
        return numAlumnoMatriculado;
    }
    public int getMaxCupo() {
        return maxCupo;
    }
    public ArrayList<Calificacion> getCalificaciones() {
        return calificaciones;
    }
    public ArrayList<Alumno> getAlumnosMatriculados() {
        return alumnosMatriculados;
    }

    //seters
    public void setNumAlumnoMatriculado(int numAlumnoMatriculado) {
        this.numAlumnoMatriculado = numAlumnoMatriculado;
    }

    public void setCalificaciones(ArrayList<Calificacion> calificaciones) {
        this.calificaciones = calificaciones;
    }

    public void setAlumnosMatriculados(ArrayList<Alumno> alumnosMatriculados) {
        this.alumnosMatriculados = alumnosMatriculados;
    }

    //funcionalidades

    public boolean matricularAlumno(Alumno alumno) {

        if ((alumno.getCredito() >= precioMatricula) && (numAlumnoMatriculado < maxCupo)) {

            if (alumnosMatriculados != null) {            

                for(int i=0; i < alumnosMatriculados.size(); i++){

                    if (alumno == alumnosMatriculados.get(i)) {

                        System.out.println("Alumno ya matriculado en la asignatura");
                        return false;
                    }else{

                        alumno.decrementarCredito(precioMatricula);
                        alumnosMatriculados.add(alumno);
                        numAlumnoMatriculado ++;
                        System.out.println("Alumno matriculado con exito");
                        return true;
                        
                    }
                }
            }else{
                alumno.decrementarCredito(precioMatricula);
                alumnosMatriculados.add(alumno);
                System.out.println("Alumno matriculado con exito");
                return true;
            }
        }
        System.out.println("El alumno no cuenta con los requisitos para matricularse");
        return false;       
    }
    

    public boolean calificarAlumno(Alumno a, int nota){
        Calificacion cal =new Calificacion(nota,a);
        if(alumnosMatriculados.contains(a) && nota>0 && nota<10 && !calificaciones.contains(cal)){
            calificaciones.add(cal);
            return true;
        }
        return false;
    }

    
    
}
