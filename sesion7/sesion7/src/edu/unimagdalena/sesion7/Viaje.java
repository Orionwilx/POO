package edu.unimagdalena.sesion7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Viaje {
    /**
     * Propietario del vehículo (cadena de texto).
- Coche: cadena de texto con el modelo del coche utilizado para el viaje.
- Ruta: cadena que describe el viaje (por ejemplo, “Murcia – Valencia – Barcelona”).
- Fecha de salida.
- Plazas ofrecidas.
- Reservas: lista con las reservas que se han realizado.
-

     */
    static final int NUM_PLAZAS = 1;
    private final String propietario;
    private final String coche;
    private final String ruta;
    private final LocalDate fecha;
    private final int plazasOfrecidas;
    private List<Reserva> reservas;

    public Viaje(String propietario, String coche, String ruta, LocalDate fecha, int plazasOfrecidas) {
        this.propietario = propietario;
        this.coche = coche;
        this.ruta = ruta;
        this.fecha = fecha;
        this.plazasOfrecidas = plazasOfrecidas;
        this.reservas = new ArrayList<>();
    }
    public Viaje(String propietario, String coche, String ruta, LocalDate fecha) {
        this(propietario, coche, ruta, fecha, NUM_PLAZAS);
    }
    /*
     *  Número de plazas reservadas. 
     * Corresponde con la suma del número de plazas de las reservas realizadas.
     */
    public int getNumeroPlazasReservadas(){
        int suma = 0;
        for(Reserva r: this.reservas){
            suma += r.getPlazas();
        }
        return suma;
    }
    /*- Plazas disponibles. 
    Corresponde con la diferencia entre las plazas ofrecidas 
    y el número de plazas reservadas.
    
    */
    public int getPlazasDisponibles(){
        return this.plazasOfrecidas - getNumeroPlazasReservadas();
    }


    /*
     * realizar reserva: el método recibe como parámetro el usuario 
     * (cadena de texto) que realiza la reserva y 
     * el número de plazas que quiere reservar. 
     * Para poder formalizar la reserva se tiene que cumplir que: 
     * queden plazas disponibles y que el viaje no se haya realizado todavía 
     * (la fecha en la que se está realizando la reserva tiene que ser anterior 
     * a la fecha de salida). 
     * Si se cumplen estas restricciones, 
     * se generará un objeto reserva que se almacenará en la lista de reservas
     *  y que además se devuelve como resultado de la ejecución. 
     * En el caso de que no se cumpla alguna de las condiciones el método 
     * devolverá null.
     */
    
     public Reserva realizarReserva(String usuario, int plazasReservar){
        Reserva nuevaReserva = null;
        LocalDate fechaReserva = LocalDate.now();
        if(plazasReservar <= getPlazasDisponibles() && fechaReserva.isBefore(fecha) ){
            nuevaReserva = new Reserva(usuario, plazasReservar);
            this.reservas.add(nuevaReserva);

        }
        return nuevaReserva;
     }
     /**
      * Consultar la reserva asociada a un código: 
      el método recibe como parámetro un código de reserva y 
      devuelve el objeto reserva cuyo código es igual al recibido como parámetro,
       o null si no existe ninguna reserva con ese código.
      */
    public Reserva consultarReservaPorCodigo(String codigo){
        Reserva r = null;
        for(Reserva reserva: this.reservas){
            if(reserva.getCodigo().equals(codigo)){
                r = reserva;
                break;
            }
        }
        return r;
    }
    public String getPropietario() {
        return propietario;
    }
    public String getCoche() {
        return coche;
    }
    public String getRuta() {
        return ruta;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public List<Reserva> getReservas() {
        return reservas;
    }
    @Override
    public String toString() {
        return "Viaje [propietario=" + propietario + ", coche=" + coche + ", ruta=" + ruta + ", fecha=" + fecha
                + ", plazasOfrecidas=" + plazasOfrecidas + ", reservas=" + reservas + ", plazasReservadas="
                + getNumeroPlazasReservadas() + ", plazasDisponibles=" + getPlazasDisponibles() + "]";
    }
    
    
}
