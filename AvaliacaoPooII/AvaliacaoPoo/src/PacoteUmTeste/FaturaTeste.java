
package PacoteUmTeste;

import PacoteUm.Fatura;

/**
 *
 * @author 55519
 */
public class FaturaTeste {
    
    public static void main(String[] args) {
        
        Fatura fat = new Fatura();
        
        System.out.println("Quantidade de items comprados: ");
        System.out.println(fat.valorFatura());
        
        
    }
    
}
