
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author isabe
 */
public class ADO7Parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String menu = "";
        ArrayList<String> respostas = new ArrayList();
        boolean verificaResposta = false;
        
        respostas.add("Nuclear");
        respostas.add("Eólica");
        respostas.add("Solar");
        respostas.add("Hidraulica");
        respostas.add("Biomasssa");
        
        do {
            Collections.shuffle(respostas);
                    
            System.out.println("\n Qual é a maior fonte de energia brasileira? ");
            System.out.println ("a - " + respostas.get(0));
            System.out.println("b - " + respostas.get(1));
            System.out.println("c - " + respostas.get(2));
            System.out.println ("d - " + respostas.get(3));
            System.out.println ("e - " + respostas.get(4));

            System.out.println ("Digite uma opção ");

            menu = input.next();

            switch (menu) {
                case "a":
                    if (respostas.get(0).equals("Hidraulica")){
                        verificaResposta = true;
                    } else {
                        System.out.print("Resposta incorreta");
                    }
                    break;

                case "b":
                    if (respostas.get(1).equals("Hidraulica")){
                        verificaResposta = true;
                    } else {
                        System.out.print("Resposta incorreta");
                    }
                    break;

                case "c":
                    if (respostas.get(2).equals("Hidraulica")){
                        verificaResposta = true;
                    } else {
                        System.out.print("Resposta incorreta");
                    }
                    break;


                case "d":
                    if (respostas.get(3).equals("Hidraulica")){
                        verificaResposta = true;
                    } else {
                        System.out.print("Resposta incorreta");
                    }
                    break;

                case "e":
                    if (respostas.get(4).equals("Hidraulica")){
                        verificaResposta = true;
                    } else {
                        System.out.print("Resposta incorreta");
                    }
                    break;

                default:
                    System.out.print("Resposta inválida");
                    break;
            } 

            
        } while (!menu.equals("d"));
        
        System.err.println("Resposta Correta");
    }
    
}


