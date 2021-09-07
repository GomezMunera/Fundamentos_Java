/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2_v3;

public class Taxi extends Vehiculo{
    //           ^ (Taxi hereda de Vehiculo)
    //Inserte acá los atributos
    private double distanciaRecorrida = 0;
    private boolean segurosActivados = false;

    //Inserte acá el método constructor
    public Taxi(String nombreConductor) {
        super(nombreConductor, 1);
    }

    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void reiniciarTaximetro(){
        distanciaRecorrida = 0;
    }
    
    public void presionarBotonPanico(){
        setEnMarcha(false);
        segurosActivados = false;
        setnPasajeros(0);
    }
    
    
    @Override
    public void dejarPasajero(){
        setnPasajeros(getnPasajeros() - 1);
        reiniciarTaximetro();
        setCantidadDinero(getCantidadDinero() + calcularPasaje());
    }
    
    public void recogerPasajero(){
        if(!isSegurosActivados() && getnPasajeros() == 0)
            setnPasajeros(getnPasajeros() + 1);
    }
    
    public void gestionarSeguros(){
        
        if(!isEnMarcha() && segurosActivados){
            segurosActivados = false;
        }else{
            segurosActivados = !(!isEnMarcha() && segurosActivados);
        }
    }
    
    public double calcularPasaje(){
        return 3000 + 2300 * distanciaRecorrida;
    }


    @Override
    public void moverDerecha(double d){
        if(this.isEnMarcha()){
            this.setLocalizacionX(this.getLocalizacionX() + d);
            if(this.getnPasajeros() != 0)
                this.distanciaRecorrida += d;
        }

    }
    
    @Override
    public void moverIzquierda(double d){
        if(this.isEnMarcha()){
            this.setLocalizacionX(this.getLocalizacionX() - d);
            if(this.getnPasajeros() != 0)
                this.distanciaRecorrida += d;
        }

    }
    
    @Override
    public void moverAbajo(double d){
        if(this.isEnMarcha()){
             this.setLocalizacionY(this.getLocalizacionX() - d);
            if(this.getnPasajeros() != 0)
                this.distanciaRecorrida += d;
        }

    }

    @Override
        public void moverArriba(double d){
            if(this.isEnMarcha()){
            this.setLocalizacionY(this.getLocalizacionX() + d);
            if(this.getnPasajeros() != 0)
                this.distanciaRecorrida += d;
        }

        }

    @Override
    public void gestionarMarcha(){
        //setEnMarcha(!isEnMarcha() && segurosActivados);
        this.setEnMarcha(!this.isEnMarcha() && this.segurosActivados);
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