
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class ADO6Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String menu = "";
        int tentativa = 0;
        
        do {
            
            tentativa  = tentativa + 1;
            
            System.out.println("\n Tentativa" + tentativa + ":");
            System.out.println("\n Qual é a maior fonte de energia brasileira? ");
            System.out.println ("a - Nuclear ");
            System.out.println("b - Eólica ");
            System.out.println("c - Solar" );
            System.out.println ("d - Hidráulica");
            System.out.println ("e - Biomassa ");

            System.out.println ("Digite uma opção ");



            menu = input.next();

            switch (menu) {
                case "a":
                    System.out.print("Resposta incorreta");
                    break;

                case "b":
                    System.out.print("Resposta incorreta ");
                    break;

                case "c":
                    System.out.print("Resposta incorreta ");
                    break;


                case "d":
                    System.out.print("Resposta correta");
                    System.out.print("\n Tentativas:" + tentativa);
                    break;

                case "e":
                    System.out.print("Resposta incorreta");
                    break;

                default:
                    System.out.print("Resposta inválida");
                    break;
            } 

            
        } while ((tentativa < 3) && (!menu.equals("d")));
        
        if (!menu.equals("d")){
            System.out.print("\nResposta incorreta nas " + tentativa + " tentativas");
        }
        
    }
    
}


