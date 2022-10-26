
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class ADO2Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        System.out.println ("Calculo de produto");
        System.out.println ("Informe N1");
        double numero1 = input.nextInt ();
        System.out.println ("Informe N2");
        double numero2 = input.nextInt ();
        System.out.println("Informe N3");
        double numero3 = input.nextInt ();
        
        double calculoproduto = calcularproduto (numero1, numero2, numero3);
        System.out.println ("O valor do produto é: " + calculoproduto);
            
    }
    
    
    public static double calcularproduto (double numero1, double numero2, double numero3) {
    double calculoproduto = (numero1 * numero2 * numero3);
    return calculoproduto;
        
    }
    
}
