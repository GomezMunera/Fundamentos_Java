public class Taxi extends Vehiculo {
    //           ^ (Taxi hereda de Vehiculo)
    //Inserte acá los atributos
    private double distanciaRecorrida = 0;
    private boolean segurosActivados = false;
    
    
    //Inserte acá el método constructor
    public Taxi(String nombreConductor) {
        super(nombreConductor, 1); //POr defecto, el numero maximo de pasajeros en el texi es uno.
    }
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
     public void reiniciarTaximetro() {
        this.distanciaRecorrida = 0; //Se asigna 0 a la distancia recorrida 

    }

    public void presionarBotonPanico() {
        this.setEnMarcha(false); //Se detiene la marcha del taxi.
        this.segurosActivados = false; //Los seguros estan desactivados.
        this.reiniciarTaximetro(); //Se reinicia el taximetro.
        this.setnPasajeros(0); //Se usar el metodo dejar pasajero y no generar cobro. 

    }

    @Override
    public void dejarPasajero() {

        //Condicional para verificar que el taxi este detenido, los seguros esten desactivados y hayan pasajeros dentro del taxi.
        if (this.isEnMarcha() == false && this.isSegurosActivados() == false && this.getnPasajeros() == 1) {
            this.setCantidadDinero(getCantidadDinero() + this.calcularPasaje()); //Se suma a la cantidad de dinero, el costo del pasaje segun la distancia recorrida.
            this.reiniciarTaximetro(); //Al dejar el pasajero se reincia el taximetro.
            this.setnPasajeros(0); //Se reinicia el numero de pasajeros a 0, pues se considera solo 1 persona por cada viaje (Asi viajen 5 personas, solo se considera 1).
        }

    }

    public void recogerPasajero() {
        //Condicional para verificar que el taxi este detenido, los seguros esten desactivados y no hayan pasajeros dentro
        if (this.isEnMarcha() == false && this.isSegurosActivados() == false && this.getnPasajeros() == 0) {
            this.setnPasajeros(1); //Se escribe el numero de pasajeros a 1, pues se considera solo 1 persona por cada viaje (Asi viajen 5 personas, solo se considera 1).
        }

    }

    @Override
    public void gestionarMarcha() {

        //Condicional para poner en marcha el taxi solo si los seguros estan activados y este se encuentra previamente en detenido. Se detiene la marcha si se presiona el boton de panico. En cualquier otro caso, se detiene el taxi.
        if (this.segurosActivados == true && this.isEnMarcha() == false) {
            this.setEnMarcha(true);

        } else { // En cualquier otro caso, se detiene el taxi.
            this.setEnMarcha(false);
        }

    }

    public double calcularPasaje() {

        //La carrera de un taxi se calcula con 3000 pesos de base y 2300 por cada km recorrido.
        return 3000 + 2300 * this.distanciaRecorrida;

    }

    public void gestionarSeguros() {
        //Si el texi esta detenido con con los seguros activados, estos se desactivan.
        if (this.segurosActivados == true && this.isEnMarcha() == false) {
            this.segurosActivados = false;
        } else {
            this.segurosActivados = true; //En cualquier otro caso, se activan los seguros.
        }
    }

    @Override
    public void moverDerecha(double d) {
        if (this.isEnMarcha() == true) { //Condicional para verificar que el vehiculo este en marcha antes de cambiar su posicion
            this.setLocalizacionX(this.getLocalizacionX() + d);//Sumamos el numero de pixeles a mover el vehiculo a la derecha a la posicion en X.
            if (getnPasajeros() == 1) {
                this.distanciaRecorrida += d;
            }
        }
    }

    @Override
    public void moverIzquierda(double d) {
        if (this.isEnMarcha() == true) { //Condicional para verificar que el vehiculo este en marcha antes de cambiar su posicion
            this.setLocalizacionX(this.getLocalizacionX() - d); //Restamos el numero de pixeles a mover el vehiculo a la izquierda a la posicion en X.
            if (getnPasajeros() == 1) {
                this.distanciaRecorrida += d;
            }
        }
    }

    @Override
    public void moverArriba(double d) {
        if (this.isEnMarcha() == true) { //Condicional para verificar que el vehiculo este en marcha antes de cambiar su posicion
            this.setLocalizacionY(this.getLocalizacionY() + d); //Sumamos el numero de pixeles a mover el vehiculo arriba a la posicion en Y.
            if (getnPasajeros() == 1) {
                this.distanciaRecorrida += d;
            }
        }
    }

    @Override
    public void moverAbajo(double d) {
        if (this.isEnMarcha() == true) { //Condicional para verificar que el vehiculo este en marcha antes de cambiar su posicion
            this.setLocalizacionY(this.getLocalizacionY() - d); //Restamos el numero de pixeles a mover el vehiculo abajo a la posicion en Y.
            if (getnPasajeros() == 1) {
                this.distanciaRecorrida += d;
            }
        }
    }
    
    
    //Inserte acá los SETTERS Y GETTERS
     public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public boolean isSegurosActivados() {
        return segurosActivados;
    }

    public void setSegurosActivados(boolean segurosActivados) {
        this.segurosActivados = segurosActivados;
    }
    
    
}