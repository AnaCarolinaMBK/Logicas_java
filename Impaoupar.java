package logicasjava;

import java.util.Scanner;

public class Impaoupar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int A;
                
        System.out.println("Informe um Numero"); 
        A = sc.nextInt();
        
        if (A % 2 == 0 ){
            System.out.println("Numero par");
           
        }
        else { System.out.println("Numero impar");       
        }
        sc.close();
        
    }   
           
}
    

