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

 /*CLASSE DE EXECUÇÃO\*/
class Mainfuncionario {
    public static void main(String[] args) {
        Gerente g  = new Gerente (600, "Ana Carolina", 15000);
        Estagiario e = new Estagiario (50, "Witoria", 1518);
        
         JOptionPane.showMessageDialog(null,"Gerente: " + g.getNome());
         JOptionPane.showMessageDialog(null,"Salario: " + g.getSalario() + g.getBonus());
        
         JOptionPane.showMessageDialog(null," Estagiario " + e.getNome());
         JOptionPane.showMessageDialog(null,"Salario " + e.getSalario() * e.getHorasTrabalhadas() );
    }
}
