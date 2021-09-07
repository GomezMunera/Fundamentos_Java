public class Autobus extends Vehiculo {
    //              ^ (Autobus hereda de Vehiculo)
    //Inserte acá los atributos
     private boolean puertaAbierta = false;
    
    
    //Inserte acá el método constructor
    public Autobus(String nombreConductor, int nMaximoPasajeros) {
        super(nombreConductor, nMaximoPasajeros);
    }
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
     public void recogerPasajero(int estrato) {

        //Condicional para verificar que se puede recoger un pasajero siempre que el Autobus no este en marcha, la puerta este abierta y el numero de pasajeros no exceda el maximo permitido.
        if (this.isEnMarcha() == false && this.puertaAbierta == true && this.getnPasajeros() < this.getnMaximoPasajeros()) {
            //Sumamos a la cantidad de Dinero, el valor del pasaje del pasajero segun su estrato. (Calculado en el metodo calcularPasaje).
            this.setCantidadDinero(this.getCantidadDinero() + this.calcularPasaje(estrato));
            this.setnPasajeros(this.getnPasajeros() + 1); //Sumamos 1 al numero de pasajeros

        }
    }

    @Override
    public void dejarPasajero() {

        //Condicional para evaluar si la puerta esta abierta, el autobus esta detenido y no hay 0 pasajeros en el Autobus.
        if (this.isEnMarcha() == false && this.puertaAbierta == true && this.getnPasajeros() > 0) {
            this.setnPasajeros(getnPasajeros() - 1);

        }

    }

    public void gestionarPuerta() {

        //Condicional para abrir la puerta del Autobus solo si el vehiculo NO esta en marcha y esta esta previamente cerrada. En cualquier otro caso se cierra.
        if (this.puertaAbierta == false && this.isEnMarcha() == false) {
            this.puertaAbierta = true;

        } else {
            this.puertaAbierta = false;

        }

    }

    @Override
    public void gestionarMarcha() {

        //Condicional para activar la marcha del Autobus solo si la puerta esta cerrada, el motor esta encendido y este NO se encuentra previamente en marcha. En cualquier otro caso se detiene.
        if (this.puertaAbierta == false && this.isEnMarcha() == false && isMotorEncendido() == true) {
            this.setEnMarcha(true);

        } else {
            this.setEnMarcha(false);

        }

    }

    public static double calcularPasaje(int estrato) {

        //Condicional para evaluar el precio del pasaje de acuerdo al estrato del pasajero.
        if (estrato >= 0 && estrato <= 2) {
            return 1500;

        } else if (estrato >= 3 && estrato <= 4) {
            return 2600;

        } else if (estrato >= 5 && estrato <= 6) {
            return 3000;
        }
        return 0;

    }
    
    
    //Inserte acá los SETTERS Y GETTERS
     //Metodos set y get para el atributo privado.
    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
    
    
}