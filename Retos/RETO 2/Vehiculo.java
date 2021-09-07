public abstract class Vehiculo {
    //Inserte acá los atributos
    private String nombreConductor;
    private int nPasajeros;
    private double cantidadDinero;
    private int nMaximoPasajeros;
    private double localizacionX;
    private double localizacionY;
//    private boolean puertaAbierta;
    private boolean aireAcondicionadoActivado;
    private boolean motorEncendido;
    private boolean wifiEncendido;
    private boolean enMarcha;
    
    
    //Inserte acá el método constructor
    public Vehiculo (String nombreConductor, int nMaximoPasajeros){
	    this.nombreConductor = nombreConductor;
    	this.nPasajeros = 0;
    	this.cantidadDinero = 0;
   	    this.nMaximoPasajeros = nMaximoPasajeros;
    	this.localizacionX = 0;
    	this.localizacionY =0;
//    	this.puertaAbierta = puertaAbierta;
    	this.aireAcondicionadoActivado = false;
    	this.motorEncendido = false;
    	this.wifiEncendido = false;
    	this.enMarcha = false;
    }
    
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void dejarPasajero(){
        if (enMarcha == false){
        nPasajeros -=1;
        }
    }
    
    
    
    public double calcularDistanciaAcopio(){
        double suma = Math.pow(localizacionX, 2) + Math.pow(localizacionY, 2);
        return Math.sqrt(suma);
    }
    
//*    public void gestionarPuerta(){
        
//            if (puertaAbierta == true){
//                puertaAbierta = false;
//            }else{
//                if (enMarcha == false){
//                    puertaAbierta = true;
//            }     
//            }
//    }
    public void gestionarAireAcondicionado(){
         if (motorEncendido == true){
        if (aireAcondicionadoActivado == false){
            aireAcondicionadoActivado = true;
        }else{
           
            aireAcondicionadoActivado = false;
        } 
        aireAcondicionadoActivado = false;
        }    
    }
    public void gestionarMotor(){
        if (enMarcha == false){
        
            if (motorEncendido == true){
                
                    motorEncendido = false;
            }else{
                
                motorEncendido = true;
            }     
        }
    }
    
    public void gestionarWifi(){
        if (motorEncendido == true){
        if (wifiEncendido == false){
            wifiEncendido = true;
        }else{
            
            wifiEncendido = false;
        }
         wifiEncendido = false; 
        }    
    }
    public abstract void gestionarMarcha();
        //* metodo abstracto
//            if (enMarcha == true){
//                enMarcha = false;
//            }else{
//                if (puertaAbierta == false && motorEncendido == true){
//                enMarcha = true;
//            }     
//        }
    }    
    
    public void moverDerecha(double d){
        
            if (enMarcha == true){
                localizacionX += d;
        
            }
    }    
    
   public void moverIzquierda(double d){
        
            if (enMarcha == true){
                localizacionX -= d;
        
            }
    }    
    
    public void moverArriba(double d){
        
            if (enMarcha == true){
                localizacionY += d;
        
            }
    }    
   
    public void moverAbajo(double d){
        
            if (enMarcha == true){
                localizacionY -= d;
        
            }
    }       
    
    
    public abstract void gestionarMarcha();
  
    
    
    //Inserte acá los SETTERS Y GETTERS
    
    public String getNombreConductor(){
        return nombreConductor;
    }

    public int getnPasajeros(){
        return  nPasajeros;
    }    
    public double getCantidadDinero(){
        return  cantidadDinero;
    }    
    public int getnMaximoPasajeros(){
        return  nMaximoPasajeros;
    }    
    public double getLocalizacionX(){
        return  localizacionX;
    }    
    public double getLocalizacionY(){
        return  localizacionY;
    }    
//    public boolean isPuertaAbierta(){
//        return  puertaAbierta;
//    }
    public boolean isAireAcondicionadoActivado(){
         return  aireAcondicionadoActivado;
    }     
    public boolean isMotorEncendido(){
        return  motorEncendido;
    }
    public boolean isWifiEncendido(){
        return  wifiEncendido;
    }
    public boolean isEnMarcha(){
        return  enMarcha;
    }
    public void setNombreConductor(String nombreConductor){
        this.nombreConductor = nombreConductor;
    }
    public void setnPasajeros(int nPasajeros){
        this.nPasajeros = nPasajeros;   
 }    
    public void setCantidadDinero(double cantidadDinero){
        this.cantidadDinero = cantidadDinero;   
 }    
    public void setnMaximoPasajeros(int nMaximoPasajeros){
        this.nMaximoPasajeros = nMaximoPasajeros;   
 }    
    public void setLocalizacionX(double localizacionX){
        this.localizacionX = localizacionX;
    }    
    public void setLocalizacionY(double localizacionY){
        this.localizacionY = localizacionY;
    }   
//    public void setPuertaAbierta(boolean puertaAbierta){
//        this.puertaAbierta = puertaAbierta;
//    }
    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado){
         this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }     
    public void setMotorEncendido(boolean motorEncendido){
        this.motorEncendido = motorEncendido;
    }
    public void setWifiEncendido(boolean wifiEncendido){
        this.wifiEncendido = wifiEncendido;
    }
    public void setEnMarcha(boolean enMarcha){
        this.enMarcha = enMarcha;
    }

    
    
    
}