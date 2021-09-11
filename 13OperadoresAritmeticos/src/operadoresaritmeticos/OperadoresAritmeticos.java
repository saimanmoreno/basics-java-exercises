/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author pc
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        System.out.println("A media é " + m);
        
        int numero = 10;
        //System.out.println(numero);
        int valor = 4 + numero--;
        System.out.println(valor);
        //System.out.println(numero);
        
        int x = 4;
        x *= 2; // x=x+2
        System.out.println(x);
        
        float v = 8.4f;
        int ar = (int)Math.round(v);
        System.out.println(ar);*/
        
        double aleat = Math.random();
        int n = (int)(1 + aleat * (50-1)); //gerar numero aleatorio entre 1 e 50
        //System.out.println(aleat);
        System.out.println(n);
    }
    
}
