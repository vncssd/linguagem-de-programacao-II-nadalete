package domain;

public class ColaboradorHorista extends Colaborador{

    private int horasTrabalhadas;

    public ColaboradorHorista() {
    }

    public ColaboradorHorista(String nome, String cpf, double salarioBase) {
        super(nome, cpf, salarioBase);
    }

    public ColaboradorHorista(String nome, String cpf, double salarioBase, int horasTrabalhadas) {
        super(nome, cpf, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularRemuneracao() {
        return this.getSalarioBase() * horasTrabalhadas;
    }
}
