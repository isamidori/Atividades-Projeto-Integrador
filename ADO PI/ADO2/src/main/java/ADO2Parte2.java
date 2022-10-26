
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class ADO2Parte2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("3 Pimeiros multiplos");
        System.out.println("Informe um numero ");
        int numero = input.nextInt ();
        
        int i = 1;
        
        do {
            System.out.println("multiplo: " + (i * numero));
            i = i + 1;
        } while (i<= 3);
        
    }
    
}
