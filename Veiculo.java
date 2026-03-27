/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;


import javax.swing.JOptionPane;

interface Veiculo {

    void acelerar();
    void frear();

    default void exibirInfo() {
        System.out.println("Veículo");
    }
}

class Carro implements Veiculo {
    String marca;
    String modelo;
    double velocidade;

    public Carro(String marca, String modelo, double velocidade) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade = velocidade;
    }

    @Override
    public void acelerar() {
        velocidade += 10;
        JOptionPane.showMessageDialog(null, 
                "Carro acelerando...\nVelocidade atual: " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        velocidade -= 10;

        if (velocidade < 0) {
            velocidade = 0;
        }

        JOptionPane.showMessageDialog(null, 
                "Carro freando...\nVelocidade atual: " + velocidade + " km/h");
    }
}

class Moto implements Veiculo {
    String marca;
    double cilindrada;
    double velocidade;
    

    public Moto(String marca, double cilindrada, double velocidade) {
        this.marca = marca;
        this.cilindrada = cilindrada;
        this.velocidade = velocidade;
    }
    
     @Override
    public void acelerar() {
        velocidade += 10;
        JOptionPane.showMessageDialog(null, "Moto acelerando...\nVelocidade atual: " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        velocidade -= 10;

        if (velocidade < 0) {
            velocidade = 0;
        }

        JOptionPane.showMessageDialog(null,  "Moto freando...\nVelocidade atual: " + velocidade + " km/h");
    }

}


class Bicicleta implements Veiculo {
    String marca;
    String tipo;
    double velocidade;

    public Bicicleta(String marca, String tipo, double Velocidade) {
        this.marca = marca;
        this.tipo = tipo;
        this.velocidade = Velocidade;
    }
    
     @Override
    public void acelerar() {
        velocidade += 10;
        JOptionPane.showMessageDialog(null, "Bicicleta acelerando...\nVelocidade atual: " + velocidade + " km/h");
    }

    @Override
    public void frear() {
        velocidade -= 10;

        if (velocidade < 0) {
            velocidade = 0;
        }

        JOptionPane.showMessageDialog(null,  "Bicicleta freando...\nVelocidade atual: " + velocidade + " km/h");
    }
    
}