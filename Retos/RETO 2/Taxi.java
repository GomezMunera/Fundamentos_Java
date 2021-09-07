public class Taxi extends Vehiculo{
    //           ^ (Taxi hereda de Vehiculo)
    //Inserte acá los atributos
    
        private double distanciaRecorrida = 0;
        private boolean segurosActivados = false;
    
    //Inserte acá el método constructor
    
    public Taxi (String nombreConductor){
     super(nombreConductor, nMaximoPasajeros);
    
    }
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void reiniciarTaximetro(){
        distanciaRecorrida=0;
    }

    public void presionarBotonPanico(){
        setEnMarcha(false);
        segurosActivados=false;
        setnPasajeros(0);
        reiniciarTaximetro();
        calcularPasaje();
    }    
    
@Override    
    public void dejarPasajero(){
        if (isenMarcha == false){
            calcularPasaje(distanciaRecorrida);
            setCantidadDinero(getCantidadDinero()+Pasaje);
        setnPasajeros(0);
        reiniciarTaximetro();
        }
    }
    
    public void recogerPasajero (){
        if (getnPasajeros() < getnMaximoPasajeros() ){
            if (isEnMarcha() == false){
            segurosActivados = true;
            setnPasajeros(getnPasajeros()+1);
    

    public void gestionarMarcha(){
            if (isEnMarcha() == true){
                setEnMarcha(false);
            }else{
                if (segurosActivados == true){ 
                    if(getMotorEncendido() == true){
                setEnMarcha(true);
                    }     
                }
            }
    }        

@Override
    public void moverDerecha(double d){
        
            if (isEnMarcha() == true){
                setLocalizacionX(getLocalizacionX() + d);
                
            if (getnPasajeros() == 1){
                distanciaRecorrida +=d;
            }
            }
    }    
@Override
   public void moverIzquierda(double d){
        if (isEnMarcha() == true){
                setLocalizacionX(getLocalizacionX() - d);
            
        if (getnPasajeros() == 1){
                distanciaRecorrida +=d;
            }
            }
    }    
@Override    
    public void moverArriba(double d){
        if (isEnMarcha() == true){
            setLocalizacionY(getLocalizacionY() - d);
            if (getnPasajeros() == 1){
                distanciaRecorrida +=d;
            }
            }
    }    
    
@Override
    public void moverAbajo(double d){
        if (isEnMarcha() == true){
                setLocalizacionY(getLocalizacionY() - d);
        if (getnPasajeros() == 1){
                distanciaRecorrida +=d;
            }
            }
    }    
    
    public double calcularPasaje(int distanciaRecorrida){
                double pasaje = 0;
        if (distanciaRecorrida == 0){
            pasaje=0;
        }else{
            pasaje = 3000 + 2300*this.distanciaRecorrida;
        }    
        
        return pasaje;
    }
    
    public void gestionarSeguros(){
        if(isEnMarcha()==false){
            if(segurosActivados==true){
                segurosActivados=false;
            }
        }else{
        segurosActivados=true;
    }
    
    //Inserte acá los SETTERS Y GETTERS
    
    public boolean isSegurosActivados(){
        return  segurosActivados;
    }
    public void setSegurosActivados(boolean segurosActivados){
        this.segurosActivados = segurosActivados;
    }
    
    public double getdistanciaRecorrida(){
        return  distanciaRecorrida;
    }    
        public void setdistanciaRecorrida(double distanciaRecorrida){
        this.distanciaRecorrida = distanciaRecorrida;
    }   
}
    
}