package edu.fatec.lp2.exercicio1.mensagem;

import edu.fatec.lp2.exercicio1.Contatinho;

public class MsgAudio extends Mensagem {

    private int duracao;

    public MsgAudio(Contatinho destinatario, String horaEnvio, String conteudo, int duracao) {
        super(destinatario, horaEnvio, conteudo);
        this.duracao = duracao;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public Mensagem sendMessage(String texto) {
        setConteudo(texto);
        return this;
    }

    @Override
    public String toString() {
        return "MsgAudio{" + super.toString() + ", duracao=" + duracao + '}';
    }

}
