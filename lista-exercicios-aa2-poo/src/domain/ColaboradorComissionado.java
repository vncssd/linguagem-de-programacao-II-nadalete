package domain;

import java.math.BigDecimal;

public class ColaboradorComissionado extends Colaborador implements Tributavel{

    private double percentualComissao;

    public ColaboradorComissionado() {
    }

    public ColaboradorComissionado(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    public ColaboradorComissionado(String nome, String cpf, double salarioBase, double percentualComissao) {
        super(nome, cpf, salarioBase);
        this.percentualComissao = percentualComissao;
    }

    public double getPercentualComissao() {
        return percentualComissao;
    }

    public void setPercentualComissao(double percentualComissao) {
        this.percentualComissao = percentualComissao;
    }

    @Override
    public double calcularRemuneracao() {
        return (this.getSalarioBase() + this.getSalarioBase()*percentualComissao/100) - calcularImposto();
    }

    @Override
    public double calcularImposto() {
        return this.getSalarioBase() * 0.1;
    }
}
