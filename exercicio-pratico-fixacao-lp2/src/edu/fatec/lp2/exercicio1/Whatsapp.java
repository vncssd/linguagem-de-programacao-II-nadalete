package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.mensagem.Mensagem;

public class Whatsapp {

    private Contatinho[] contatos;
    private Mensagem[] mensagens;

    public Whatsapp(Contatinho[] contatos, Mensagem[] mensagens) {
        this.contatos = contatos;
        this.mensagens = mensagens;
    }

    public Contatinho[] getContatos() {
        return contatos;
    }

    public void setContatos(Contatinho[] contatos) {
        this.contatos = contatos;
    }

    public Mensagem[] getMensagens() {
        return mensagens;
    }

    public void setMensagens(Mensagem[] mensagens) {
        this.mensagens = mensagens;
    }

    public void listarContatos() {
        for (Contatinho c : contatos) {
            System.out.println(c);
        }
    }

    public void listarMensagens() {
        for (Mensagem m : mensagens) {
            System.out.println(m);
        }
    }

}
