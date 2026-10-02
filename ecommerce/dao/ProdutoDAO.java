package ecommerce.dao;

import ecommerce.model.Produto;
import ecommerce.util.Conexao;

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
}