package numeroprimo;

import java.util.Scanner;

public class NumeroPrimo {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int n;
        do{
            System.out.print("Entre com um numero (0 para sair) >> "); n=ler.nextInt();
            for(int i=1; i<n; i++){
                if(n%i==0 && i!=1){
                    System.out.println("Numero não é primo!\n\n");
                    i=n;
                    break;
                }else{
                    System.out.println("Numero Primo\n\n");
                    i=n;
                    break;
                }
            }
        }while(n!=0);
        
    }
    
    
}
