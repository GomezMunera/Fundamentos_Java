package co.edu.udea.MisionTIC.Ciclo2.Retos.Reto2;

public class CuentaCorriente extends CuentaBanco {

    //Inserte acá los atributos
    private double cuotaManejo;

    //Inserte acá el método constructor
    public CuentaCorriente(String numeroCuenta, String nombrePropietario, double saldo, double cuotaManejo) {
        super(numeroCuenta, nombrePropietario, saldo);
        this.cuotaManejo = cuotaManejo;
    }

    //Inserte acá los SETTERS Y GETTERS
    public double getCuotaManejo() {
        return cuotaManejo;
    }

    public void setCuotaManejo(double cuotaManejo) {
        this.cuotaManejo = cuotaManejo;
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void cobrarCuotaManejo () {
        super.setSaldo(super.getSaldo() - this.cuotaManejo);
    }
}
