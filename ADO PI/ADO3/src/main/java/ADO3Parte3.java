
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class ADO3Parte3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Verificação de ano bissexto");
        System.out.println("Informe um ano com 4 digitos");
        int ano = input.nextInt();
        System.out.println(ano % 400);
        System.out.println(ano % 4);
        System.out.println(ano % 100);
        
    if ( ( ( ano % 4 == 0 ) && ( ano % 100 != 0 ) ) || ( ano % 400 == 0 ) ) {
        
    System.out.println (ano + " É bissexto ");
    }
    
    else {
    System.out.println (ano + "  Não é bissexto");
    
    }
    
    }
        
}    
    
    

