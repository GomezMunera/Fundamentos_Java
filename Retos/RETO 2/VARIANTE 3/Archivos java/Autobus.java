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
public class Autobus extends Vehiculo{
    
    //ATRIBUTOS
    private boolean puertaAbierta = false;
    
    //CONSTRUCTOR

    public Autobus(String nombreConductor, int nMaximoPasajeros) {
        super(nombreConductor, nMaximoPasajeros);
    }
    
    //OTROS MÉTODOS
    public void recogerPasajero(int estrato){
        if(this.getnPasajeros() < this.getnMaximoPasajeros() && this.puertaAbierta){
            this.setCantidadDinero(this.getCantidadDinero() + calcularPasaje(estrato));
            this.setnPasajeros(this.getnPasajeros() + 1);
        }
    }
    
    public static double calcularPasaje(int estrato){
        if(estrato <= 2)
            return 1500;
        else if(estrato <= 4)
            return 2600;
        return 3000;
    }
    
    public void gestionarPuerta(){
        this.puertaAbierta = !this.puertaAbierta && !this.isEnMarcha();        
    }
    
    public void gestionarMarcha(){
        this.setEnMarcha(!this.isEnMarcha() && !this.puertaAbierta);
    }
    
    //SETTERS AND GETTERS

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
    
}
