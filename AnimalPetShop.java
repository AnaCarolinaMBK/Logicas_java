/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

/**
 *
 * @author ana.ccsantos86
 */
public class AnimalPetShop {
        private String nome;
        private String especie;
        private boolean atendido;
        
        

    public AnimalPetShop(String nome, String especie, boolean atendido) {
        this.nome = nome;
        this.especie = especie;
        this.atendido = atendido;
    }
       
    public void atender() {
         if( atendido ){
            atendido = false;
            System.out.println(nome + " Atendido");
            
        } else System.out.println(" ja atendido");
    }
        
    public void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Espécie: " + especie);
        System.out.println("Atendido: " + (atendido ? "Sim" : "Não"));
       
    }    
    
}
