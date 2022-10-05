package sistema;

public class Main {
    public static Controller c;
    public static void main(String[] args) {
        c = new Controller();

        Produto p1 = c.criaProduto("Cadeira Top", "Produtos Top LTDA", 25.99);
        Produto p2 = c.criaProduto("Bicicleta Top", "Produtos Top LTDA", 250.50);
        Produto p3 = c.criaProduto("Bola Top", "Produtos Top LTDA", 10.00);
        Produto p4 = c.criaProduto("Furadeira", "Produtos de Construção LTDA", 400.00);

        System.out.println(c.listaProdutos());

        c.criaLote(p1, 20, "20.12.2023");
        c.criaLote(p2, 12, "23.03.2029");
        c.criaLote(p3, 100, "11.01.2020");
        c.criaLote(p4, 10, "02.08.2024");

        System.out.println(c.listaLotes());
    }
}
