
package PacoteUm;

import javax.swing.JOptionPane;

/**
 *
 * @author 55519
 */
public class Proprietario {
    
    public String nome = JOptionPane.showInputDialog("Qual teu nome? ");
    public String cpf = JOptionPane.showInputDialog("Qual teu cpf? ");
    public String rg = JOptionPane.showInputDialog("Qual teu rg? ");
    public String dataNasci = JOptionPane.showInputDialog("Qual tua data de nascimento? ");
    public String rua = JOptionPane.showInputDialog("Qual tua rua? ");
    public String bairro = JOptionPane.showInputDialog("Qual teu bairro? ");
    public String cidade = JOptionPane.showInputDialog("Qual tua cidade? ");
    public String estado = JOptionPane.showInputDialog("Qual teu estado? ");
    public String cep = JOptionPane.showInputDialog("Qual teu cep? ");
    public String complemento = JOptionPane.showInputDialog("Qual teu complemnto? ");



    public void mostrarTudo(){
        
        System.out.println("O teu nome é: "+ nome+"\n"+
                "Teu cpf é: "+cpf+"\n"+
                "Teu rg é: " +rg+"\n"+
                "Tua data de nascimento é: "+dataNasci+"\n"+
                "Tua rua é: "+rua+"\n"+
                "Teu bairro é: "+bairro+"\n"+
                "Tua cidade é: "+cidade+"\n"+
                "Teu estado é: "+estado+"\n"+
                "Teu cep é: "+cep+"\n"+
                "Teu complemento é: "+complemento+".");
        
    }
    
}
