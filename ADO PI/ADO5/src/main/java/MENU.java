
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class MENU {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int menu = 0;
        
        do {
            
        
        System.out.println("\nMenu");
        System.out.println ("1 - Instruçoes ");
        System.out.println("2 - Jogar");
        System.out.println("3 - Créditos" );
        System.out.println ("4 - Sair");
        
        System.out.println ("Digite uma opção ");
        
        
        
        menu = input.nextInt();
        
        switch (menu) {
            case 1:
                System.out.print("Digite outra opção ");
                break;

            case 2:
                System.out.print("Digite outra opção ");
                break;

            case 3:
                System.out.print("Digite outra opção ");
                break;

                
            case 4:
                System.out.println("Obrigada, até logo ");
                break;
                
            default:
                System.out.print("Digite outra opçaõ de 1 a 4");
                break;
        } 
        
        } while (menu != 4);
        
                
        
                
              
    }
    
}
