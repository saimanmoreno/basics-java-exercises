/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author pc
 */
public class Testetipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int idade = 30;
        //String valor = idade; // errado
        String valor = Integer.toString(idade);
        System.out.println(valor);
        
        String valor = "30";
        //int idade = valor; //errado
        int idade = Integer.parseInt(valor);
        System.out.println(idade);
        */
        String valor = "30.5";
        //int idade = valor; //errado
        float idade = Float.parseFloat(valor);
        System.out.println(idade);
    }
    
}
