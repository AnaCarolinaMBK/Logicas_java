/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

import java.util.Scanner;


public class AlgoritmosIntermed {
    
    public static void main(String[] args) {
       
        
    int A;
    char continuar;
    
     Scanner sc = new Scanner(System.in);
     
   
     System.out.println("-----Digite um Numero para visualizar a Tabuada------"); 
           A = sc.nextInt();
           
           for (int i= 0; i <=10; i++) {
                  System.out.println(A + " x " + i + " = " + (A* i));
                }
           
     
     System.out.println("Soma, Menor, Mair e Medía");
           
     int[] numeros = new int[5]; 
        
        
        System.out.println("Digite 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
        }
     
    
     for (int i = 0; i < numeros.length; i++) {
        System.out.println("Elemento " +(i + 1) + ":" + numeros[i]);
     }
     
     
     int soma=0;
     int maior = numeros[0];
     int menor = numeros[0];
     
     for (int num : numeros){
         soma += num;
         if (num > maior){
             maior = num;
          }
         if (num < menor) {
             menor = num; 
         }
         
        
     }
    
     double media = (double) soma/ numeros.length;
     
        System.out.println("soma:" + soma);
        System.out.println("media:" + media);
        System.out.println("maior:" + maior);
        System.out.println("menor:" + menor);
        
        



     
          System.out.println("------Vetor em ordem inversa------");
         
        int[] vetor = new int[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
        }

       
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    
        System.out.println("------Soma dos números pares entre 1 e 100--------");

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {  
                soma += i;
            }
        }
        System.out.println("A soma de todos os números pares entre 1 e 100 é: " + soma);
      
     System.out.println("-----Vogais da Palavra------");
         

        System.out.print("Digite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);

        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contador++;
            }    
        }
           
        System.out.println("A palavra \"" + palavra + "\" possui " + contador + " vogais.");
    
    
        
       int[] notas = new int[3];

        System.out.println("Digite 3 números:");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            notas[i] = sc.nextInt();
        } 
        
        
        
       

          System.out.println("----Vetor par e  impar ");
         int [][] number = {
             {1,2,3},
             {4,5,6},
             {7,8,9}
         };
    
        for (int i = 0; i < number.length; i++){
        for ( int j = 0 ; j < number[i].length; j++){
            System.out.println("Numero " + ":" + number[i][j] + "é");
        
        
            if (number[i][j] % 2 == 0 ){
            System.out.println("Numero par");
           
            }
            else { System.out.println("Numero impar");       
            }
            
            }
        }     
        
         System.out.println("------Diagonal frontal-----");
         
        for (int i = 0; i < number.length; i++){
            System.out.println(number[i][i]);   
            }
            
        
        
        
        
        System.out.println("---Média Ponderada----");
        
        System.out.println("Digite sua nota 1: ");
        double nota1  = sc.nextDouble();
        
        System.out.println("Digite sua nota 2: ");
        double nota2  = sc.nextDouble();
        
        System.out.println("Digite sua nota 3: ");
         double nota3  = sc.nextDouble();
         
        int p1 = 2;
        int p2 = 3;
        int p3 = 5;
         
        double mediaPonderada = (nota1 * p1 + nota2 * p2 + nota3 * p3) / (p1 + p2 + p3);

        System.out.println("Sua média ponderada é: " + mediaPonderada);
       

        sc.close();
    }                
}
