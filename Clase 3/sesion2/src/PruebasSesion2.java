import geometria.Circulo;
import geometria.Direccion;
import geometria.Punto;
import geometria.Rectangulo;

public class PruebasSesion2 {
public static void main(String[] args) {
   /*
    * Declara la variable local punto1 y asigna un objeto Punto en (2, 3).
- Desplaza punto1 en la dirección hacia arriba.
- Muestra las propiedades de punto1 por la consola.
- Declara la variable local punto2 y asigna un objeto Punto en (4, 2).
- Calcula la distancia entre punto1 y punto2. Muestra el resultado en la consola.
- Utiliza el método mayorDistancia para comprobar cuál de los dos puntos (punto1,
punto2) está más alejado del eje de coordenadas. Muestra el resultado en la consola.
- Declara la variable circulo1 que sea asignada por un círculo que tenga como centro
punto1 y radio 3.
- Declara la variable circulo2 que sea asignada por un círculo que tenga de nuevo como
centro punto1 y radio 5.
- Desplaza circulo1 3 unidades en el eje X y 2 unidades en Y.
- Muestra por la consola las coordenadas del centro de circulo1 y circulo2. Las
coordenadas deben ser distintas puesto que el desplazamiento del circulo1 no debe
influir en el circulo2.
- Declara la variable centro y asignale el resultado de la consulta del centro del circulo2.
- Desplaza el centro hacia abajo.
- Muestra por la consola las coordenadas del centro y del centro del circulo2. Las
coordenadas deben ser distintas puesto que el desplazamiento del centro no debe
influir en el circulo2.
- Escala circulo2 al 150% y muestra sus propiedades por la consola.
    */

    Punto punto1 = new Punto(2,3);
    punto1.desplazar(Direccion.ARRIBA);
    System.out.println("Imprimir punto 1");
    punto1.imprimir();

    Punto punto2 = new Punto(4,2);
    double distancia = punto1.distancia(punto2);
    System.out.println("la distancia del punto1 al punto2 es : " + distancia );

    Punto puntoMasAlejado = Punto.mayorDistancia(punto1, punto2);
    System.out.println("El punto  mas alejado del origen es :");
    puntoMasAlejado.imprimir();

    Circulo circulo1 = new Circulo(punto1, 3);
    Circulo circulo2 = new Circulo(punto1, 5);
    // Desplaza circulo1 3 unidades en el eje X y 2 unidades en Y.
    circulo1.desplazar(3, 2);
    /*
     * Muestra por la consola las coordenadas del centro de circulo1 y circulo2. Las
coordenadas deben ser distintas puesto que el desplazamiento del circulo1 no debe
influir en el circulo2.
     */
    Punto centroCirculo1 = circulo1.getCentro();
    System.out.println("Imprimir centro del circulo1");
    centroCirculo1.imprimir();
    System.out.println("Imprimir centro del circulo2");
    circulo2.getCentro().imprimir();

    //- Declara la variable centro y asignale el resultado de la consulta del centro del circulo2.
    Punto centro = circulo2.getCentro();
    //- Desplaza el centro hacia abajo.
    centro.desplazar(Direccion.ABAJO);
    /*
     * - Muestra por la consola las coordenadas del centro y del centro del circulo2. Las
coordenadas deben ser distintas puesto que el desplazamiento del centro no debe
influir en el circulo2.
     */
    System.out.println("Imprimir el centro del circulo2 desplazado");
    centro.imprimir();
   
    System.out.println("Imprimir el centro del circulo2");
    circulo2.getCentro().imprimir();

    circulo2.escalar(150);
    System.out.println("Propiedades del c'irculo2: centro ("
                        + circulo2.getCentro().getX() + "," + circulo2.getCentro().getY() 
                        + " y radio " + circulo2.getRadio());




     // PRUEBAS DE RECTAGULO

     System.out.println("_________________________________________________________");
     System.out.println("Pruebas del rectangulo"+ "\n" );

     Rectangulo rectangulo1 = new Rectangulo(2, 5, new Punto(3, 1));

     rectangulo1.imprimirRectangulo();

     System.out.println("_________________________________________________________ ");

     System.out.println("Rectangulo despazado"+ "\n" );

     rectangulo1.desplazarRectangulo(0, -7);
     rectangulo1.imprimirRectangulo();

}

    
}
