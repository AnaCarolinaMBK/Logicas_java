/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

/**
 *
 * @author ana.ccsantos86
 */
public class Mainvaiculo {
    public static void main(String[] args) {
        
    
        Veiculo[] veiculos = new Veiculo[3];
    
        veiculos [0] = new Carro("CHEVROLET","SIVIC", 50 );
        veiculos [1] = new Moto("HONDA", 4, 40);
        veiculos [2] = new Bicicleta("BIKE", "MOUNTAIN BIKE", 20);
    
            
        for ( Veiculo v: veiculos){
         v.acelerar();
         v.frear();
        }        
    }
}
