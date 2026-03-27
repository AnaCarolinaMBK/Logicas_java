 package logicasjava;

import javax.swing.JOptionPane;

 
public class Mtrizesex {;
    public static void main(String[] args) {

        int[][] produtos = new int[3][4];

        
        for (int secao = 0; secao < produtos.length; secao++) {
            JOptionPane.showMessageDialog(null, "Seção " + (secao + 1));

            for (int prateleira = 0; prateleira < produtos[secao].length; prateleira++) {
                String entrada = JOptionPane.showInputDialog(
                        "Informe a quantidade de produtos na prateleira " + (prateleira + 1) + ": ");
                produtos[secao][prateleira] = Integer.parseInt(entrada);
            }
        }

        
        StringBuilder mensagem = new StringBuilder("Quantidades Informadas ");

        for (int s = 0; s < produtos.length; s++) {
            mensagem.append("Seção /n").append(s + 1).append(":");
            for (int p = 0; p < produtos[s].length; p++) {
                mensagem.append("  Prateleira /n").append(p + 1).append(": ")
                        .append(produtos[s][p]).append(" produtos /n");
            }
        }

 
        JOptionPane.showMessageDialog(null, mensagem.toString());

       
        int total = 0;
        for (int s = 0; s < produtos.length; s++) {
            for (int p = 0; p < produtos[s].length; p++) {
                total += produtos[s][p];
            }
        }

        JOptionPane.showMessageDialog(null, "Quantidade total: " + total);
        
       
      
        
    }
}