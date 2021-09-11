/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leitura.via.console;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class LeituraViaConsole {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner ler = new Scanner (System.in);
        //int n = ler.nextInt();
        //float preco = ler.nextFloat();
        //double salario = ler.nextDouble();
        
        do {
            String s;
       
        //String ss = ler.nextLine();
        //ler.nextLine();
        System.out.println("Informe uma cadeia de caracteres:\n");
        s = ler.nextLine();
        System.out.println("O que escreveste >> " + s);
        }while(true);
        
    }
    
}
