/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

import javax.swing.JOptionPane;

/**
 *
 * @author ana.ccsantos86
 */
public class Mainconta {


    public static void main(String[] args) {
        ContaBancaria c = new ContaBancaria(1000, "Ana");

    
        double saldo = Double.parseDouble(
        JOptionPane.showInputDialog(null, "Digite seu saldo: "));
        c.setSaldo(saldo);

        JOptionPane.showMessageDialog(null, "Seu saldo: " + c.getSaldo());

      
        c.setTitular(JOptionPane.showInputDialog(null, "Digite seu nome: "));
        JOptionPane.showMessageDialog(null, "Nome: " + c.getTitular());
        
        double depositar = Double.parseDouble(
        JOptionPane.showInputDialog(null, "Digite o valor para depositar:"));
        c.depositar(depositar);

        double sacar = Double.parseDouble(
        JOptionPane.showInputDialog(null, "Digite o valor para sacar: "));
        c.sacar(sacar);
        
        
        JOptionPane.showMessageDialog(null,"Titular da Conta: " + c.getTitular() + "\n"
        + "Seu saldo atual: " + c.getSaldo());
    }
        
}
