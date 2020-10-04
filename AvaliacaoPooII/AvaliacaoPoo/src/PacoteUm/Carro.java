
package PacoteUm;

import javax.swing.JOptionPane;

/**
 *
 * @author 55519
 */
public class Carro {
    
    public String modelo;
    public String cor;
    public String ano;
    public String marca;
    public String chassi;
    public String proprietario;
    public double velocidadeMaxima = 240;
    public double velocidadeAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade atual: "));
    public boolean numeroPortas;
    public boolean tetoSolar;
    public int numeroMarchas;
    public boolean cambioAutomatico;
    public double volumeCombustivel = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de combustível: "));

    

    
    
    public void aumentarVelocidade(){
        
        if (velocidadeAtual == velocidadeMaxima){
            
            System.out.println("O seu carro parou antes de ganhar uma multa ou você morrer :(");
             
        }else if(volumeCombustivel == 0){
            
            System.out.println("Você não pode andar sem gasolina...");
            
        }else if (velocidadeAtual == 0){
            
            System.out.println("Você não pode andar a 0 Km....");
            
        }else{
            
            System.out.println("Espero que tenha uma boa viagem...");
            
        }
        
    }
    
    public void freiarCarro(){
        
        if(velocidadeAtual == 0){
            
            System.out.println("Seu carro freiou");
            
        }
        
    }
    
    public void trocarMarcha(){
        
        
        
    }
    
    public void reduzirMarcha(){
        
        
        
    }
    
    public void usarMarchaRe(){
        
        if (velocidadeAtual>0){
            
            System.out.println("Você não pode engatar a marcha ré.");
            
        }else{
            
            System.out.println("Você pode engatar a marcha ré...");
        }
        
        
        
    }
    
    public void consumoMedio(){
        
        if(volumeCombustivel == 0){
            
            System.out.println("Você está sem gasolina.");
            
        }
        
    }
    

}