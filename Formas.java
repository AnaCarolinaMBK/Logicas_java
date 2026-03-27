/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;


import javax.swing.JOptionPane;

/**
A abstração é o processo de destacar apenas as características essenciais de um objeto 
ou sistema, escondendo os detalhes desnecessários. 
* 
* : é focar no que um objeto faz, e não em como ele faz
* 
 */
abstract class Formas { // Classe Abstrata
    protected String nome; //Atributo protegido
    
    public Formas(String nome) {  //inicialização do atributo
        this.nome = nome;    
    }  

    abstract void calcularPerimetro(); //Metodo Abstrato
    
    abstract void calcularArea();   //Metodo Abstrado
     
    public void exibirinfo(){ //Metodo Concreto 
        System.out.println(nome + "\n Forma");
    }
}



class Circulo extends Formas { //Classe concreta
    double raio; // Atributo
    
    
    public Circulo(String nome, double raio){
        super(nome);
        this.raio = raio;
    }
   
    @Override
    void calcularPerimetro(){

       double perimetroCirculo = 2 * Math.PI * raio;
       JOptionPane.showMessageDialog(null, "Perímetro do Circulo: \n" + perimetroCirculo);
   
    }
   
    @Override
    void calcularArea(){
        double areaCirculo = Math.PI * Math.pow(raio, 2);
         JOptionPane.showMessageDialog(null,"A área do círculo de raio:\n " + raio + " é igual a \n" + areaCirculo);
    }

}
class Retangulo extends Formas {
    double largura;
    double altura;
    
    public Retangulo (String nome, double largura, double altura){
        super(nome);
        this.largura = largura;
        this.altura = altura;
    }

    @Override
    public void calcularPerimetro() {
        double perimetroRetangulo = 2 *(largura + altura);
         JOptionPane.showMessageDialog(null, "Perímetro do Retangulo: \n" + perimetroRetangulo);
    }

    @Override
    public void calcularArea() {
        double areaRetangulo = largura * altura;
        JOptionPane.showMessageDialog(null, "Área do Retangulo: \n" + areaRetangulo);
    }
}    
    
   
    
class Quadrado extends Formas {
    double lado;
    
    public Quadrado (String nome, double lado){
        super(nome);
        this.lado = lado;
    }

        @Override
        public void calcularPerimetro() {
            double perimetroQuadrado = 4 * lado;
            JOptionPane.showMessageDialog(null, "Perimetro do Quadrado: " + perimetroQuadrado); 
            
        }

        @Override
        public void calcularArea() {
            double areaQuadrado = lado * lado;
             JOptionPane.showMessageDialog(null, "A área do quadrado é: \n" + areaQuadrado);
            
        }
}