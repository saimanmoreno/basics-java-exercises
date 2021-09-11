/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programaidade;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class ProgramaIdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 1;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Em que Ano Nasceste??? >> ");int nasc = teclado.nextInt();
        int i = 2019 - nasc;
        System.out.println("Sua Idade é "+ i);
        if (i > 18){
            System.out.println("Ès Velho Pah kkkk");
        }else{
            System.out.println("Quale Quatorzinha kkk");
        }
    }
    
}
