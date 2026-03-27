/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

/**
 *
 * @author ana.ccsantos86
 */
public class Mainformas {
    public static void main(String[] args) {
        
       Formas[] forma = new Formas[3];                //
                                                      // /     
       forma [0] = new Circulo("circulo", 5);         // / vetor 
       forma [1] = new Retangulo("Retangulo", 4, 6);  // /
       forma [2] = new Quadrado("Quadrado", 3);       //
        
       for (Formas f : forma){      //
           f.exibirinfo();          // Percorre
           f.calcularArea();        // Vertor
           f.calcularPerimetro();   //
        } 
    }
}  