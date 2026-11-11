import domain.Colaborador;
import domain.ColaboradorComissionado;
import domain.ColaboradorHorista;
import domain.ColaboradorMensalista;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class Main {

    static void main(String[] args) {

        Colaborador colaboradorHorista = new ColaboradorHorista("Gabriel Agreste", "123456798", 35.00, 88);
        Colaborador colaboradorHorista2 = new ColaboradorHorista("Chloe Bourgeois", "123556798", 35.00, 38);
        Colaborador colaboradorMensalista = new ColaboradorMensalista("Marinette Dupain-Cheng", "987654321", 2500.00);
        Colaborador colaboradorMensalista2 = new ColaboradorMensalista("Luka Couffaine", "959654321", 2500.00);
        Colaborador colaboradorComissionado = new ColaboradorComissionado("Adrien Agreste", "918273645", 3000.00, 30.2);
        Colaborador colaboradorComissionado2 = new ColaboradorComissionado("Zoe Lee", "918272545", 3000.00, 21.2);

        List<Colaborador> colaboradores = new LinkedList<>();

        colaboradores.add(colaboradorComissionado);
        colaboradores.add(colaboradorHorista);
        colaboradores.add(colaboradorMensalista);
        colaboradores.add(colaboradorComissionado2);
        colaboradores.add(colaboradorHorista2);
        colaboradores.add(colaboradorMensalista2);

        System.out.println("Folha da Empresa");

        colaboradores.forEach(Colaborador::exibirResumo);

        BigDecimal total = colaboradores.stream()
                .map(Colaborador::calcularRemuneracao)
                .map(BigDecimal::valueOf)
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Total da Folha: " + total);
    }

}
