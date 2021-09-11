package numeros;

import java.util.Scanner;

public class Numeros {

    public static void main(String[] args) {
        int n, s = 0;
        String resp;
        Scanner tec = new Scanner(System.in);
        do {
            System.out.printf("Digite um numero >> ");
            n = tec.nextInt();
            s += n;
            System.out.print("Quer continuar [S/N] >> ");
            resp = tec.next();
        } while (resp.equals("s"));
        System.out.println("A soma de todos os numeros é " + s);
    }
}
