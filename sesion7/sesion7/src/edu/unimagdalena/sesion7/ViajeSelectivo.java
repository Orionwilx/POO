package edu.unimagdalena.sesion7;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/*
 * Viaje selectivo. Es un tipo de viaje que permite vetar a los usuarios. 
 * Por tanto, este tipo de viaje añade una nueva propiedad que contiene 
 * el conjunto de usuarios vetados. 
 * Inicialmente la colección estará vacía, 
 * pero se pueden añadir y eliminar usuarios vetados en cualquier momento. 
 * Por tanto, no se aceptará una reserva si el usuario que la realiza está vetado.
 */
public class ViajeSelectivo extends Viaje{
    
    private List<String> usuariosVetados;
    public ViajeSelectivo(String propietario, String coche, String ruta, LocalDate fecha, 
                            int plazasOfrecidas) {
        super(propietario, coche, ruta, fecha, plazasOfrecidas);
        this.usuariosVetados = new ArrayList<>();
    }
    public ViajeSelectivo(String propietario, String coche, String ruta, LocalDate fecha) {
        this(propietario, coche, ruta, fecha, NUM_PLAZAS);
    }
    
    public void vetarUsuario(String usuario){
        this.usuariosVetados.add(usuario);
    }
    /*Por tanto, no se aceptará una reserva si el usuario que la realiza está vetado. */
    @Override
    public Reserva realizarReserva(String usuario, int plazasReservar) {
        if(!usuariosVetados.contains(usuario)){
            return super.realizarReserva(usuario, plazasReservar);
        }        
        return null;
    }
    @Override
    public String toString() {
        return "ViajeSelectivo [ "+ super.toString() +" usuariosVetados=" + usuariosVetados + "]";
    }
    
    
    
    
}
