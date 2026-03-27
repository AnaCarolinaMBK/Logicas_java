
package logicasjava;

import java.util.Scanner;



public class Recursicaex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

 
        System.out.println("Digite 3 números:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            int n = sc.nextInt();
        }

 
        sc.nextLine();

 
        System.out.print("\nDigite uma palavra: ");
        String palavra = sc.nextLine().toLowerCase();

        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            char letra = palavra.charAt(i);
            if ("aeiou".indexOf(letra) != -1) { 
                contador++;
            }
        }

        System.out.println("A palavra \"" + palavra + "\" possui " + contador + " vogais.");

        sc.close();
    }
}


  


