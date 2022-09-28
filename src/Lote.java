import java.sql.Date;

public class Lote {
    int quantidade;
    String datav;
    Produto prod;

    public Lote(Produto prod, int quantidade, String data) {
        this.prod = prod;
        this.datav = data;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return this.quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDatav() {
        return this.datav;
    }

    public void setDatav(String datav) {
        this.datav = datav;
    }

    public Produto getProd() {
        return this.prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }
}