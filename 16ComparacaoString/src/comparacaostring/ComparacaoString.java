/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author pc
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Saiman";
        String nome2 = "Saiman";
        String nome3 = new String ("Saiman");
        String res;
        //res = (nome1==nome3)?"igual":"diferente";
        res = (nome1.equals(nome3))?"igual":"diferente";
        System.out.println(res);
    }
    
}
