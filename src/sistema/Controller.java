package sistema;

public class Controller {
    public Sistema s;

    public Controller() {
        s = new Sistema();
    }

    public Produto criaProduto(String nome, String fabricante, double preco) {
        return s.criaProduto(nome, fabricante, preco);
    }

    public Lote criaLote(Produto prod, int quantidade, String dov) {
        return s.criaLote(prod, quantidade, dov);
    }

    public String listaLotes() {
        return s.listaLotes();
    }

    public String listaProdutos() {
        return s.listaProdutos();
    }
}
