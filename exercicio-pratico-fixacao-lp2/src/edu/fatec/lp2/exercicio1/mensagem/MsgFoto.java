package edu.fatec.lp2.exercicio1.mensagem;

import edu.fatec.lp2.exercicio1.Contatinho;

public class MsgFoto extends Mensagem {

    private int tamanho;

    public MsgFoto(Contatinho destinatario, String horaEnvio, String conteudo, int tamanho) {
        super(destinatario, horaEnvio, conteudo);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public Mensagem sendMessage(String texto) {
        setConteudo(texto);
        return this;
    }

    @Override
    public String toString() {
        return "MsgFoto{" + super.toString() + ", tamanho=" + tamanho + '}';
    }

}
