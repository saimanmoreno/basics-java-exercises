package soma.dos.divisores.proprios;

import java.util.Scanner;

public class SomaDosDivisoresProprios {
    
    public static void main(String[] args) {
        
        Scanner ler=new Scanner(System.in);
        int n, cont=0;
        System.out.print("Introduza um numero inteiro >> ");n = ler.nextInt();
        System.out.print(n+" = ");
        for (int i=2; i<n; i++){
            if(n%i==0){
                System.out.print(i+" + ");
                cont += i;
            }
        }
        System.out.println(" = "+cont);
     
    }
    
}
