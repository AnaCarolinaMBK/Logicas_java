package logicasjava;

import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] numeros = new int[10]; 
        
        
        System.out.println("Digite 10 números:");
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
      
    } 
        
}
    
