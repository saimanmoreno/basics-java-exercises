/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabuada;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Tabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner (System.in);
        System.out.print("Introduza um numero >> ");int n = ler.nextInt();
        
        System.out.println("Tabuada "+n);
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }
        
    }
    
}
