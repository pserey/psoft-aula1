package sistema;

import java.util.Collection;
import java.util.HashMap;

public class ProdRepo {
    private HashMap<Integer, Produto> produtos;
    private int key;

    public ProdRepo() {
        produtos = new HashMap<Integer, Produto>();
        key = 0;
    }

    public void guardaProduto(Produto prod) {
        produtos.put(key, prod);
        key++;
    }

    public Collection<Produto> listaProdutos() {
        return produtos.values();
    }
}
