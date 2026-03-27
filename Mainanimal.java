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
public class Mainanimal {
    public static void main(String[] args) {
        
        Animal[] an = new Animal[3];
         
        an [0]= new Cachorro();
        an [1]= new Gato();
        an [2] = new Vaca();
     
       for (Animal a :an){
           a.emitirSom();
       }
    }
    
}

    
    
    


