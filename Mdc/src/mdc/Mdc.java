/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mdc;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Mdc {

    /**
     *
     * @param x
     * @param y
     * @return
     */
    public static int mdc( int x, int y ){
        if(x == y){
            return x;
        }
        else if( y > x ){
            return mdc( x, y-x );
        }
        else if( x > y ){
            return mdc( x - y, y );
        }
        return 0;
    }
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        System.out.print("1º numero >> ");int n1 = ler.nextInt();
        System.out.print("2º numero >> ");int n2 = ler.nextInt();
        System.out.println("MDC = "+mdc(n1,n2));
    }
    
}
