/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

        
/**
 *
 * @author ana.ccsantos86
 */
public class MainCalculadora {
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        
        System.out.println(c.somar(2, 7));
        System.out.println(c.somar(8, 7));
        System.out.println(c.somar(9, 9, 7));
        
        
        System.out.println(c.multiplicacao(2, 7));
        System.out.println(c.multiplicacao(8, 7));
        System.out.println(c.multiplicacao(9, 9, 7));
    }
}
    

