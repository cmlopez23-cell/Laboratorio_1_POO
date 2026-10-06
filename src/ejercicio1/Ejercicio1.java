/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio1;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner sc = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su Edad: ");
        edad = sc.nextInt();
        if(edad >= 18){
            if(edad > 65){
                if(edad > 105){
                    System.out.println("Excede la Edad");
                }else{
                    System.out.println("Eres de la Tercera Edad");
                }
            }else{
                System.out.println("Eres Mayor de Edad");
            }
        }else{
            if(edad < 0){
                System.out.println("Edad no Valida - Numero Negativo");
            }else{
                System.out.println("Eres Menor de Edad");
            }
        }
    }
    
}
