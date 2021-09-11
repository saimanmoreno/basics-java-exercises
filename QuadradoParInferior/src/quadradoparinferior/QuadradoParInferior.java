/*
 *Insere via teclado um nº inteiro qq, apresenta na tela o quadrado de todos os numeros pares
 *bem como o seu respetivo soma desses quadrados.
*/


package quadradoparinferior;

import static java.lang.Math.pow;
import java.util.Scanner;

public class QuadradoParInferior {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        int quad, n, soma;
        soma = 0;
        System.out.print("Introduza um numero >> "); n=ler.nextInt();
        for(int i=1;i<n;i++){
            if(i%2==0){
                quad = (int) pow(i,2);
                System.out.println("Quadrado de "+i+" = "+quad);
                soma += quad;
            }
        }
        System.out.println("A soma dos quadrados é "+soma);
    }
    
}
