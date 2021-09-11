/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qtdadekm;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class QtdadeKm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;
        do{
            System.out.print("Introduza os Km percorridos pela viatura (-1 para terminar): ");
            n = ler.nextInt();
        }while(n != (-1));
        System.out.println("O total de Km perccoridos foi "+n);
        
    }
    
}
