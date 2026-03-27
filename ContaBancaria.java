package logicasjava;

import javax.swing.JOptionPane;


public class ContaBancaria {
    private double saldo;
    private String titular;

    public ContaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }
    
    public void depositar(double valor) {
        if (valor > 0) {
           this.saldo += valor;
           JOptionPane.showMessageDialog(null, "DEPOSITO REALIZADO ");
        }else{ JOptionPane.showMessageDialog(null, "Deposito menor que o permetido ");}   
    }
    
    
    public void sacar(double valor) {
       if (valor > 0 &&  valor <= saldo){
          this.saldo -= valor;
           JOptionPane.showMessageDialog(null, "SAQUE REALIZADO ");
        }else{ JOptionPane.showMessageDialog(null, "saque não disponivel ");}
    }

    
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
  
    public double getSaldo() {
        return saldo;
    }
    
    public String getTitular() {
        return titular;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }
        
}  


   
