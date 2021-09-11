/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        //String nome = "Saiman";
        System.out.print("Digite o seu nome >> ");String nome = teclado.nextLine();
        
        //float nota = 8.5f; 
        //float nota = (float) 8.5;
        System.out.print("Digite a sua nota >> "); float nota = teclado.nextFloat(); 
        
        //System.out.println("A  Nota é "+ nota);
        System.out.printf("\n\nA Nota de %s é %.1f \n\n\n",nome, nota);
        //System.out.format("A  Nota de %s é %.1f \n",nome, nota);
    }
    
}
