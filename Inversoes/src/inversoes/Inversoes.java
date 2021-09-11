package inversoes;

import java.util.Scanner;

/**
 *
 * @author pc
 */
public class Inversoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in); 
        int i, j, a, n, cont;
        cont=0;
	
        System.out.print("Introduza o tamanho do vetor:");n=ler.nextInt();
        
        int[] num = new int[n];
	for(i=0;i<n;i++){
            System.out.printf("Introduza o elemento posicao %d :", i);
            num[i]=ler.nextInt();
	}
	
	for (i = 0; i < n; ++i)
	{
            for (j = i + 1; j < n; ++j)
            {
                if (num[i] > num[j])
                {
                    a =  num[i];
                    num[i] = num[j];
                    num[j] = a;
                    cont++;
                }
            }
	}
	
	for(i=0;i<n;i++){
            System.out.printf("\n\nElemento posicao %d : %d", i, num[i]);
	}
	
        System.out.printf("\n\nInversoes: %d\n\n", cont);
    }
    
}
