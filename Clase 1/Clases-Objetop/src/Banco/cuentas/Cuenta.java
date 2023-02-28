package Banco.cuentas;

import java.time.LocalDate;

public class Cuenta{
    private final String titular;
    private double saldo = 100.0;
    private LocalDate fechaCreacion;

    public Cuenta(String titular){
        this("titular", 100.0, null);
    }
    public Cuenta(String titular, double saldo) {
        this("titular", saldo, null);
    }
    public Cuenta(String titular, double saldo, LocalDate fechaCreacion) {
        this.titular = titular;
        this.saldo = saldo;
        this.fechaCreacion = fechaCreacion;
    }


    public LocalDate getFechaCreacion() {
        return fechaCreacion;
    }
    public String getTitular() {
        return titular;
    }
    public double getSaldo() {
        return saldo;
    }
    
    public void depositar(double cantidad){
        saldo += cantidad;
    }
    public void retirar(double cantidad){
        if(cantidad >= saldo){
            saldo -= cantidad;
        }            
    }

}
