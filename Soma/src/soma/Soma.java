package soma;

import java.util.Scanner;

public class Soma {

    public static void main(String[] args) {
        
        Scanner entrar = new Scanner(System.in);
        int n1, n2, op;
        System.out.println("Digite o primeiro numero: "); n1=entrar.nextInt();
        System.out.println("Digite o segundo numero: "); n2=entrar.nextInt();
        System.out.println("Qual operacao: \n(1) Soma\n(2)Subtrair\n(3)Multiplicar\n(4)Dividir\n\n"); op=entrar.nextInt();
        
        switch(op){
            case 1: System.out.println("A soma entre "+n1+" e "+n2+" = "+(n1+n2)); break;
            case 2: System.out.println("A diferenca entre "+n1+" e "+n2+" = "+(n1-n2)); break;
            case 3: System.out.println("A multiplicacao entre "+n1+" e "+n2+" = "+(n1*n2)); break;
            case 4: System.out.println("A divisao entre "+n1+" e "+n2+" = "+(n1/n2)); break;
            default: System.out.println("Erro. Numero Invalido");
        }
    }
    
}
