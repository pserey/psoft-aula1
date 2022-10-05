package sistema;

import java.util.ArrayList;
import java.util.Collection;

public class Sistema {
    private ProdRepo pr;
    private LoteRepo lr;

    public Sistema() {
        pr = new ProdRepo();
        lr = new LoteRepo();
    }

    public Produto criaProduto(String nome, String fabricante, double preco) {
        Produto prod = new Produto(nome, fabricante, preco);
        pr.guardaProduto(prod);

        return prod;
    }

    public Lote criaLote(Produto prod, int quantidade, String dov) {
        Lote lote = new Lote(prod, quantidade, dov);
        lr.guardaLote(lote);

        return lote;
    }

    public String listaLotes() {
        Collection<Lote> lotes = lr.listaLotes();
        ArrayList<String> saida = new ArrayList<String>();

        for (Lote lote : lotes) {
            saida.add(lote.toString());
        }

        return saida.toString();
    }

    public String listaProdutos() {
        Collection<Produto> produtos = pr.listaProdutos();
        ArrayList<String> saida = new ArrayList<String>();

        for (Produto produto : produtos) {
            saida.add(produto.getNome());
        }

        return saida.toString();
    }
}
