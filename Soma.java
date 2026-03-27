package logicasjava;

import java.util.Scanner;

public class Soma {
        
    public static void main(String[] args) {
      
    int A;
    int B;
    int soma; 
    
    Scanner goiaba = new Scanner(System.in);
    
    System.out.println("Insira o primeiro numero");
    A = goiaba.nextInt();
    
    System.out.println("Insira o segundo numero");
    B = goiaba.nextInt();
    
    soma = A + B;
    
    System.out.println("Resultado: " + soma);
    
    
    goiaba.close();
    
    }
    
}   