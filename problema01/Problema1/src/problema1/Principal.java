/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;
import java.util.Scanner;
import java.util.Locale;
/**
 *
 * @author SALA I
 */
public class Principal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        boolean bandera = true;
        int n;
        
        while (bandera) {
            System.out.print("\nELIJA UNA OPCION\n"
                    + "1.-Ingresar Nuevo Trabajador\n"
                    + "2.-Si desea salir del Programa\n");
            n = sc.nextInt();
            sc.nextLine();
            
            if (n == 1) {
                Enlace c = new Enlace();
                System.out.print("\nIngrese el numero de cedula del Trabajador: ");
                String cedula = sc.nextLine();
                System.out.print("Ingrese los nombres del Trabajador: ");
                String nombres = sc.nextLine();
                System.out.print("Ingrese el correo del Trabajador: ");
                String correo = sc.nextLine();
                System.out.print("Ingrese el sueldo del Trabajador: ");
                double sueldo = sc.nextInt();
                sc.nextLine();
                System.out.print("Ingrese el mes del sueldo del Trabajador: ");
                String mesSueldo = sc.nextLine();
                Trabajador traba = new Trabajador(cedula, nombres, correo, sueldo, mesSueldo);
                c.insertarTrabajador(traba);
                
            } else {
                if (n == 2) {
                    bandera = false;
                } else {
                    System.out.println("OPCION FUERA DE RANGO!!!");
                }
            }
        }
    }
}
