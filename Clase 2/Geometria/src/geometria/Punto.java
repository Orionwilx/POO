package geometria;

public class Punto {
    private int x;
    private int y;

    
    //Constructor con dos argumentos
    public Punto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //Constructor sin argumentos
    public Punto() {
        this(0,0);
    }

    //Constructor de copia
    public Punto(Punto p){
        this(p.x, p.y);
    }

    // Propiedades para obtener
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    //Propiedade spra modificar
    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    //Desplazar un incremento en x y un incremento en y.
    public void Desplazar(int incX, int incY) {
        this.x += incX;
        this.y += incY;
    }
    
    
}
