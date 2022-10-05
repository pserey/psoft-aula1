package sistema;

public class Sistema {
    private ProdRepo pr;
    private LoteRepo lr;

    public Sistema() {
        pr = new ProdRepo();
        lr = new LoteRepo();
    }

    public void criaProduto(String nome, String fabricante, double preco) {
        Produto prod = new Produto(nome, fabricante, preco);
        pr.guardaProduto(prod);
    }

    public void criaLote(Produto prod, int quantidade, String dov) {
        Lote lote = new Lote(prod, quantidade, dov);
        lr.guardaLote(lote);
    }

    public String listaLotes() {
        return lr.listaLotes();
    }

    public String listaProdutos() {
        return pr.listaProdutos();
    }
}
