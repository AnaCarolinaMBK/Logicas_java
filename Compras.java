/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ana.ccsantos86
 */
public class Compras {
    public static void main(String[] args) {
        
        ArrayList<String> legumes = new ArrayList<>();
        
        legumes.add("Cenoura");
        legumes.add("Batata");
        legumes.add("Abóbora");
        legumes.add("Beterraba");
        legumes.add("Brócolis");
        legumes.add("Pepino");
        legumes.add("Tomate");
        legumes.add("Abobrinha");
        legumes.add("Pimentão");
        legumes.add("Ervilha");
        
        char continuar;
        
        
        do{   
           String listaLegumes = String.join("\n ", legumes);
        
        
           JOptionPane.showMessageDialog(null, " Lista de Legumes:  \n" + listaLegumes);
       
     
           String removerLegume = JOptionPane.showInputDialog(null, " Legume que queira remover: ");
       
           if (legumes.remove(removerLegume)) {
            JOptionPane.showMessageDialog(null, removerLegume + " foi removido da lista.\n");
           }
     
           listaLegumes = String.join("\n ", legumes);
           JOptionPane.showMessageDialog(null, " Lista atualizada de Legumes: \n" + listaLegumes);
        
           String adicionarLegume = JOptionPane.showInputDialog(null, " Legume que queira Adicionar: ");
        
           if (legumes.add(adicionarLegume)) {
            JOptionPane.showMessageDialog(null, adicionarLegume + "\n Foi adicionado na lista.");
        
            }else {JOptionPane.showMessageDialog(null, "Legume já esta na lista");
            
            }
            listaLegumes = String.join("\n ",legumes);
            JOptionPane.showMessageDialog(null, "Lista atualizada de Legumes: \n" + listaLegumes);
        
            JOptionPane.showMessageDialog(null, "Total de legumes:" + legumes.size());
            
            String retorno = JOptionPane.showInputDialog(null, "Deseja continuar? (S/N)");
            
            continuar =  retorno.toUpperCase().charAt(0);
            
        } while(continuar == 'S');
            JOptionPane.showMessageDialog(null,"Programa encerrado!");
              
    }
}
    
    

