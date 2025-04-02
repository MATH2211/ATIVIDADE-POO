package EstoqueProduto;

public class Main {
    public static void main(String[] args) {
        EstoqueProduto produto = new EstoqueProduto("Computador", 10, 58000.00);
        // Aqui você pode chamar métodos para manipular o objeto 'produto', se existirem.

        produto.exibirEstoque();
        produto.cadastrarProduto("notebook", 14, 152.000);
        produto.exibirEstoque();

    }
}
