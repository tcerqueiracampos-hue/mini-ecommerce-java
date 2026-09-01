import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;

public class Ecommerce {
    public static void main(String[] args){
        
        Map<Integer, Produto> produtos = new HashMap<>();
// Adicionar produtos ao mapa
        Produto notebook = new Produto(101, "Notebook", 3500.00, 5);
        produtos.put(notebook.getID(), notebook);

        Produto mouse = new Produto(102, "Mouse", 50.00, 20);
        produtos.put(mouse.getID(), mouse);

        Produto teclado = new Produto(103, "Teclado", 150.00, 15);
        produtos.put(teclado.getID(), teclado);

// Apresentar informações de um produto
        int id = Integer.parseInt(
        JOptionPane.showInputDialog("Digite o ID do produto:")
        );
        
         if (produtos.containsKey(id)) {
            Produto produto = produtos.get(id);
            produto.apresentaProduto();
        
        } else {
        JOptionPane.showMessageDialog(null, "Produto não encontrado.");
        }

        for (Produto produto : produtos.values()) {
            produto.apresentaProduto();
        }
// Modificar o preço de um produto
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
// Modificar o estoque de um produto
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
// Calcular o valor total do estoque
        double valorTotal = 0;
        for (Produto produto : produtos.values()) {
            valorTotal += produto.getPreco() * produto.getEstoque();
        }
        JOptionPane.showMessageDialog(null,
        "Valor total do estoque: R$ " + valorTotal);

// deletar um produto do mapa
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
    }
