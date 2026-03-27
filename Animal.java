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
public class Animal {

    void emitirSom() {
         JOptionPane.showMessageDialog(null, "Som Generico"); 
    }
}

class Cachorro extends Animal{

    @Override
    void emitirSom() {
         JOptionPane.showMessageDialog(null, "AU-AUU", "Cachorro", 2); 
    } 
}           


class Gato extends Animal{

    @Override
    void emitirSom(){
         JOptionPane.showMessageDialog(null, "Miau-Miau", "Gato", 3); 
    } 
}           


class Vaca extends Animal{

    @Override
    void emitirSom() {
         JOptionPane.showMessageDialog(null, "Mu-Muuu", "Vaca", 3); 
    } 
}            
    



