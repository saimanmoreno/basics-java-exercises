/*
 *Usando laço for, implemente em java um algoritmo que solicite ao usuario
 *Que teste os divisores comum entre n numeros.
 *O sistema deve solicitar que seja informado a qtidade de numeros a serem testados
 *logo em seguida o usuario deve informar os respetivos nº inteiros, uma vez 
 *os nºs terem sidos informados o sistema deve exibir o maximo divisor comum entre eles bem como
 *o maior divisor comum entre cada numero.
*/

package maximodivisorcomum;

import java.util.Scanner;

public class MaximoDivisorComum {


    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int n;
        int []v;
        System.out.print("Introduza a qtidade de numeros a ser introduzidos >> ");n = ler.nextInt();
        v = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Introduza o "+(i+1)+"º numero >> ");v[i]=ler.nextInt();
        }
        
        System.out.print("\n\nNumeros Escolhidos:");
        for(int i=0;i<n;i++){
            System.out.print(" "+v[i]);
            if(i!=(n-1)){
                System.out.print(", ");
            }
        }
        
        System.out.println("\n\n");
        for(int i=0; i<n;i++){
            System.out.print("Divisores de "+v[i]+" >>  ");
            for(int j=1;j<=v[i];j++){
                if(v[i]%j==0){
                    System.out.print(j);
                    if(v[i]!=j){
                        System.out.print(", ");
                    }
                }
            }
            System.out.println("\n");
        }
    }
}