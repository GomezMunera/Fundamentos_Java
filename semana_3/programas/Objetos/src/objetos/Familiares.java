/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetos;

/**
 *
 * @author johna
 */
public class Familiares {
    private String nombre;

    public Familiares(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //ESTO ES PARA PODER VER MÁS FACILMENTE LA INFORMACIÓN QUE CONTIENE LA
    // INSTANCIA QUE CREAMOS. CADA INSTANCIA (new Familiar("paco")) TE 
    //   MOSTRARA SU INFO.
    @Override
    public String toString(){

        return "Nombre: "+this.nombre;

    }
}
