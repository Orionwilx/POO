package edu.unimagdalena.sesion7;

import java.time.LocalDate;
import java.util.UUID;

public class Reserva {
    /**
     * Código de reserva: una cadena de texto generada automáticamente en el constructor de forma aleatoria utilizando UUID.randomUUID().toString();
- Usuario: cadena de texto que identifica al usuario que realiza la reserva.
- Número de plazas: entero que representa el número de plazas que se han reservado.
- Fecha en la que se realiza la reserva. Esta propiedad se inicializa en la construcción y corresponde a la fecha actual (now).
     */
    private final String codigo;
    private final String usuario;
    private final int plazas;
    private final LocalDate fecha;
    /**
     * El constructor de la reserva recibe como parámetro el usuario y el número de plazas. 
     * Además, las propiedades no se pueden modificar tras la construcción. Por tanto, esta clase define objetos inmutables.
     */
    public Reserva(String usuario, int plazas) {
        this.usuario = usuario;
        this.plazas = plazas;
        codigo = UUID.randomUUID().toString();
        fecha = LocalDate.now();
    }
    public String getCodigo() {
        return codigo;
    }
    public String getUsuario() {
        return usuario;
    }
    public int getPlazas() {
        return plazas;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    @Override
    public String toString() {
        return "Reserva [codigo=" + codigo + ", usuario=" + usuario + ", plazas=" + plazas + ", fecha=" + fecha + "]";
    }
    
    
    
}
