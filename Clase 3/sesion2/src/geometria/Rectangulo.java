package geometria;

public class Rectangulo {
    private int ladoX;
    private int ladoY;
    private Punto verticeII; // vértice inferior izquierda
    private Punto verticeSI; // vértice superior izquierda
    private Punto verticeSD; // vértice superior derecha
    private Punto verticeID; // vértice inferior derecha


    public Rectangulo(int ladoX, int ladoY, Punto verticeII){
        this.verticeII = new Punto(verticeII);
        this.ladoX = ladoX;
        this.ladoY = ladoY;

        this.verticeID = new Punto(verticeII.getX()+ladoX, verticeII.getY());
        this.verticeSD = new Punto(verticeII.getX()+ladoX, verticeII.getY()+ladoY);
        this.verticeSI = new Punto(verticeII.getX(), verticeII.getY()+ladoY);
    }
    public Rectangulo(int ladoX, int ladoY, Punto verticeII, Punto verticeSD){
        this.verticeII = new Punto(ladoX, ladoY);
        this.verticeSD = new Punto(ladoX, ladoY);
    }

    public void desplazarRectangulo(int x, int y){
        this.verticeSD.desplazar(x, y);
        this.verticeSI.desplazar(x, y);
        this.verticeID.desplazar(x, y);
        this.verticeII.desplazar(x, y);
    }

    public void imprimirRectangulo(){
        
        System.out.println("El punto inferior izquierdo es:");
        this.verticeII.imprimir();
        System.out.println("El punto inferior derecho es:");
        this.verticeID.imprimir();
        System.out.println("El punto superior derecho es:");
        this.verticeSD.imprimir();
        System.out.println("El punto superior izquierdo es:");
        this.verticeSI.imprimir();

        
        
        
        
    }

    public void escalarRectangulo(int porcentaje){
        this.ladoX *= porcentaje/100;
        this.ladoY *= porcentaje/100;
    }

    // Getters
    public int getLadoX() {
        return ladoX;
    }
    public int getLadoY() {
        return ladoY;
    }
    public Punto getVerticeII() {
        return verticeII;
    }
    public Punto getVerticeSI() {
        return verticeSI;
    }
    public Punto getVerticeSD() {
        return verticeSD;
    }
    public Punto getVerticeID() {
        return verticeID;
    }


    
}
