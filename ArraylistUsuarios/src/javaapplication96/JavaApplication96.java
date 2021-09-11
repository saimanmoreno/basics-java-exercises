package javaapplication96;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class JavaApplication96 {
    public static void main(String[] args) {
        
        ArrayList<String> usuarios;
        usuarios = new ArrayList<>();
        String quant = JOptionPane.showInputDialog("Digite a quantidade: ");
        for (int i=0;i<Integer.parseInt(quant);i++){
            String nome = JOptionPane.showInputDialog("Insira o nome para Usuario" +(i+1));
            usuarios.add(nome);
        }
        JOptionPane.showMessageDialog(null, "Usuarios cadastrados com sucesso");
    }
    
}
