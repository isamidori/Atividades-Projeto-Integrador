
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class ADO4Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero = 0;
        
        do {
            
        
        System.out.println("Digite um número de 1 a 7");
        numero = input.nextInt();
        
                                
        switch (numero) {
            case 1:
                System.out.print("Domingo");
                break;

            case 2:
                System.out.print("Segunda");
                break;

            case 3:
                System.out.print("Terça");
                break;

                
            case 4:
                System.out.print("Quarta");
                break;
                
            case 5:
                System.out.print("Quinta");
                break;
                
            case 6:
                System.out.println ("Sexta");
                break;
                
            case 7:
                System.out.println ("Sábado");
                break;
               
                
            default:
                System.out.print("Valor inválido! ");
                break;
        
        
        } 
        
        } while ((numero <= 0) || (numero > 7));
        
        
                       
              
    }
    
}
