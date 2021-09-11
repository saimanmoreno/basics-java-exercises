/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par.ou.impar;

import java.util.Scanner;

public class ParOuImpar {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        do{
            System.out.printf("Digite um numero >> ");int n = ler.nextInt();
            if (n%2==0){
                System.out.println("O numero introduzido é par\n\n");
            }else{
                System.out.println("O numero introduzido é impar\n\n");
            }
        }while(true);
    }
}
