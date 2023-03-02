package Academia;

public class Alumno{
    private String nombre;
    private int dni;
    private float credito;
    
    // CONSTRUCTORES 
    public Alumno(String nombre, int dni, float credito) {
        this.nombre = nombre;
        this.dni = dni;
        this.credito = credito;
    }    

    public Alumno(String nombre, int dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.credito = 100;
    }

    // GETTERS PARA OBTENER DATOS
    public String getNombre() {
        return nombre;
    }
    public int getDni() {
        return dni;
    }
    public float getCredito() {
        return credito;
    }
    
    //FUNCIONALIDADES
    public void incrementarCredito(float credito){
        this.credito += credito;
    }

    public void decrementarCredito(float credito){
        this.credito -= credito;
    }
    
}