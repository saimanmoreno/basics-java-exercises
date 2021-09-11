/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package potencia;

import static java.lang.Math.pow;
import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Potencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner ler = new Scanner (System.in);
        int pot;
        System.out.println("Introduza um numero >> ");int n = ler.nextInt();
        System.out.println("Potencias de 2 menores que "+n);
        for(int i=0;i<n;i++){
            pot = (int) pow(2,i);
            System.out.println("2^"+i+" = "+pot);
        }
    }
    
}
