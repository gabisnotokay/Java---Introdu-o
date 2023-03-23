
package trocanumeri;

import javax.swing.JOptionPane;

public class TrocaNumeri {

    public static void main(String[] args) 
    {
        int NumA = 0, NumB = 0, NumC = 0;
        
        NumA = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira o primeiro número para ver a troca de valores"));
        NumB = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira o segundo número."));
        
        JOptionPane.showMessageDialog(null, "Antes: " +NumA+ " e " +NumB);
        
        NumC = NumA;
        NumA = NumB;
        NumB = NumC;
        
        JOptionPane.showMessageDialog(null, "Depois: " +NumA+ " e " +NumB);
    }
    
}
