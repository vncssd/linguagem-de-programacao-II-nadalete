package edu.fatec.lp2.exercicio2;

public class Main {

    public static void main(String[] args) {
        Supermercado supermercado = new Supermercado("Mercado do Astolfo");

        Produto arroz = new Produto(supermercado);
        arroz.setNome("Arroz");
        arroz.setUnidade("kg");
        arroz.setDescricao("Arroz branco tipo 1");
        arroz.setPreco(20.0);
        arroz.setDescontoMaximo(10);

        Produto feijao = new Produto(supermercado);
        feijao.setNome("Feijão");
        feijao.setUnidade("kg");
        feijao.setDescricao("Feijão carioca");
        feijao.setPreco(8.0);
        feijao.setDescontoMaximo(5);

        ItemCompra itemArroz = new ItemCompra(arroz, 10);
        itemArroz.setQuantidade(2);

        ItemCompra itemFeijao = new ItemCompra(feijao, 0);
        itemFeijao.setQuantidade(3);

        ListaCompra lista = new ListaCompra(2);
        lista.incluir(itemArroz);
        lista.incluir(itemFeijao);

        System.out.println(itemArroz.getProduto() + ": " + itemArroz.calcularPreco());
        System.out.println(itemFeijao.getProduto() + ": " + itemFeijao.calcularPreco());
        System.out.println("Total: " + lista.calcularPreco());

        try {
            lista.incluir(new ItemCompra(arroz, 0));
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

}
