package logicasjava;

import java.util.Scanner;

public class Verificacao {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Informe um Número"); 
         numero= sc.nextInt();
        
         if (numero < 17){
          System.out.println ("Número menor ");
       } 
       else if (numero >17){
          System.out.println ("Número maior");
       }
       else{
          System.out.println ("Número igual");
       } 
        sc.close();
       
  
        
              
        
    }
  
}
