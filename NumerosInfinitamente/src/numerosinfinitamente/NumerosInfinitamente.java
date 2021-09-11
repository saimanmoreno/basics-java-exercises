/*
    Desenvolva em java um algoritmo que leia infinitamente nº positivos ate que
    seja introduzido um numero menor que 0. No final o programa deve apresentar 
    o somatorio e a media de todos os numeros introduzidos via teclado. Use o 
    laço while
*/


package numerosinfinitamente;

import java.util.Scanner;

public class NumerosInfinitamente {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n=0, soma=0, m=0;
        float media;
        
        while(n>=0){
            System.out.print("Introduza um numero positivo >> ");n = ler.nextInt();
            if(n>=0){
                soma += n;
                m++;
            }
        }
        media = soma/m;
        System.out.println("O somatorio de todos os numeros introduzido é >> "+ soma);
        System.out.println("A media é >> " + media);
    }
    
}
