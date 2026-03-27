package logicasjava;

import java.util.Scanner;
/**
 *
 * @author ana.ccsantos86
 */
public class Recursivaex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
    /*EXERCICIO FACIL*/    
        
        int A;
        
        
        System.out.println("Digite um numero:  ");
        A = sc.nextInt();
        
         System.out.println("Numeros pares de 1 ate " + A + ": ");
            
            for (int i = 1; i <= A; i++) {
                if (i % 2 == 0) {
                System.out.print(i + " ");
                }    
            } 
        int soma = 0;
               
                int i = 1;
                do {
                    soma += i;
                    i++;
                    
                } while (i <= A);
                System.out.println(" = " + soma);
    }            
}
