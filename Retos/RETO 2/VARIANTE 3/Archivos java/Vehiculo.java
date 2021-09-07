package reto.pkg2.pkg2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mateo
 */
public abstract class Vehiculo {
    
    //ATRIBUTOS
    private String nombreConductor;
    private int nPasajeros = 0;
    private double cantidadDinero = 0;
    private int nMaximoPasajeros;
    private double localizacionX = 0;
    private double localizacionY = 0;
    private boolean aireAcondicionadoActivado = false;
    private boolean motorEncendido = false;
    private boolean wifiEncendido = false;
    private boolean enMarcha = false;
    
    //CONSTRUCTORfff
    public Vehiculo(String nombreConductor, int nMaximoPasajeros) {
        this.nombreConductor = nombreConductor;
        this.nMaximoPasajeros = nMaximoPasajeros;
    }
    
    //Otros métodos    
    public double calcularDistanciaAcopio(){
        return Math.sqrt(Math.pow(this.localizacionX, 2) + Math.pow(this.localizacionY,2));
    }
    
    public void gestionarAireAcondicionado(){
        this.aireAcondicionadoActivado = this.motorEncendido && !this.aireAcondicionadoActivado;
    }
    
    public void gestionarMotor(){
        if(!this.motorEncendido)
            this.motorEncendido = true;
        else{
            this.motorEncendido = false;
            this.aireAcondicionadoActivado = false;
            this.wifiEncendido = false;
            this.enMarcha = false;
        }
    }
    
    public void gestionarWifi(){
        this.wifiEncendido = this.motorEncendido && !this.wifiEncendido;        
    }
    
    public abstract void gestionarMarcha();
    
    public void dejarPasajero(){
        this.nPasajeros --;
    }
    
    public void moverDerecha(double d){
        if(this.isEnMarcha())
            this.localizacionX += d;
    }
    
    public void moverIzquierda(double d){
        if(this.isEnMarcha())
            this.localizacionX -= d;
    }
    
    public void moverArriba(double d){
        if(this.isEnMarcha())
            this.localizacionY += d;
    }
    
    public void moverAbajo(double d){
        if(this.isEnMarcha())
             this.localizacionY -= d;
    }
    
    //SETTERS Y GETTERS
    
    
    public String getNombreConductor() {
        return nombreConductor;
    }

    public void setNombreConductor(String nombreConductor) {
        this.nombreConductor = nombreConductor;
    }

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    public double getCantidadDinero() {
        return cantidadDinero;
    }

    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }
    
    
    
    
    
    
}
