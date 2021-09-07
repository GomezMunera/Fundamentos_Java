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
public class EmpleadoAsalariado extends Empleado {
    private double annualSalary;
    public EmpleadoAsalariado(String numberIn, String nameIn, double salaryIn)
    {
    super(numberIn,nameIn);
    annualSalary = salaryIn;
    }
    public void setAnnualSalary(double salaryIn)
    {
    annualSalary = salaryIn;
    }
    public double getAnnualSalary()
    {
    return annualSalary;
    }
    public double calculateMonthlyPay()
    {
    return annualSalary/12;
    }
}
