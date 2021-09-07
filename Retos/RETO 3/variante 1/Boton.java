public abstract class Boton {

    //Inserte acá los atributos
    private double ancho;
    private double alto;
    private String colorFondo;
    private String colorTexto;
    private String texto;

    //Inserte acá el método constructor
    public Boton(double ancho, double alto, String colorFondo, String colorTexto, String texto){
        this.ancho = ancho;
        this.alto = alto;
        this.colorFondo = colorFondo;
        this.colorTexto = colorTexto;
        this.texto = texto;
        
    }

    //Inserte acá los SETTERS Y GETTERS
    //ancho
    public void setAncho(double ancho){
        this.ancho = ancho;
         
    }
    
    public double getAncho(){
        return ancho;
    } 
    
    //alto
    public void setAlto(double alto){
         this.alto = alto;
    }
    
    public double getAlto(){
        return alto;
    } 
    
    // colorFondo
    public void setColorFondo(String colorFondo){
         this.colorFondo = colorFondo;
    }
    
    public String getColorFondo(){
        return colorFondo;
    } 
    
    // colorTexto
    public void setColorTexto(String colorTexto){
         this.colorTexto = colorTexto;
    }
    
    public String getColorTexto(){
        return colorTexto;
    } 
    
    //texto
    public void setTexto(String texto){
         this.texto = texto;
    }
    
    public String getTexto(){
        return texto;
    } 


    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    abstract public void hacerClick();
    

}