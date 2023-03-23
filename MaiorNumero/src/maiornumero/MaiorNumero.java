
package maiornumero;
import javax.swing.JOptionPane;

public class MaiorNumero {

    public static void main(String[] args) 
    {
        int N1 = 0, N2 = 0;
        
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira o primeiro número para saber qual é o maior valor."));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Por favor, insira o segundo número."));
        
        if(N1>N2){
            JOptionPane.showMessageDialog(null, "O maior número digitado foi : " + N1);          
        }
        else{
            JOptionPane.showMessageDialog(null, "O maior número digitado foi : " + N2);    
        }
    }
}
