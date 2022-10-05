package sistema;

import java.util.Collection;
import java.util.HashMap;

public class LoteRepo {
    private HashMap<Integer, Lote> lotes;
    private int key;

    public LoteRepo() {
        lotes = new HashMap<Integer, Lote>();
        key = 1;
    }

    public void guardaLote(Lote lote) {
        lotes.put(key, lote);
        key++;
    }

    public Collection<Lote> listaLotes() {
        return lotes.values();
    }

}
