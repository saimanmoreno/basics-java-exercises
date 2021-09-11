/*
 * Desenvolva um algoritmo que calcula a media de um aluno e exiba as suas classificações. Pesos: 
 *              prova 1 - 30%
 *		prova 2 - 50%
 *		projeto 20%
 * Use if else aninhado, deve ser exibida  a media do aluno:
 *	se a media for menor que 9.4, classificacao de insuficiente ou reprovado
 *	se a media for maior ou igual que 9.5 e media menor que 12.5, classificar suficeiente.
 *	se a media for maior ou igual a 12.5 e menor que 14, classificar aluno intermediario
 *	se a media for maior ou igual a 14 e menor que 16, classificar bom
 *	se a media for maior ou igual a 16 e menor que 19, muito bom
 *	se a media for maior ou igual a 19, excelente
 */
package media.aluno;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MediaAluno {

    public static void main(String[] args) {
       
            Scanner ler = new Scanner (System.in);
            String s = JOptionPane.showInputDialog("Informe o seu nome:");
            //System.out.print("Introduza o seu nome >> ");String s = ler.nextLine();
            
            float n1 = Float.parseFloat(JOptionPane.showInputDialog("Introduza a nota do primeiro teste:"));
            //System.out.print("\nIntroduza a nota do 1º teste >> ");float n1 = ler.nextFloat();
            
            float n2 = Float.parseFloat(JOptionPane.showInputDialog("Introduza a nota do segundo teste:"));
            //System.out.print("Introduza a nota do 2º teste >> ");float n2 = ler.nextFloat();
            
            float proj = Float.parseFloat(JOptionPane.showInputDialog("Introduza a nota do projeto teste:"));
            //System.out.print("Introduza a nota do projeto >> ");float proj = ler.nextFloat();
            
            float media = (float) (n1*0.3 + n2*0.5 + proj*0.2);
            
            if(media>=9.5){
                if(media>=9.5 && media<12.5){
                    JOptionPane.showMessageDialog(null,"Nome: "+s+"\nMedia: "+media+"\nClassificação: Suficiente");
                    //System.out.println("CLASSIFICAÇÃO >> Suficiente");
                }
                else if(media>=12.5 && media<14){
                    JOptionPane.showMessageDialog(null,"Nome: "+s+"\nMedia: "+media+"\nClassificação: Aluno Intermediario");                    
                    //System.out.println("CLASSIFICAÇÃO >> Aluno Intermediario");
                }
                else if(media>=14 && media<16){
                    JOptionPane.showMessageDialog(null,"Nome: "+s+"\nMedia: "+media+"\nClassificação: Bom"); 
                    //System.out.println("CLASSIFICAÇÃO >> Bom");
                }
                else if(media>=16 && media<19){
                    JOptionPane.showMessageDialog(null,"Nome: "+s+"\nMedia: "+media+"\nClassificação: Muito Bom"); 
                    //System.out.println("CLASSIFICAÇÃO >> Muito Bom");
                }
                else if(media>=19 && media<=20){
                    JOptionPane.showMessageDialog(null,"Nome: "+s+"\nMedia: "+media+"\nClassificação: Parabens! Excelente"); 
                    //System.out.println("CLASSIFICAÇÃO >> PARABENS!!!EXCELENTE");
                }
                else if(media>20){
                    JOptionPane.showMessageDialog(null,"Dados invalidos! Introduza a nota na escala 0-20"); 
                    //System.out.println("Dados invalidos! Introduza a nota na escala 0-20");
                }
            }else{
                if(media<9.5){
                    JOptionPane.showMessageDialog(null,"Nome: "+s+"\nMedia: "+media+"\nClassificação: Reprovado"); 
                    //System.out.println("CLASSIFICAÇÃO >> Reprovado! Que pena!!!");
                }
            }

    }
    
}
