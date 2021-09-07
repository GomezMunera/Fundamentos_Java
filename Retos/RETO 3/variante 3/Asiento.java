//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
public abstract class Asiento {

     //Inserte acá los atributos
    private char tipo;
    private String ID;
    private boolean pantallaEncendida = false;
    private double inclinacionSilla = 90;
    private boolean luzLecturaEncendida = false;
    private boolean luzAsistenciaEncendida = false;
    private boolean aireAcondicionadoEncendido = false;

    //Inserte acá el método constructor
    public Asiento(String ID,char tipo){
        this.tipo = tipo;
        this.ID = ID;
        
    }

    //Inserte acá los SETTERS Y GETTERS
    //tipo
    public void setTipo(char tipo){
        this.tipo = tipo;
    }
    
    public char getTipo(){
        return tipo;
    } 
    
    //ID
    public void setID(String ID){
         this.ID = ID;
    }
    
    public String getID(){
        return ID;
    } 
    
    // pantallaEncendida
    public void setPantallaEncendida(boolean pantallaEncendida){
         this.pantallaEncendida = pantallaEncendida;
    }
    
    public boolean isPantallaEncendida(){
        return pantallaEncendida;
    } 
    
    // inclinacionSilla
    public void setInclinacionSilla(double inclinacionSilla){
         this.inclinacionSilla = inclinacionSilla;
    }
    
    public double getInclinacionSilla(){
        return inclinacionSilla;
    } 
    
    //luzLecturaEncendida
    public void setLuzLecturaEncendida(boolean luzLecturaEncendida){
         this.luzLecturaEncendida = luzLecturaEncendida;
    }
    
    public boolean isLuzLecturaEncendida(){
        return luzLecturaEncendida;
    } 
    
    //luzAsistenciaEncendida
    public void setLuzAsistenciaEncendida(boolean luzAsistenciaEncendida){
         this.luzAsistenciaEncendida = luzAsistenciaEncendida;
    }
    
    public boolean isLuzAsistenciaEncendida(){
        return luzAsistenciaEncendida;
    } 
    
    //aireAcondicionadoEncendido
    public void setAireAcondicionadoEncendido(boolean aireAcondicionadoEncendido){
         this.aireAcondicionadoEncendido = aireAcondicionadoEncendido;
    }
    
    public boolean isAireAcondicionadoEncendido(){
        return aireAcondicionadoEncendido;
    } 


    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    // aire
    public void gestionarAireAcondicionado(){
        if(isAireAcondicionadoEncendido()) aireAcondicionadoEncendido = false;
        else aireAcondicionadoEncendido = true;
    }
    
    //pantalla
    public void gestionarPantalla(){
        if(isPantallaEncendida()) pantallaEncendida = false;
        else pantallaEncendida = true;
    }
    
    //luz lectura
    public void gestionarLuzLectura(){
        if(isLuzLecturaEncendida()) luzLecturaEncendida = false;
        else luzLecturaEncendida = true;
    }
    
    //luz asistencia
    public void gestionarLuzAsistencia(){
        if(isLuzAsistenciaEncendida()) luzAsistenciaEncendida = false;
        else luzAsistenciaEncendida = true;
    }
    
    public void aumentarInclinacion(double d){
        if(inclinacionSilla+d<=135) inclinacionSilla+=d;
        else inclinacionSilla = 135;
    }
    
    public void disminuirInclinacion(double d){
        if(inclinacionSilla-d>=0) inclinacionSilla-=d;
        else inclinacionSilla = 0;
    }
    
    abstract public void imprimirMenuPantalla();

}