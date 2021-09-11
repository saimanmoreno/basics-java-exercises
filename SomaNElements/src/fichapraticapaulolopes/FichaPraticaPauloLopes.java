package fichapraticapaulolopes;

import java.util.Scanner;

/**
 *
 * @author Saiman The Marshall
 */
public class FichaPraticaPauloLopes {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int[] array = new int[10];
        int soma = 0, j = 10;
        float media;
        
        for(int i=0; i<array.length; i++){
            
            System.out.print("Introduza um numero inteiro (Restantes: "+ (j) +") >> ");
            array[i] = ler.nextInt();
            j--;
        }
        
        for(int i=0; i<array.length; i++){
            System.out.println("Array["+i+"] = "+array[i]);
            soma += array[i];
        }
        
        media = soma/10;
     
        System.out.println("A soma de todos os elementos do  vetor e: " + soma);
        System.out.println("A media entre os valores introduzidos e: " + media);
        
    }  
}
