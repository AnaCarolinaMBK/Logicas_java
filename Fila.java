/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author ana.ccsantos86
 */
public class Fila {
    public static void main(String[] args) {
         
        Queue<String> fila  = new LinkedList<>();
        
        fila.add("Maria");
        fila.add("Camila");
        fila.add("Witória");
        fila.add("Thamilles");
        fila.add("Nathalia");
        fila.add("Ana Carolina");
        
        System.out.println("Fila atual: \n" + fila);
        
        System.out.println("Quantidade de Pessoas na fila: \n" + fila);
        
        String atendido1 = fila.poll();
        System.out.println("Atendido 1: \n" + atendido1);
        
        String atendido2 = fila.poll();
        System.out.println("Atendido 2: \n" + atendido2);
        
        System.out.println("Fila após atendimento: \n" + fila);
        
        System.out.println(" A fila esta vazia? \n" + fila.isEmpty());
        
        System.out.println(" Quantidade de Pessoas na fila: \n" + fila);
    }
}
