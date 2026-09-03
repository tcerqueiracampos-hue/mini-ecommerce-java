import javax.swing.JOptionPane;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    private int estoque;

    // Construtor da classe Produto
    Produto(int id, String nome, double preco, int estoque) {
        this.id = id;
        this.nome = nome;

        if (preco > 0) {
            this.preco = preco;
        } else {
            JOptionPane.showMessageDialog(null, "Preço inválido!");
        }

        if (estoque >= 0) {
            this.estoque = estoque;
        } else {
            JOptionPane.showMessageDialog(null, "Estoque inválido!");
        }
    }

    // Método para apresentar as informações do produto
    void apresentaProduto() {
        JOptionPane.showMessageDialog(null,
            "ID: " + this.id + "\n" +
            "Nome: " + this.nome + "\n" +
            "Preço: " + this.preco + "\n" +
            "Estoque: " + this.estoque);
    }

    // Método para modificar o preço do produto
    void modificaPreco(double novoPreco) {
        if (novoPreco > 0) {
            this.preco = novoPreco;
        } else {
            JOptionPane.showMessageDialog(null, "Preço inválido!");
        }
    }

    // Método para modificar o estoque do produto
    void modificaEstoque(int novoEstoque) {
        if (novoEstoque >= 0) {
            this.estoque = novoEstoque;
        } else {
            JOptionPane.showMessageDialog(null, "Estoque inválido!");
        }
    }

    // Métodos getters para acessar os atributos do produto
    public int getID() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }
}
