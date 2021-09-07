/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5_variante1;

import java.util.ArrayList;
public class MU{
    //UTILIDADES
    public static void print(String mensaje){
        System.out.println(mensaje);
    }
    
    public static void printTrabajadores(Trabajador [] trabajadores, int caso){
        if(caso == 0)
            for(int i = 0; i < 4; i++)
                printTrabajador(trabajadores[i], i);
        else
            for(int i = 3; i < 6; i++)
                printTrabajador(trabajadores[i], i);
    }
    
    public static void printTrabajador(Trabajador t, int i){
        print("- t" + str(i+1) + " = Trabajador(" + t.getNombre() + ", " + t.getCC() + ", " + str(t.getSalarioPorHora()) + ", " + str(t.getHorasTrabajadas()) + ", " + str(t.getDiaNacimiento()) + ", " + str(t.getMesNacimiento()) + ", " + str(t.getYearNacimiento()) + ");");
    }
    
    public static void printCorrecto(int caso){
        double porcentajeError = 0.01;
        if(caso == 0){
            print("- Salario quincenal de la nómina: " + str(11120000));
            print("- Promedio de edad de la nómina: " + str(30.666666666666668) + "±" + str(porcentajeError * 30.666666666666668));
            print("- Desviación estándar de la edad de la nómina: " + str(14.383632673594278) + "±" + str(porcentajeError * 14.383632673594278));
            print("- Salario quincenal del trabajador con cédula 1037681391: " + str(5360000));
        }
        else if(caso == 1){
            print("- Salario quincenal de la nómina: " + str(4912000));
            print("- Promedio de edad de la nómina: " + str(25) + "±" + str(porcentajeError * 25));
            print("- Desviación estándar de la edad de la nómina: " + str(5) + "±" + str(porcentajeError * 5));
        }
        
    }
    
    public static void printIncorrecto(Nomina estudiante, int caso){
        if(caso == 0){
            print("- Salario quincenal de la nómina: " + estudiante.calcularSalarioQuincenalNomina());
            print("- Promedio de edad de la nómina: " + estudiante.promedioEdadNomina());
            print("- Desviación estándar de la edad de la nómina: " + estudiante.desviacionEstandarEdadNomina());
            print("- Salario quincenal del trabajador con cédula 1037681391: " + estudiante.salarioQuincenalTrabajador("1037681391"));
        }
        
        else if(caso == 1){
            print("- Salario quincenal de la nómina: " + estudiante.calcularSalarioQuincenalNomina());
            print("- Promedio de edad de la nómina " + estudiante.promedioEdadNomina());
            print("- Desviación estándar de la edad de la nómina " + estudiante.desviacionEstandarEdadNomina());
        }
    }
    
    public static void printArrayList(ArrayList<Trabajador> estudiante){
        for (int i = 0; i < estudiante.size(); i++)
            printTrabajador(estudiante.get(i), i);
    }
    
    
    public static int intC(String s){
        return Integer.valueOf(s);
    }
    
    public static String str(Object o){
        return String.valueOf(o);
    }
    
    public static void printVector(Object [] vector){
        if (vector.length == 0)
            System.out.println("[]");
        else{
            System.out.print("[");
            for(int i = 0; i < vector.length - 1; i++){
                System.out.print(vector[i].toString() + ", ");            
            }
            System.out.print(String.valueOf(vector[vector.length - 1]) + "]");
        }
    }
    
    public static boolean comparadorResultados(Nomina estudiante, int caso){
        double porcentajeError = 0.01;
        
        if(caso == 0){
            if(estudiante.calcularSalarioQuincenalNomina() != 11120000)
                return false;
            else if(!(Math.abs(estudiante.promedioEdadNomina() - 30.666666666666668) <= porcentajeError * 30.666666666666668))
                return false;
            else if(!(Math.abs(estudiante.desviacionEstandarEdadNomina() - 14.383632673594278) <= porcentajeError * 14.383632673594278))
                return false;
            else if(estudiante.salarioQuincenalTrabajador("1037681391") != 5360000)
                return false;
        }
        
        else if(caso == 1){
            if(estudiante.calcularSalarioQuincenalNomina() != 4912000)
                return false;
            else if(!(Math.abs(estudiante.promedioEdadNomina() - 25) <= porcentajeError * 25))
                return false;
            else if(!(Math.abs(estudiante.desviacionEstandarEdadNomina() - 5) <= porcentajeError * 5))
                return false;
        }
        
        return true;
        
    }
}
