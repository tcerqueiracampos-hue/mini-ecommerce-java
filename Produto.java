import javax.swing.JOptionPane;

public class Produto {

    private int id;
    private String nome;
    private double preco;
    private int estoque;

}

Produto(int id, String nome, double preco, int estoque){
    this.id = id;
    this.nome = nome;
    this.preco = preco;
    this.estoque = estoque;
}

void apresentaproduto(){
    JOptionPane.showMessageDialog(null,
    "ID: " + this.id + "\n" +
    "Nome: " + this.nome + "\n" +
    "Preço: " + this.preco + "\n" +
    "Estoque: " + this.estoque);
}
void modificaPreco(double novoPreco) {
    this.preco = novoPreco;
}

void modificaEstoque(int novoEstoque){
    this.estoque = novoEstoque;
}

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
