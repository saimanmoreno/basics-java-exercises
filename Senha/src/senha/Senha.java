/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senha;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author pc
 */
public class Senha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s;
        do{
            s = JOptionPane.showInputDialog("Cadastre a sua senha: ");
            if(s.length()<=6){
                JOptionPane.showMessageDialog(null, "Senha cadastrada com sucesso!");
                break;
            }
            else JOptionPane.showMessageDialog(null, "Senha Invalida!");
        }while(true);
        
    }
    
}
