package sistema;

public class Controller {
    public Sistema s;

    public void criaProduto(String nome, String fabricante, double preco) {
        s.criaProduto(nome, fabricante, preco);
    }

    public void criaLote(Produto prod, int quantidade, String dov) {
        s.criaLote(prod, quantidade, dov);
    }

    public String listaLotes() {
        return s.listaLotes();
    }

    public String listaProdutos() {
        return s.listaProdutos();
    }
}
