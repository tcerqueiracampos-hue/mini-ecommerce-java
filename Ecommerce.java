import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Ecommerce {
    private Map<Integer, Produto> produtos = new HashMap<>();
    public void cadastrarProduto() {

    int id = Integer.parseInt(
    JOptionPane.showInputDialog("Digite o ID:"));

    String nome = JOptionPane.showInputDialog("Digite o nome do produto:");

    double preco = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o preço do produto:")
    );
    int estoque = Integer.parseInt(
        JOptionPane.showInputDialog("Digite o estoque do produto:")
    );
     Produto produto = new Produto(id, nome, preco, estoque);
     produtos.put(id, produto);
     JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso.");
}

public void buscarProduto() {
     int id = Integer.parseInt(
        JOptionPane.showInputDialog("Digite o ID do produto:")
        );
        
         if (produtos.containsKey(id)) {
            Produto produto = produtos.get(id);
            produto.apresentaProduto();
        
        } else {
        JOptionPane.showMessageDialog(null, "Produto não encontrado.");
        }
}
public void listarProdutos() {
    for (Produto produto : produtos.values()) {
            produto.apresentaProduto();
        }
}

public void alterarPreco() {
    double novoPreco = Double.parseDouble(
        JOptionPane.showInputDialog("Digite o novo preço:")
        );
        
        int id = Integer.parseInt(
        JOptionPane.showInputDialog("Digite o ID do produto para modificar o preço:")
        );
        
        if (produtos.containsKey(id)) {
            Produto produto = produtos.get(id);
            produto.modificaPreco(novoPreco);
            JOptionPane.showMessageDialog(null, 
            "Preço do produto atualizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado.");
        }
}

public void alterarEstoque() {
    int id = Integer.parseInt(
        JOptionPane.showInputDialog(
            "Digite o ID do produto para modificar o estoque:")
        );
        
        if (produtos.containsKey(id)) {
             int novoEstoque = Integer.parseInt(
            JOptionPane.showInputDialog("Digite o novo estoque:")
            );
            
            Produto produto = produtos.get(id);
            produto.modificaEstoque(novoEstoque);
            JOptionPane.showMessageDialog(null, 
            "Estoque do produto atualizado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado.");
        }
}

public void removerProduto() {
    int id = Integer.parseInt(
        JOptionPane.showInputDialog("digite o ID do produto para deletar:")
       );

       if(produtos.containsKey(id)){
            produtos.remove(id);
            JOptionPane.showMessageDialog(null, "Produto deletado com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado.");
        }
}
  
public void calcularValorEstoque() {
    double valorTotal = 0;
        for (Produto produto : produtos.values()) {
            valorTotal += produto.getPreco() * produto.getEstoque();
        }
        JOptionPane.showMessageDialog(null,
        "Valor total do estoque: R$ " + valorTotal);
}
    public static void main(String[] args){

         Ecommerce ecommerce = new Ecommerce();

        int opcao;
        do{
            opcao = Integer.parseInt(
    JOptionPane.showInputDialog("===== MINI E-COMMERCE =====\n" +

            "1 - Cadastrar produto\n" +
           "2 - Buscar produto\n" +
           " 3 - Listar produtos\n" +
           "4 - Alterar preço\n" +
            "5 - Alterar estoque\n" +
            "6 - Remover produto\n" +
            "7 - Calcular valor do estoque\n" +
            "0 - Sair\n\n" +

            "Digite uma opção:"));
            switch(opcao){
                case 1:
                    ecommerce.cadastrarProduto();
                    break;
                case 2:
                    ecommerce.buscarProduto();
                    break;
                case 3:
                    ecommerce.listarProdutos();
                    break;
                case 4:
                    ecommerce.alterarPreco();
                    break;
                case 5:
                    ecommerce.alterarEstoque();
                    break;
                case 6:
                    ecommerce.removerProduto();
                    break;
                case 7:
                    ecommerce.calcularValorEstoque();
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Saindo do programa.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida. Tente novamente.");
            }
        }
        while(opcao != 0);
       }
    }
