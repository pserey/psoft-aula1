public class Sistema {
    public static void main(String[] args) {
        Produto cadeira = new Produto("Cadeira", "Cadeiras LTDA", 25.30);
        Lote cadeiras = new Lote(cadeira, 20, "12/09/2022");
    }
}
