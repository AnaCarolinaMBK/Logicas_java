package logicasjava;


import java.util.Scanner;

public class Numeroint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     
        int N;
        char continuar;
        
        do {
          System.out.println("Informe um Numero"); 
          N = sc.nextInt();
       
            if (N <= 0) {
              System.out.println("Por favor, digite um numero maior que zero!");
            }else {
            
                System.out.println("(1 até " + N + "):");
                }
                for (int i = 1; i <=N; i++) {
                System.out.println(" " + i);
                }
                
               for (int i = 2; i <= N; i += 2) {
                System.out.print(i + " ");
            }
                System.out.println("Numeros pares de 1 ate " + N + ": ");
            
            for (int i = 1; i <= N; i++) {
                if (i % 2 == 0) {
                System.out.print(i + " ");
                } 
            }
 
                System.out.println("(soma de 1 ate " + N + "):");
                int soma = 0;
               
                int i = 1;
                do {
                    soma += i;
                    i++;
                    
                } while (i <= N);
                System.out.println("Resultado = " + soma);
            
                
                System.out.print("Executar novamente? (S/N): ");
                continuar = sc.next().charAt(0);

                System.out.println();
            
           
        }while (continuar == 'S');
                System.out.println("Programa encerrado!");
              
                sc.close();
    }
}

