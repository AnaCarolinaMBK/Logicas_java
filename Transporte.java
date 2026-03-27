/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

/**
 *
 * @author ana.ccsantos86
 */
public class Transporte {
    public void mover(){
        System.out.println("... Está se movendo. ");
        
    }
}

class Carros extends Transporte {

    @Override
    public void mover() {
        System.out.println("Vrum vrum... O Carro esta andando pelas ruas. ");
    
    }
}
class Bicicletas extends Transporte {

    @Override
    public void mover() {
        System.out.println("Zumm... A Bicicleta esta pedalando pelas ciclovias. ");
    
    }
}
class Aviao extends Transporte {

    @Override
    public void mover() {
        System.out.println("Zum Vrum Pish... O Avião esta voando nos céus. ");
    
    }
}
