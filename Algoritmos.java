/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

import java.util.Scanner;

/**
 *
 * @author ana.ccsantos86
 */
public class Algoritmos {
    
    public static void main(String[] args) {
        
      int A;
      int B;
      int soma;
  
      
        Scanner somando = new Scanner(System.in);
    
    System.out.println("Insira o primeiro numero");
    A = somando.nextInt();
    
    System.out.println("Insira o segundo numero");
    B = somando.nextInt();
    
    soma = A + B;
    
    System.out.println("Resultado: " + soma);
    
    if (soma % 2 == 0 ){
        System.out.println("Numero par");
           
    }else { System.out.println("Numero impar");      
    }
 
    System.out.println("Digite sua idade: ");
    double C = somando.nextInt();
    
    
    if (C >= 18 ) {
        System.out.println(" Maior de idade. ");
        
    }else {System.out.println("Menor de idade. ");
    
    }
    
    
      
    System.out.println("Primeiro número: ");
    double D = somando.nextInt();
    
    System.out.println("Segundo número:  ");
    double F = somando.nextInt();
    
    System.out.println("Terceiro número:  ");
    double G = somando.nextInt();
    
     double maior = D;

        if (F > maior) {
            maior = F;
        }
        if (G> maior) {
            maior = G;
        }

        System.out.println("O maior número é: " + maior);
        
        System.out.println("Digite um numero: ");
        double n = somando.nextInt();
        
    if (n > 0) {
            System.out.println("O número é positivo.");
        } else if (n < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
    
    
        System.out.println("Digite seu nome:");
        String nome = somando.nextLine();
        
        System.out.println("OLÁ, " + nome + "!");
        
        
   
        
        System.out.println("Digite um numero");
        double N = somando.nextInt();
        
        System.out.println("Dobro " + N * 2);
        System.out.println("Triplo " + N * 3);
        
        
        System.out.print("Digite a temperatura em Celsius: ");
        double c = somando.nextDouble();

        double f = (c * 9/5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + f);
        
        
         for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }  
        int i = 1;
        int so = 0;

        while (i <= 50) {
            so += i;
            i++;
        }

        System.out.println("A soma dos números de 1 a 50 é: " + so);
    }
   
}
