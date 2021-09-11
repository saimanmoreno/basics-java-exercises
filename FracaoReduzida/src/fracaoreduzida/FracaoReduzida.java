package fracaoreduzida;

import java.util.Scanner;

public class FracaoReduzida {
    
    public static void main(String[] args) {
        
        Scanner ler = new Scanner (System.in);
        int num, den;
        do{
            System.out.println("(0) para sair!");
            System.out.print("Intoduza o numerador >> ");  num = ler.nextInt();
            System.out.print("Introduza o denominador >> ");  den = ler.nextInt();
            System.out.printf("\n\nNumero Fracionario >> %d/%d\n", num, den);
            for(int i=2;i<num;i++){
                if(num%i==0 && den%i==0){
                    System.out.printf("Forma Reduzida >> %d/%d\n\n\n\n", num/i, den/i);
                    i=num;
                }
            }
        }while(num!=0 && den!=0);
    }
    
}
