public abstract class Vehiculo {
    //Inserte acá los atributos
    
    private String nombreConductor;
    private int nPasajeros = 0;
    private int nMaximoPasajeros;
    private double cantidadDinero = 0;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;
    
    
    //Inserte acá el método constructor
    
    public Vehiculo(String nombreConductor, int nMaximoPasajeros) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;

    }

    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public abstract void gestionarMarcha();
    
    public void dejarPasajero() {

        //Condicional para evitar modificar el numero de pasajeros cuando estos son 0.
        if (this.nPasajeros > 0) {
            this.nPasajeros -= 1;
        }

    }

    public double calcularDistanciaAcopio() {

        return Math.sqrt(Math.pow(localizacionX, 2) + Math.pow(localizacionY, 2)); //Se calcula la distancia recorrida segun el teorema de Pitagoras.
    }

    public void gestionarAireAcondicionado() {
        //Condicional para encender el aire acondicionado solo si el motor esta encendido y este esta previamente apagado. En cualquier otro caso se apaga.
        if (this.motorEncendido == true && this.aireAcondicionadoActivado == false) {
            this.aireAcondicionadoActivado = true;
        } else {
            this.aireAcondicionadoActivado = false;
        }

    }

    public void gestionarMotor() {

        if (this.motorEncendido == true) { //Si el motor esta encendido, este se apaga y ademas se apagan el WiFi, aire acondicionado y se detiene la marcha.
            this.motorEncendido = false;
            this.wifiEncendido = false;
            this.aireAcondicionadoActivado = false;
            this.enMarcha = false;
        } else {
            this.motorEncendido = true; //Si el motor esta apagado, se enciende.
        }

    }

    public void gestionarWifi() {
        //Condicional para encender el WiFi solo si el motor esta encendido y este esta previamente apagado. En cualquier otro caso se apaga.
        if (this.motorEncendido == true && this.wifiEncendido == false) {
            this.wifiEncendido = true;
        } else {
            this.wifiEncendido = false;
        }
    }

    public void moverDerecha(double d) {
        if (this.isEnMarcha() == true) { //Condicional para verificar que el vehiculo este en marcha antes de cambiar su posicion
            this.localizacionX += d; //Sumamos el numero de pixeles a mover el personaje a la derecha a la posicion en X.
        }
    }

    public void moverIzquierda(double d) {
        if (this.isEnMarcha() == true) { //Condicional para verificar que el vehiculo este en marcha antes de cambiar su posicion
            this.localizacionX -= d; //Restamos el numero de pixeles a mover el personaje a la izquierda a la posicion en X.
        }
    }

    public void moverArriba(double d) {
        if (this.isEnMarcha() == true) { //Condicional para verificar que el vehiculo este en marcha antes de cambiar su posicion
            this.localizacionY += d; //Sumamos el numero de pixeles a mover el personaje arriba a la posicion en Y.
        }
    }

    public void moverAbajo(double d) {
        if (this.isEnMarcha() == true) { //Condicional para verificar que el vehiculo este en marcha antes de cambiar su posicion
            this.localizacionY -= d; //Restamos el numero de pixeles a mover el personaje abajo a la posicion en Y.
        }
    }
    
    
    //Inserte acá los SETTERS Y GETTERS
    public String getNombreConductor() {
        return nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    //Setters
    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public void setMotorEncendido(boolean motorEncendid) {
        this.motorEncendido = motorEncendid;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }
    
    
}