
package PacoteUm;

import javax.swing.JOptionPane;

/**
 *
 * @author 55519
 */
public class Marca {
    
    public String nome = JOptionPane.showInputDialog("Qual o nome do teu carro? ");
    public String numeroModelos = JOptionPane.showInputDialog("Quantos modelos têm? ");
    public String anoLancamento = JOptionPane.showInputDialog("Qual o ano de lançamento? ");
    public int codIndentificador = Integer.parseInt(JOptionPane.showInputDialog("Qual teu código indentificador? "));
    
    public void mostrarTudo(){
        
        System.out.println("O nome do teu carro é: "+ nome+"\n"+
                "A quantidade de modelos é: "+numeroModelos+"\n"+
                "O ano de lançamento é: " +anoLancamento+"\n"+
                "Teu código indentificador é: "+codIndentificador+".");
        
    }
    
}
