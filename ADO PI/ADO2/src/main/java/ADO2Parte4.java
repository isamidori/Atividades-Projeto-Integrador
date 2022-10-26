
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class ADO2Parte4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println ("Contagem de letras");
        System.out.println ("Digite uma palavra");
        String palavra = input.next();
    
        
        int n = palavra.length();               
        
    
        System.out.println("A palavra contém " + n + " letras");
    }
    
}
