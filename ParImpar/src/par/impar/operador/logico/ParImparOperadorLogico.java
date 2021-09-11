/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par.impar.operador.logico;

import java.util.Scanner;

public class ParImparOperadorLogico {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        String s;
        System.out.printf("Digite um numero >> ");int n = ler.nextInt();
        s=(n%2==0)?"O numero introduzido é par":"O numero introduzido é impar";
        System.out.println(s);
    }
    
}
