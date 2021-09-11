package caacteresascii;

import java.util.Scanner;

public class CaacteresAscii {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x, y;
        System.out.print("Introduza dois numeros entre 0 e 255 >>");
        x = ler.nextInt();
        y = ler.nextInt();
        
        for(int i=x;i<=y;i++){
            System.out.printf("Caracter %s ", i);
        }
    }
    
}
