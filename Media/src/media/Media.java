
package media;

import javax.swing.JOptionPane;

public class Media {

    public static void main(String[] args) 
    {
        int  N1 = 0, N2 = 0, N3 = 0, N4 = 0, ME = 0;
        char NM;
        
        JOptionPane.showMessageDialog(null, "Caro aluno(a), para saber sua média, informe seu nome e suas notas bimestrais, por favor.");
        
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira a sua nota que seja referente ao primeiro bimestre."));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira a sua nota que seja referente ao segundo bimestre."));
        N3 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira a sua nota que seja referente ao terceiro bimestre."));
        N4 = Integer.parseInt(JOptionPane.showInputDialog("E por último, insira a sua nota que seja referente ao quarto bimestre."));
        
        ME = (N1 + N2 + N3 + N4)/4;
        
        JOptionPane.showMessageDialog(null, "Sua média anual é de : " + ME);
        
    }
    
    }
    
    

