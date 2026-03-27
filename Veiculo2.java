/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

/**
 *
 * @author ana.ccsantos86
 */
abstract class Veiculo2 {

    
    abstract void mover();
}

class Carrinho extends Veiculo2{
 
    @Override 
    void mover(){
        System.out.println("meu Carrinho e muito rapido...");
    } 
}
class Bicicletinha extends Veiculo2{
 
    @Override 
    void mover(){
        System.out.println("minha Bicicletinha e muito lenta canço munto rapido...");
    } 
}


