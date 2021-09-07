public class Taxi extends Vehiculo {
    //           ^ (Taxi hereda de Vehiculo)
    //Inserte acá los atributos
    
      double distanciaRecorrida = 0;
    boolean segurosActivados = false;
        
    //Inserte acá el método constructor

    public Taxi(String nombreConductor){
        super(nombreConductor,1);
    }   
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void reiniciarTaximetro(){
        distanciaRecorrida=0;
    }
    
    public void presionarBotonPanico(){
        this.reiniciarTaximetro();
        setEnMarcha(false);
        segurosActivados = false;
        this.dejarPasajero();
        setCantidadDinero(getCantidadDinero()-this.calcularPasaje());
    }
    
    @Override
    public void dejarPasajero(){
        if (getnPasajeros()>0 && !isEnMarcha() && !segurosActivados){
            setnPasajeros(getnPasajeros()-1);
            setCantidadDinero(getCantidadDinero() + this.calcularPasaje());
            this.reiniciarTaximetro();
        }
    }
    
    public void recogerPasajero(){
        if (!isEnMarcha() && !segurosActivados && getnPasajeros() < getnMaximoPasajeros()){
            setnPasajeros(1);
        }
    }
    
    @Override
    public void gestionarMarcha(){
        if (!isEnMarcha() && segurosActivados){
            setEnMarcha(true);
        }
        else{
        setEnMarcha(false);
        }
    }
    
    @Override
    public void moverDerecha(double d){
        if (isEnMarcha()){
            if (getnPasajeros() == 1 && segurosActivados){
                distanciaRecorrida += d;
            }
        setLocalizacionX(getLocalizacionX()+d);
        }
    }
    
    @Override
    public void moverIzquierda(double d){
        if (isEnMarcha()){
            if (getnPasajeros() == 1 && segurosActivados){
                distanciaRecorrida += d;
            }
        setLocalizacionX(getLocalizacionX()-d);
        }
    }
    
    @Override
    public void moverArriba(double d){
        if (isEnMarcha()){
            if (getnPasajeros() == 1 && segurosActivados){
                distanciaRecorrida += d;
            }
        setLocalizacionY(getLocalizacionY()+d);
        }
    }
    
    @Override
    public void moverAbajo(double d){
        if (isEnMarcha()){
            if (getnPasajeros() == 1 && segurosActivados){
                distanciaRecorrida += d;
            }
        setLocalizacionY(getLocalizacionY()-d);
        }
    }
    
    public double calcularPasaje(){
        return 3000 + (2300*distanciaRecorrida);
    }
    
    public void gestionarSeguros(){
        if (!isEnMarcha()){
            segurosActivados = !segurosActivados;
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