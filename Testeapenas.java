/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logicasjava;

import java.sql.*;
import javax.swing.JOptionPane;

public class Testeapenas {
    
    static String servidor = "TBS0676758W11-1\\SQLEXPRESS";
    static String bancoDeDados = "Biblioteca_US";

    private static final String CONNECTION_URL =
            "jdbc:sqlserver://" + servidor + ":1433;" +
            "databaseName=" + bancoDeDados + ";" +
            "integratedSecurity=true;" +
            "encrypt=true;" +
            "trustServerCertificate=true;";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(CONNECTION_URL)) {

            JOptionPane.showMessageDialog(null, "Conexão estabelecida!");

            while (true) {
                String opcao = JOptionPane.showInputDialog(
                    "MENU BIBLIOTECA\n\n" +
                    "1 - Cadastrar Cliente\n" +
                    "2 - Cadastrar Livro\n" +
                    "3 - Realizar Empréstimo\n" +
                    "4 - Registrar Devolução\n" +
                    "5 - Sair\n\n" +
                    "Escolha uma opção:"
                );

                if (opcao == null || opcao.equals("5")) break;

                switch (opcao) {
                    case "1": inserirCliente(conn); break;
                    case "2": inserirLivro(conn); break;
                    case "3": emprestarLivro(conn); break;
                    case "4": devolverLivro(conn); break;
                    default: 
                        JOptionPane.showMessageDialog(null, "Opção inválida!");
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro SQL: " + e.getMessage());
        }
    }

    
    static void inserirCliente(Connection conn) {
        try {
            String nome = JOptionPane.showInputDialog("Nome do cliente:");
            String telefone = JOptionPane.showInputDialog("Telefone:");
            String email = JOptionPane.showInputDialog("Email:");

            String sql = "{CALL Inserir_clientes(?,?,?)}";

            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setString(1, nome);
                stmt.setString(2, telefone);
                stmt.setString(3, email);

                stmt.execute();
            }

            JOptionPane.showMessageDialog(null, "Cliente inserido!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }


    // ========================================================
    // 2) INSERIR LIVRO (procedure Inserir_Livros)
    // ========================================================
    static void inserirLivro(Connection conn) {
        try {
            String titulo = JOptionPane.showInputDialog("Título:");
            String autor = JOptionPane.showInputDialog("Autor:");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Ano publicado:"));
            String genero = JOptionPane.showInputDialog("Gênero:");
            int disp = Integer.parseInt(JOptionPane.showInputDialog("Quantidade disponível:"));

            String sql = "{CALL Inserir_Livros(?,?,?,?,?)}";

            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setString(1, titulo);
                stmt.setString(2, autor);
                stmt.setInt(3, ano);
                stmt.setString(4, genero);
                stmt.setInt(5, disp);

                stmt.execute();
            }

            JOptionPane.showMessageDialog(null, "Livro inserido!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }


    // ========================================================
    // 3) EMPRESTAR (procedure Emprestimo_USP)
    // ========================================================
    static void emprestarLivro(Connection conn) {
        try {
            String nome = JOptionPane.showInputDialog("Nome do cliente:");
            String titulo = JOptionPane.showInputDialog("Título do livro:");
            String data = JOptionPane.showInputDialog("Data empréstimo (AAAA-MM-DD):");

            String sql = "{CALL Emprestimo_USP(?,?,?)}";

            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setString(1, nome);
                stmt.setString(2, titulo);
                stmt.setDate(3, java.sql.Date.valueOf(data));

                boolean resultado = stmt.execute();

                if (resultado) {
                    ResultSet rs = stmt.getResultSet();
                    StringBuilder sb = new StringBuilder("Empréstimo realizado:\n\n");

                    while (rs.next()) {
                        sb.append("ID: ").append(rs.getInt("id_emprestimo")).append("\n")
                          .append("Cliente: ").append(rs.getString("nome")).append("\n")
                          .append("Livro: ").append(rs.getString("titulo")).append("\n")
                          .append("Data: ").append(rs.getDate("data_emprestimo")).append("\n\n");
                    }

                    JOptionPane.showMessageDialog(null, sb.toString());
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }


    // ========================================================
    // 4) DEVOLVER (procedure Devolucao_USP)
    // ========================================================
    static void devolverLivro(Connection conn) {
        try {
            int idEmp = Integer.parseInt(JOptionPane.showInputDialog("ID do empréstimo:"));
            String data = JOptionPane.showInputDialog("Data devolução (vazio = hoje):");

            String sql = "{CALL Devolucao_USP(?,?)}";

            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setInt(1, idEmp);

                if (data == null || data.isEmpty()) {
                    stmt.setNull(2, java.sql.Types.DATE);
                } else {
                    stmt.setDate(2, java.sql.Date.valueOf(data));
                }

                stmt.execute();
            }

            JOptionPane.showMessageDialog(null, "Devolução registrada!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

}
