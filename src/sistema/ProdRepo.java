package sistema;

import java.util.HashMap;

public class ProdRepo {
    private HashMap<Integer, Produto> produtos = new HashMap<Integer, Produto>();
    private int key = 0;

    public void guardaProduto(Produto prod) {
        produtos.put(key, prod);
        key++;
    }

    public String listaProdutos() {
        return produtos.toString();
    }
}
