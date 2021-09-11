/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorteio;

import java.security.SecureRandom;
import java.util.ArrayList;

/**
 *
 * @author pc
 */
public class Sorteio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        SecureRandom rand = new SecureRandom();
        ArrayList <Integer> v2 = new ArrayList<>();
        int a;
        
        //gerar os numeros aleatorios
        for(int i=0; i<8; i++){
            a = 1+rand.nextInt(8); 
            if(v2.contains(a)) i--;
            else v2.add(a);                      
        }
        System.out.println(v2);
    }
}
