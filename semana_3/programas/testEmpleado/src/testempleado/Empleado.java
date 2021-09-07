/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testempleado;

/**
 *
 * @author johna
 */
public class Empleado {
    private String number;
    private String name;
    public Empleado(String numberIn, String nameIn)
    {
        number = numberIn;
        name = nameIn;
    }
    public void setName(String nameIn)
    {
        name = nameIn;
    }
    public String getNumber()
    {
        return number;
    }
    public String getName()
    {
        return name;
    }
}
