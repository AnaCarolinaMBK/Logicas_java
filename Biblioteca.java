package logicasjava;

/*
import java.sql.*;
import javax.swing.JOptionPane;

public class Biblioteca {

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

            JOptionPane.showMessageDialog(null, "Conexão estabelecida com sucesso!");

            while (true) {

                Object[] opcoes = {
                    "Cadastrar Cliente",
                    "Listar Cliente",
                    "Listar Livros",
                    "Realizar Empréstimo",
                    "Registrar Devolução",
                    "Sair"
                };

                int escolha = JOptionPane.showOptionDialog(
                    null,
                    "Escolha uma opção:",
                    "MENU BIBLIOTECA",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.PLAIN_MESSAGE,
                    null,
                    opcoes,
                    opcoes[0]
                );

                if (escolha == -1 || escolha == 5)
                    break;

                switch (escolha) {
                    case 0 -> inserirCliente(conn);
                    case 1 -> listarClientes(conn);
                    case 2 -> listarLivros(conn);
                    case 3 -> emprestarLivro(conn);
                    case 4 -> devolverLivro(conn);
                }
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,"Erro de SQL: " + e.getMessage());
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

            JOptionPane.showMessageDialog(null, "Cliente inserido com sucesso!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

 

    static void listarClientes(Connection conn) {
        try {
            String sql = "SELECT nome, telefone, email FROM tb_cliente";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            StringBuilder lista = new StringBuilder("CLIENTES CADASTRADOS:\n\n");

            while (rs.next()) {
                lista
                     .append("Nome: ").append(rs.getString("nome")).append("\n")
                     .append("Telefone: ").append(rs.getString("telefone")).append("\n")
                     .append("Email: ").append(rs.getString("email")).append("\n")
                     .append("----------------------------------------\n");
            }

            JOptionPane.showMessageDialog(null, lista.toString());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar clientes: " + e.getMessage());
        }
    }
 


    static void listarLivros(Connection conn) {
        try {
            String sql = "SELECT id_livro, titulo, autor, ano_publicado, genero, disponivel FROM tb_livros";
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            StringBuilder lista = new StringBuilder("LIVROS NO BANCO:\n\n");

            while (rs.next()) {
                lista.append("ID: ").append(rs.getInt("id_livro")).append("\n")
                     .append("Título: ").append(rs.getString("titulo")).append("\n")
                     .append("Autor: ").append(rs.getString("autor")).append("\n")
                     .append("Ano: ").append(rs.getInt("ano_publicado")).append("\n")
                     .append("Gênero: ").append(rs.getString("genero")).append("\n")
                     .append("Disponível: ").append(rs.getInt("disponivel")).append("\n")
                     .append("----------------------------------------\n");
            }

            JOptionPane.showMessageDialog(null, lista.toString());

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao listar livros: " + e.getMessage());
        }
    }

 

    static void emprestarLivro(Connection conn) {
        try {
            String nome = JOptionPane.showInputDialog("Nome do cliente:");
            String titulo = JOptionPane.showInputDialog("Título do Livro:");
            String data = JOptionPane.showInputDialog("Data empréstimo (AAAA-MM-DD):");
            String sql = "SELECT id_livro, titulo, autor, ano_publicado, genero, disponivel FROM tb_livros";

            String sql = "{CALL Emprestimo_USP(?,?,?)}";

            try (CallableStatement stmt = conn.prepareCall(sql)) {
                stmt.setString(1, nome);
                stmt.setString(2, titulo);
                if (data == null || data.isEmpty()) {
                    stmt.setNull(3, java.sql.Types.DATE);
                } else {
                    stmt.setDate(3, java.sql.Date.valueOf(data));
                }
                stmt.execute();
            }

            JOptionPane.showMessageDialog(null, "Empréstimo realizado!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: " + e.getMessage());
        }
    }

    

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
\*/