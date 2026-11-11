package edu.fatec.lp2.exercicio2;

import edu.fatec.lp2.exercicio2.interfaces.Calculavel;

public class ListaCompra implements Calculavel {

    private ItemCompra[] itensCompra;
    private int qtdeMax;
    private int qtdeAtual;

    public ListaCompra(int qtdeMax) {
        this.qtdeMax = qtdeMax;
        this.itensCompra = new ItemCompra[qtdeMax];
    }

    public ItemCompra[] getItensCompra() {
        return itensCompra;
    }

    public int getQtdeMax() {
        return qtdeMax;
    }

    public int getQtdeAtual() {
        return qtdeAtual;
    }

    public void incluir(ItemCompra item) {
        if (qtdeAtual >= qtdeMax) {
            throw new IllegalStateException("A lista atingiu o limite de " + qtdeMax + " itens");
        }
        itensCompra[qtdeAtual++] = item;
    }

    @Override
    public double calcularPreco() {
        double total = 0;
        for (int i = 0; i < qtdeAtual; i++) {
            total += itensCompra[i].calcularPreco();
        }
        return total;
    }

}
