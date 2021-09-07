/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto.pkg2.pkg2;

/**
 *
 * @author mateo
 */
public class Taxi extends Vehiculo{
    
    //ATRBUTOS
    private double distanciaRecorrida = 0;
    private boolean segurosActivados = false;
    
    //CONSTRUCTOR
    public Taxi(String nombreConductor) {
        super(nombreConductor, 1);
    }
    
    //Otros métodos
    public void reiniciarTaximetro(){
        this.distanciaRecorrida = 0;
    }
    
    public void presionarBotonPanico(){
        this.setEnMarcha(false);
        this.segurosActivados = false;
        this.setnPasajeros(0);
    }
    
    @Override
    public void dejarPasajero(){
        this.setnPasajeros(this.getnPasajeros() - 1);
        this.reiniciarTaximetro();
        this.setCantidadDinero(this.getCantidadDinero() + this.calcularPasaje());
    }
    
    public void recogerPasajero(){
        if(!this.isSegurosActivados() && this.getnPasajeros() == 0)
            this.setnPasajeros(this.getnPasajeros() + 1);
    }
    
    @Override
    public void gestionarMarcha(){
        this.setEnMarcha(!this.isEnMarcha() && this.segurosActivados);
    }
    
    
    /*@Override*/
    @Override
    public void moverDerecha(double d){
        if(this.isEnMarcha()){
            this.setLocalizacionX(this.getLocalizacionX() + d);
            if(this.getnPasajeros() != 0)
                this.distanciaRecorrida += d;
        }
    }
    
    /*@Override*/
    @Override
    public void moverIzquierda(double d){
        if(this.isEnMarcha()){
            this.setLocalizacionX(this.getLocalizacionX() - d);
            if(this.getnPasajeros() != 0)
                this.distanciaRecorrida += d;
        }
    }
    
    /*@Override*/
    @Override
    public void moverArriba(double d){
        if(this.isEnMarcha()){
            this.setLocalizacionY(this.getLocalizacionX() + d);
            if(this.getnPasajeros() != 0)
                this.distanciaRecorrida += d;
        }
    }
    
    /*@Override*/
    @Override
    public void moverAbajo(double d){
        if(this.isEnMarcha()){
             this.setLocalizacionY(this.getLocalizacionX() - d);
            if(this.getnPasajeros() != 0)
                this.distanciaRecorrida += d;
        }
    }
    
    public double calcularPasaje(){
        return 3000 + 2300 * this.distanciaRecorrida;
    }
    
    public void gestionarSeguros(){
        this.segurosActivados = !(!this.isEnMarcha() && this.segurosActivados);
    }
    
    //SETTERS AND GETTERS

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
