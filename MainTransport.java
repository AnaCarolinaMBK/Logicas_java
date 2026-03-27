/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

/**
 *
 * @author ana.ccsantos86
 */
public class MainTransport {
    public static void main(String[] args) {
        
        Transporte t0 = new Transporte();  //
        Transporte t1 = new Carros();       // Objeto de 
        Transporte t2 = new Bicicletas();   // cada Classe
        Transporte t3 = new Aviao();       //
        
        t0.mover();
        t1.mover();
        t2.mover();
        t3.mover();
        
    }
}
