/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

/**
 *
 * @author ana.ccsantos86
 */
public class Mainpoo {
    public static void main(String[] args) {
        Veiculos v = new Veiculos ("Generico");
        Carro c = new Carro ("Toyota", "Corolla");
        
        v.mover();
        c.mover();
    }
}

