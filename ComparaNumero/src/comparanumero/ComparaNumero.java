
package comparanumero;

import javax.swing.JOptionPane;

public class ComparaNumero {

    public static void main(String[] args) 
    {
        int N1 = 0, N2 = 0;
        
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira o primeiro número para compara-lo com o segundo."));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira o segundo número."));
        
        if(N1==N2){
            JOptionPane.showMessageDialog(null, "Os números são iguais.");
        } 
        else {
            JOptionPane.showMessageDialog(null, "Os números são diferentes.");
        }
        
        if(N1<N2){
            JOptionPane.showMessageDialog(null, "Maior: " +N1+ " e menor valor: " +N2);
        }
        else{
            JOptionPane.showMessageDialog(null, "Maior: " +N2+ " e menor valor: " +N1);               
        }
    }
    
}
