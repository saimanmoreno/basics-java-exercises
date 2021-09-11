/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane;
/**
 *
 * @author pc
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //JOptionPane.showMessageDialog(null,"Ola, Mundo", "Boas Vindas", JOptionPane.ERROR_MESSAGE);
        //JOptionPane.showMessageDialog(null,"Voce digitou o valor" + n);
        
        
        int n=0, s=0, i=0, j=0, k=0, l=0;
        float m;
        do{
            n = Integer.parseInt(JOptionPane.showInputDialog(null,
                "<html>Informe um  numero: <br><em>(Valor 0 interrompe)</em></html>"));
            i++;        //contador de numeros
            if (n%2==0){
                j++;    //numeros pares
            }else{
                k++;    //numeros impares
            }
            if (n>=100){
                l++;    //nummeros acima de 100
            }
            if (n!=0){
                s += n;
            }     //somatorio de todos os numeros
            
        }while(n != 0);
        m = s/i;        //media de todos os numeros
        
        JOptionPane.showMessageDialog(null, "<html>Resultado:<br><hr>" + 
                                            "<br>Total de Valores >> " + i +
                                            "<br>Somatorio de todos os numeros >> " + s +
                                            "<br>Total de Pares >> " + j +
                                            "<br>Total de Impares >> " + k +
                                            "<br>Acima de 100 >> " + l +
                                            "<br>Media dos Valores >> " + m);
        
    }
    
}
