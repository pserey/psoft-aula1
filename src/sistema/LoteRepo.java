package sistema;

import java.util.HashMap;

public class LoteRepo {
    private HashMap<Integer, Lote> lotes = new HashMap<Integer, Lote>();
    private int key = 0;

    public void criaLote(Lote lote) {
        lotes.put(key, lote);
        key++;
    }

    public String listaLotes() {
        return lotes.toString();
    }

}
