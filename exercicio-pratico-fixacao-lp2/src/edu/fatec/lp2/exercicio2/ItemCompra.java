package edu.fatec.lp2.exercicio2;

import edu.fatec.lp2.exercicio2.interfaces.Calculavel;

public class ItemCompra implements Calculavel {

    private int quantidade;
    private Produto produto;
    private double desconto;

    public ItemCompra(Produto produto, double desconto) {
        this.produto = produto;
        setDesconto(desconto);
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if (desconto < 0 || desconto > produto.getDescontoMaximo()) {
            throw new IllegalArgumentException(
                    "O desconto deve estar entre 0 e " + produto.getDescontoMaximo());
        }
        this.desconto = desconto;
    }

    @Override
    public double calcularPreco() {
        return produto.getPreco() * quantidade * (1 - desconto / 100);
    }

}
