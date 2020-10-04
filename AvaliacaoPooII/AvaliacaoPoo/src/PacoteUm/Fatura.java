
package PacoteUm;

import javax.swing.JOptionPane;

/**
 *
 * @author 55519
 */
public class Fatura {
    
    public String numero;
    public String descricao;
    public int quantItem = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de items: "));
    public double precoItem = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do item: "));

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantItem() {
        return quantItem;
    }

    public void setQuantItem(int quantItem) {
        this.quantItem = quantItem;
    }

    public double getPrecoItem() {
        return precoItem;
    }

    public void setPrecoItem(double precoItem) {
        this.precoItem = precoItem;
    }
    
    public double valorFatura(){
        
        if(quantItem<0 && precoItem<0.0){
            
            quantItem = 0;
            precoItem = 0.0;
            
            
        }
        
        return quantItem * precoItem;
        
    }
    
}
