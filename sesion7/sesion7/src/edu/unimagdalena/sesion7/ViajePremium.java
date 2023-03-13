package edu.unimagdalena.sesion7;

import java.time.LocalDate;
import java.util.List;

import static java.time.temporal.ChronoUnit.DAYS;
/*
 * Es un tipo de viaje que se caracteriza por permitir cancelar las reservas 
 * hasta el día antes de la fecha de salida. 
 * Para realizar la cancelación se proporciona el código de la reserva 
 * y devuelve un valor booleano indicando si se ha efectuado la cancelación.
 */
public class ViajePremium extends Viaje{

    public ViajePremium(String propietario, String coche, String ruta, LocalDate fecha, int plazasOfrecidas) {
        super(propietario, coche, ruta, fecha, plazasOfrecidas);
    }
    public ViajePremium(String propietario, String coche, String ruta, LocalDate fecha){
        super(propietario, coche, ruta, fecha);
    }

    public boolean cancelarReserva(String codigoReserva){
        Reserva reserva = this.consultarReservaPorCodigo(codigoReserva);

        if(DAYS.between(reserva.getFecha(), getFecha())< 1){
            List<Reserva> reservas = getReservas();
            reservas.remove(reserva);
            return true;
        }
        return false;
    }
    
    
}
