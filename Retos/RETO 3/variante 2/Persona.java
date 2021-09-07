public abstract class Persona {

    //Inserte acá los atributos
    private String id;
    private String nombre;
    private String email;
    private String idioma;

    //Inserte acá el método constructor
    public Persona(String id, String nombre, String email,String idioma){
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.idioma = idioma;
    }

    //Inserte acá los SETTERS Y GETTERS

    
    // id
    public void setId(String id){
         this.id = id;
    }
    
    public String getId(){
        return id;
    } 
    
    // nombre
    public void setNombre(String nombre){
         this.nombre = nombre;
    }
    
    public String getNombre(){
        return nombre;
    } 
    
    //email
    public void setEmail(String email){
         this.email = email;
    }
    
    public String getEmail(){
        return email;
    } 
    
    // idioma
    public void setIdioma(String idioma){
         this.idioma = idioma;
    }
    
    public String getIdioma(){
        return idioma;
    } 


    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    abstract public void dirigir();
    
}