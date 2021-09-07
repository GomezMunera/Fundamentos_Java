/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto2_v3;

public class Autobus extends Vehiculo{
    //              ^ (Autobus hereda de Vehiculo)
    //Inserte acá los atributos
    private boolean puertaAbierta = false;

    //Inserte acá el método constructor

    public Autobus(String nombreConductor, int nMaximoPasajeros) {
        super(nombreConductor, nMaximoPasajeros);
    }

    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public void recogerPasajero(int estrato){
        if(getnPasajeros() < getnMaximoPasajeros() && puertaAbierta){
            setCantidadDinero(getCantidadDinero() + calcularPasaje(estrato));
            setnPasajeros(getnPasajeros() + 1);
        }
    }
   
    @Override
    public void gestionarMarcha(){
        if(!isEnMarcha() && !puertaAbierta){
            setEnMarcha(true);
        }else{
            setEnMarcha(false);
        }
    }


    public void gestionarPuerta(){
        if(!puertaAbierta && !isEnMarcha()){
            puertaAbierta = true;        
        }else{
            puertaAbierta = false;
        }
    }
    
    public static double calcularPasaje(int estrato){
        if(estrato <= 2)
            return 1500;
        else if(estrato <= 4)
            return 2600;
        return 3000;
    }
    
    @Override
    public void dejarPasajero(){
        if(puertaAbierta && !isEnMarcha()){
            setnPasajeros(getnPasajeros() - 1);
        }
    }

    //Inserte acá los SETTERS Y GETTERS
    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

}
