package co.edu.udea.MisionTIC.Ciclo2.Retos.Reto2;

public class CuentaAhorro extends CuentaBanco {

    //Inserte acá el método constructor
    public CuentaAhorro(String numeroCuenta, String nombrePropietario, double saldo) {
        super(numeroCuenta, nombrePropietario, saldo);
    }

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public double getIEA(double saldo) {
        if (super.getSaldo() < 1000000) {
            return 0.01;
        } else if (super.getSaldo() >= 1000000 && super.getSaldo() < 2000000) {
            return 0.0175;
        } else if (super.getSaldo() >= 2000000) {
            return 0.023;
        } else {
            return 0; // Java se queja si no pongo este return
        }
    }

    public void pagarInteres(int dias) {
        if (dias <= 1) {
            return;
        }
        for (int i = 0; i < dias; i++) {
            super.setSaldo(super.getSaldo() * (1 + getIEA(super.getSaldo()) / 365));
        }
    }
}
