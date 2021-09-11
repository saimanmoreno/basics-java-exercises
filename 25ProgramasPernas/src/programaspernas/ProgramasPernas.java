/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaspernas;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ProgramasPernas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner tec = new Scanner (System.in);
        while (true){
        System.out.print("Quantas Pernas tens? >> ");int pernas = tec.nextInt();
        String tipo;
        System.out.print("\nEs é um(a) ");
        
        switch(pernas){
            case 1:
                tipo = "saci";
                break;
            case 2:
                tipo = "bípede";
                break;
            case 3: 
                tipo = "tripé";
                break;
            case 4:
                tipo = "quadrupede";
                break;
            case 6:
                tipo = "aranha";
                break;
            case 100:
                tipo = "centopeia";
                break;
            default:
                tipo = "Caralho!!!Ès um ET";
        }
        System.out.println(tipo);
        
    }
    }
    
}
