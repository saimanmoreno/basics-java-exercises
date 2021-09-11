package divisao;

import javax.swing.JOptionPane;

public class Divisao {

    public static void main(String[] args) {
        int n1=obtemInteiro("Primeiro inteiro: ");
        int n2=obtemInteiro("Segundo inteiro: ");
        String msg;
        try{
            msg = n1+"/"+n2+" = "+(n1/n2);
        }catch (ArithmeticException e){
            msg = "Não possivel dividir por zero";
        }
        JOptionPane.showMessageDialog(null, msg);
    }
    
    public static int obtemInteiro(String msg){
        String s=JOptionPane.showInputDialog(msg);
        int n; 
        try{
            n=Integer.parseInt(s);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Inteiro Invalido. Tente Novamente");
            n = obtemInteiro(msg);
        }
        return n;
    }
    
}
