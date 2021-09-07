package co.edu.udea.MisionTIC.Ciclo2.Retos.Reto2;

public class CuentaBanco {

    //Inserte acá los atributos
    private String numeroCuenta;
    private String nombrePropietario;
    private double saldo;

    //Inserte acá el método constructor
    public CuentaBanco(String numeroCuenta, String nombrePropietario, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombrePropietario = nombrePropietario;
        this.saldo = saldo;
    }

    //Inserte acá los SETTERS Y GETTERS
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void depositar(double c) {
        this.saldo += c;
    }

    public void retirar(double c) {
        if (c + c * 0.05 <= this.saldo) {
            this.saldo -= (c + c * 0.05);
            System.out.println("hi");
        }
    }
}
