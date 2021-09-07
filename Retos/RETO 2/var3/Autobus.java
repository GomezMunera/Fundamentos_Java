public class Autobus extends Vehiculo {
    //              ^ (Autobus hereda de Vehiculo)
    //Inserte acá los atributos
    
     private boolean puertaAbierta=false;
    
    //Inserte acá el método constructor
    public Autobus(String nombreConductor, int nMaximoPasajeros){
        super(nombreConductor, nMaximoPasajeros);
    }
        
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    
     public void recogerPasajero(int estrato){
       if(isEnMarcha()==false && puertaAbierta==true){
          if(getnPasajeros()< getnMaximoPasajeros()){
              setnPasajeros(getnPasajeros()+1);
              setCantidadDinero(getCantidadDinero()+this.calcularPasaje(estrato));
          }
       }
        
        
    }
    @Override
    public void gestionarMarcha(){
        if(puertaAbierta==false && isEnMarcha()==false){
            setEnMarcha(true);
        }else{
            setEnMarcha(false);
        }
        
        
    }
    
    public void gestionarPuerta(){
        if(puertaAbierta==false && isEnMarcha()==false){
            puertaAbierta=true;
        }else{
            puertaAbierta= false;
            
        }
        
    }
    
   public double calcularPasaje(int estrato){
       int valor=0;
       if(estrato>=0 && estrato<=2){
           valor=1500;
        }
        if(estrato>=3 && estrato<=4){
            valor=2600;
        }
        else if(estrato>=5 && estrato <=6){
            valor=3000;
            
        }
        return valor;
   }
    
    
    
    //Inserte acá los SETTERS Y GETTERS
    
    
    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }
    
    
}