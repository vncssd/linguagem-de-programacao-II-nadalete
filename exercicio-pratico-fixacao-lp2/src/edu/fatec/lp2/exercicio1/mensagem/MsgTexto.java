package edu.fatec.lp2.exercicio1.mensagem;

import edu.fatec.lp2.exercicio1.Contatinho;

public class MsgTexto extends Mensagem {

    private int numChar;

    public MsgTexto(Contatinho destinatario, String horaEnvio, String conteudo) {
        super(destinatario, horaEnvio, conteudo);
        this.numChar = conteudo.length();
    }

    public int getNumChar() {
        return numChar;
    }

    public void setNumChar(int numChar) {
        this.numChar = numChar;
    }

    @Override
    public Mensagem sendMessage(String texto) {
        setConteudo(texto);
        this.numChar = texto.length();
        return this;
    }

    @Override
    public String toString() {
        return "MsgTexto{" + super.toString() + ", numChar=" + numChar + '}';
    }

}
