public class Autobus extends Vehiculo {
    //              ^ (Autobus hereda de Vehiculo)
    //Inserte acá los atributos
    
    private boolean puertaAbierta;
    
    //Inserte acá el método constructor
    
    public Autobus (String nombreConductor, int nMaximoPasajeros){
	    super(nombreConductor, nMaximoPasajeros);
//    	this.nPasajeros = 0;
//    	this.cantidadDinero = 0;
//   	    this.nMaximoPasajeros = nMaximoPasajeros;
//    	this.localizacionX = 0;
//    	this.localizacionY =0;
    	this.puertaAbierta = false;
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void recogerPasajero (int estrato){
        if (super.getnPasajeros() < super.getnMaximoPasajeros() && puertaAbierta == false ){
            if (getenMarcha() == false){
            setnPasajeros(getnPasajeros()+1);
            cantidadDinero += this.calcularPasaje(estrato);
            }
        }
    }

   public void gestionarPuerta(){
        
            if (puertaAbierta == true){
                puertaAbierta = false;
            }else{
                if (isenMarcha() == false){
                    puertaAbierta = true;
            }     
            }
    }
    
    @override
    public void gestionarMarcha(){
        
            if (isenMarcha() == true){
                setEnMarcha(false);
            }else{
                if (puertaAbierta == false && isMotorEncendido() == true){
                setEnMarcha(true);
            }     
        }
    }    

    public static double calcularPasaje(int estrato){
                    if (estrato <= 2){
                double pasaje = 1500;
            } else if (estrato >= 5){
            double pasaje = 3000;
            } else{
            double pasaje = 2600;
            }
        return pasaje;
    }
    
    //Inserte acá los SETTERS Y GETTERS
    
    public boolean isPuertaAbierta(){
        return  puertaAbierta;
    }
    public void setPuertaAbierta(boolean puertaAbierta){
        this.puertaAbierta = puertaAbierta;
    }
    
}