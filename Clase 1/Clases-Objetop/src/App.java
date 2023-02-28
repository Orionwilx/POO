import java.time.LocalDate;

import Banco.cuentas.Cuenta;

public class App {
    
    public static void main(String[] args) throws Exception {
        
        Cuenta c, c1, c2, c3;
        c = new Cuenta("wilman");
        c1 = new Cuenta("Adri", 2000.0);
        LocalDate fechaCreacion = LocalDate.of(2023, 2, 5);
        c2 = new Cuenta("Carlos", 5000, fechaCreacion);
    }
}
