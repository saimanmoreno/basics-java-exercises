/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fatorial;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Fatorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner (System.in);
        int count=1;
        System.out.print("Introduza um numero inteiro >> "); int n = ler.nextInt();
        System.out.print(n+"! = ");
        for(int i=n;i>0;i--){
            System.out.print(i+"*");
            count *= i;
        }
        System.out.println(" = "+count);
    }
    
}
