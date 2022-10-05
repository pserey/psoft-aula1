package sistema;

public class Sistema {
    private ProdRepo pr;
    private LoteRepo lr;

    public void criaProduto(String nome, String fabricante, double preco) {
        Produto prod = new Produto(nome, fabricante, preco);

    }

    public void criaLote(Produto prod, int quantidade, String dov) {
    }

    public String listaLotes() {
        return lr.listaLotes();
    }

    public String listaProdutos() {
        return pr.listaProdutos();
    }
}
