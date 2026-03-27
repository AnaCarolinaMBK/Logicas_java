/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

/**
 *
 * @author ana.ccsantos86
 */
//SUPERCLASSE
public class Veiculos {
   String marca;
   
   
   public Veiculos(String marca){
       this.marca = marca;
   }
   
    public void mover () {
        System.out.println("O veiculo está se movendo");
        
    }
    
}

//SUBCLASSE
class Carro extends Veiculos{
    String modelo;
    
    public Carro(String marca, String modelo ) {
        super(marca);
        this.modelo = modelo;
    }

    @Override
    public void mover() {
        
       System.out.println("O carro " + marca + " " + modelo + " está rodando!");
        }
}      
    

class Main{
    public static void main(String[] args) {
        Veiculos v = new Veiculos ("Generico");
        Carro c = new Carro ("Toyota", "Corolla");
        
        v.mover();
        c.mover();
    }
}