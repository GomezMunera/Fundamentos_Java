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
public class EmpleadoTiempoParcial extends Empleado{
    private double hourlyPay; // this attribute is unique to the subclass
    // the constructor
    public EmpleadoTiempoParcial(String numberIn, String nameIn, double hourlyPayIn)
    {
        super(numberIn, nameIn); // call the constructor of the superclass
        hourlyPay = hourlyPayIn;
    }
    // these methods are also unique to the subclass
    public double getHourlyPay()
    {
        return hourlyPay;
    }
    public void setHourlyPay(double hourlyPayIn)
    {
        hourlyPay = hourlyPayIn;
    }
    public double calculateWeeklyPay(int noOfHoursIn)
    {
        return noOfHoursIn * hourlyPay;
    }
}
