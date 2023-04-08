/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

public class Ecuacion {
    public static String calcularEcuacion(double a, double b, double c){
        String resp;
        if(b-4*a*c>1){
            resp = "Se tienen dos soluciones: " + Math.round(((b + Math.sqrt(b-4*a*c))/2*a)*100.0)/100.0 + " y " + Math.round(((b - Math.sqrt(b-4*a*c))/2*a)*100.0)/100.0;
        }else if(b-4*a*c==0){
            resp = "Se tienen una solucion: " + Math.round((b/2*a)*100.0)/100.0;
        }else{
            resp = "No se tiene soluciones reales";
        }
        
        return resp;
    }
}
