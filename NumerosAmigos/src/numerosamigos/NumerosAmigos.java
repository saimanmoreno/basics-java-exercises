package numerosamigos;

import java.util.Scanner;

public class NumerosAmigos {
    
    public static void main(String[] args) {
        
        Scanner ler=new Scanner(System.in);
        int n, m, cont1=0, cont2=0;
        System.out.print("Introduza um numero inteiro >> ");n = ler.nextInt();
        System.out.print("Introduza um outro numero inteiro >> ");m = ler.nextInt();
        
        System.out.print("\n\nDivisores proprios de "+n+" ===>>> ");
        for (int i=1; i<n; i++){
            if(n%i==0){
                System.out.print(i+" + ");
                cont1 += i;
            }
        }
        System.out.print(" = "+cont1);
        
        System.out.print("\n\nDivisores proprios de "+m+" ===>>> ");
        for (int i=1; i<=m; i++){
            
            if(m%i==0){
                System.out.print(i+" + ");
                cont2 += i;
            }
            
        }
        System.out.print(" = "+cont2);
        
        if(cont1 == m && cont2 == n){
            System.out.println("\n\nOs numeros são amigos!");
        }else{
            System.out.println("\n\nOs numeros não são amigos");
        }
    }
    
}



    