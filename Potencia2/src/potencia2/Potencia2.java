/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia2;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Potencia2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner (System.in);
        System.out.print("Introduza um numero não-nulo >> ");int b = ler.nextInt();
        System.out.print("Introduza um numero inteiro positivo >> ");int e = ler.nextInt();
        
        
        for(int i=1;i<=e;i++){
            int pot = (int) pow(b,i);
            System.out.println(b+"^"+i+" = "+pot);
        }
    }
    
}
