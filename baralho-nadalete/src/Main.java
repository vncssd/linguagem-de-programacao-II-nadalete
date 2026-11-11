public class Main {

    static void main(String[] args) {

        Baralho baralho = new Baralho();

        baralho.imprimirBaralho();

        System.out.println("-----");

        baralho.embaralhar();
        baralho.imprimirBaralho();

        System.out.println("-----");

        baralho.distribuirCarta();

        baralho.hasCarta();

    }
}
