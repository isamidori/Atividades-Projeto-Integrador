
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class ADO2Parte3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Tabuada");
        int numero = 0;
    
     do { 
        System.out.println("Informe um numero de 1 a 10 ");
        numero = input.nextInt();
       
       } while ((numero < 0) || (numero > 10));
    
     int i = 1;
    
    do {
            System.out.println(numero + " X " + i + " = " + (i * numero));
            i = i + 1;
        } while (i<= 10);
    
    
    
    }
}
