import java.time.LocalDate;

import edu.unimagdalena.sesion7.Viaje;
import edu.unimagdalena.sesion7.ViajePremium;
import edu.unimagdalena.sesion7.ViajeSelectivo;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Crea los siguientes viajes cuyo propietario sea “José Antonio” y coche “Seat León”:
        - Viaje “Murcia-Cartagena” con fecha de salida 9/junio/2020 con el número de plazas por defecto.
        - Viaje selectivo “Murcia–Campus” con fecha de salida 10/junio/2020 y 4 plazas.
        - Vetar a “Beatriz” en el viaje selectivo.
        - Viaje premium “Murcia-Barcelona” con fecha de salida 15/junio/2020 y 6 plazas.
         */
        Viaje muciarCartagena = new Viaje("José Antonio","Seat León","Murcia-Cartagena", LocalDate.of(2023, 6, 9));
        ViajeSelectivo murciaCampus = new ViajeSelectivo("José Antonio", 
                                "Seat León", "Murcia–Campus", 
                                LocalDate.of(2023, 3, 9), 
                                4);
        
        murciaCampus.vetarUsuario("Beatriz");

        ViajePremium murciaBarcelona = new ViajePremium("José Antonio", 
                                                    "Seat León", "Murcia-Barcelona", 
                                                    LocalDate.of(2023, 3, 9));

        
    }
}
