package domain;

public class ColaboradorMensalista extends Colaborador{

    public ColaboradorMensalista() {
    }

    public ColaboradorMensalista(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    @Override
    public double calcularRemuneracao() {
        return this.getSalarioBase();
    }
}
