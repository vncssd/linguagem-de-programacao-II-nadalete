package domain;

public class ColaboradorMensalista extends Colaborador implements Tributavel{

    public ColaboradorMensalista() {
    }

    public ColaboradorMensalista(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcularRemuneracao() {
        return this.getSalarioBase() - calcularImposto();
    }

    @Override
    public double calcularImposto() {
        return this.getSalarioBase() * 0.08;
    }


}
