
package somamultipl;

import javax.swing.JOptionPane;

public class SomaMultipl {

    public static void main(String[] args) 
    {
        int SomaImp = 0;
        double MultPar = 0;
        
        for(int i = 0; i <= 30; i++){
            if(i%2 == 0) {
                MultPar*=i;
            }
            else {
                SomaImp+=i;
            }   
        }
        JOptionPane.showMessageDialog(null, "A soma entre 0 e 30 dos números pares é de: " +SomaImp); 
        JOptionPane.showMessageDialog(null, "A multiplicação entre 0 e 30 dos números pares é de: " +MultPar); 
    }
    
}
