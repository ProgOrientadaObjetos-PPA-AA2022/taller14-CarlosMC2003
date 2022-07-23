/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author SALA I
 */
public class Trabajador {
    private String cedula;
    private String nombres;
    private String correo;
    private double sueldo;
    private String mesSueldo;
    
    public Trabajador(String id, String nom, String corre,
            double su, String mes) {
        cedula = id;
        nombres = nom;
        correo = corre;
        sueldo = su;
        mesSueldo = mes;
    }
    
   public void establecerCedula(String n) {
       cedula = n;
   }
   
   public void establecerNombres(String n) {
       nombres = n;
   }
   
   public void establecerCorreo(String n) {
       correo = n;
   }
   
   public void establecerSueldo(double n) {
       sueldo = n;
   }
   
   public void establecerMesSueldo(String n) {
       mesSueldo = n;
   }
   
   public String obtenerCedula() {
       return cedula;
   }
   
   public String obtenerNombres() {
       return nombres;
   }
   
   public String obtenerCorreo() {
       return correo;
   }
   
   public double obtenerSueldo() {
       return sueldo;
   }
   
   public String obtenerMesSueldo() {
       return mesSueldo;
   }
}
