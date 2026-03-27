package logicasjava;

import java.util.Scanner;


public class Imc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        float altura;
        float peso;
        float imc;
        
                
        System.out.println("Informe sua altura"); 
        altura = sc.nextFloat();
        
        System.out.println("Informe seu peso");
        peso = sc.nextFloat();
        
        imc = peso / (altura  * altura);
        System.out.println("Resultado: " + imc);
                
       if (imc < 18.5){
          System.out.println ("Abaixo do peso");
       } 
       else if (imc >= 18.5 && imc <24.9){
          System.out.println ("Peso normal");
       }
       else if (imc >=24.9 && imc <30.5){
           System.out.println ("Acima do peso");
       }
       else{
           System.out.println  ("Obsidade");
       } 
        sc.close();
    }
        

      
}
