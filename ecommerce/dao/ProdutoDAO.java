package ecommerce.dao;

import ecommerce.model.Produto;
import ecommerce.util.Conexao;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ProdutoDAO {

    public void cadastrarProduto(Produto produto) throws SQLException {
        Connection conexao = Conexao.conectar();
        String sql = "INSERT INTO produtos (id, nome, preco, estoque) VALUES (?, ?, ?, ?)";

        PreparedStatement stmt = conexao.prepareStatement(sql);

        stmt.setInt(1, produto.getId());
        stmt.setString(2, produto.getNome());
        stmt.setDouble(3, produto.getPreco());
        stmt.setInt(4, produto.getEstoque());

        int linhas = stmt.executeUpdate();
        System.out.println("Produto cadastrado! Linhas afetadas: " + linhas);
    }
    public List<Produto> listarProdutos() throws SQLException {
    List<Produto> produtos = new ArrayList<>();

    Connection conexao = Conexao.conectar();

    String sql = "SELECT id, nome, preco, estoque FROM produtos";

    PreparedStatement stmt = conexao.prepareStatement(sql);

    ResultSet rs = stmt.executeQuery();

    while (rs.next()) {
        Produto produto = new Produto(
        rs.getInt("id"),
        rs.getString("nome"),
        rs.getDouble("preco"),
        rs.getInt("estoque")
    );
        produtos.add(produto);
    }
    return produtos;
}
}