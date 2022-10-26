
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class ADO3Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Desconto de compra");
        System.out.println("Informe o valor total da compra");
        double valor = input.nextDouble();
        
        double valordedesconto = 0.00;
        double valorfinal = 0.00;
        
        if (valor >= 300) {
            valordedesconto = (valor * 20) / 100;
            valorfinal = valor - valordedesconto;
            System.out.println ("O valor final é: " + valorfinal);
            System.out.println ("Você teve " + valordedesconto +  " de desconto");
                     
        }
        
        else {
            valordedesconto = (valor * 15) / 100;
            valorfinal = valor - valordedesconto;
            System.out.println("O valor final é: " + valorfinal);
            System.out.println("Você teve " + valordedesconto + " de desconto");
                 
       
        
        }
        
    }
    
}
