package logicasjava;

import java.util.Scanner;

public class Tabuada {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A;
        int opcao;
        char continuar;
         
        do {
           System.out.println("Digite um Numero para visualizar a Tabuada"); 
           A = sc.nextInt();
        
           System.out.println("Escolha o tipo de forma para Tabuada:");
           System.out.println("1 - Utilizando FOR");
           System.out.println("2 - Utilizando WHILE");           
           System.out.print("Opção: ");
           opcao = sc.nextInt();
            
           System.out.println("Tabuada do " + A+ ":");
            
            
            if (opcao == 1) {
               for (int i= 0; i <=10; i++) {
                  System.out.println(A + " x " + i + " = " + (A* i));
                }
             
            }else if (opcao == 2) {
                int i = 1;
                while (i <= 10) {
                    System.out.println(A + " x " + i + " = " + (A* i));
                    i++;
                } 
             
            }else {
                 System.out.println("Opção inválida! Tente novamente.");
                }
          
                 System.out.print("Deseja ver outra tabuada? (S/N): ");
                 continuar = sc.next().charAt(0);
 
            }while (continuar == 'S');
                 System.out.println("Programa encerrado!");
              
                sc.close();
        
     }     
}
      
    
    
            
            
            
     
 