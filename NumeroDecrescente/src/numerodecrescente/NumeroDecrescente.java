
package numerodecrescente;
import javax.swing.JOptionPane;

public class NumeroDecrescente {

    public static void main(String[] args) 
    {
        int NUM = 0;
        
        NUM = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira o primeiro número para vê-lo em ordem descresente."));
        
        for(int i=0; i<NUM; NUM--){
            JOptionPane.showMessageDialog(null, "" +NUM); 
        }
    }
    
}
