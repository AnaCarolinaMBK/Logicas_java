/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author ana.ccsantos86
 
public class Pilha {

   
    public static void main(String[] arg ){
        
        Stack<String> pilha = Stack<>();
        
        pilha.push("10");
        pilha.push("20");
        pilha.push("30");
        pilha.push("40");
        pilha.push("50");
        pilha.push("60");
        
        
        String listaPilhas = String.join("\n ", pilha);
        JOptionPane.showMessageDialog(null, " Pilha atual: " + listaPilhas);
        
        String remover = pilha.pop();
        JOptionPane.showMessageDialog(null,"Remover o top da pilha 1" + remover);
        
        JOptionPane.showMessageDialog(null,"Remover o top da pilha 2" + remover);
        
        
        listaPilhas = String.join("\n ", pilha);
        JOptionPane.showMessageDialog(null, " Pilha atual: " + listaPilhas);
        
        JOptionPane.showMessageDialog(null, "Topo da pilha atual: " + pilha.peek());
      
    }
    
}
\*/