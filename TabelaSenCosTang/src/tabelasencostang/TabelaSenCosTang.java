package tabelasencostang;

import static java.lang.Math.*;
import java.util.Scanner;

public class TabelaSenCosTang {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("x\t\tsin(x)\t\tcos(x)\t\ttang(x)");
        for(int i=0;i<=180;i++){
            if(i%15==0)
                System.out.printf("%d:\t\t%.1f\t\t%.1f\t\t%.1f\t\t\n", i, sin(i), cos(i), tan(i));
        }
    }
    
}
