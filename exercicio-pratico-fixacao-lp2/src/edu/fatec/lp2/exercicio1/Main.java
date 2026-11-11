package edu.fatec.lp2.exercicio1;

import edu.fatec.lp2.exercicio1.mensagem.*;
import edu.fatec.lp2.exercicio1.mensagem.MsgTexto;

public class Main {

    public static void main(String[] args) {
        Contatinho ana = new Contatinho("Ana", "11 99999-0001");
        Contatinho bruno = new Contatinho("Bruno", "11 99999-0002");

        Contatinho[] contatos = {ana, bruno};

        Mensagem texto = new MsgTexto(ana, "10:15", "Oi, tudo bem?");
        Mensagem audio = new MsgAudio(bruno, "10:20", "audio_001.mp3", 35);
        Mensagem foto = new MsgFoto(ana, "10:30", "foto_001.jpg", 2048);

        Mensagem[] mensagens = {texto, audio, foto};

        Whatsapp whatsapp = new Whatsapp(contatos, mensagens);

        System.out.println("Contatos:");
        whatsapp.listarContatos();

        System.out.println("\nMensagens:");
        whatsapp.listarMensagens();

        Mensagem reenviada = texto.sendMessage("Oi, podemos conversar?");
        System.out.println("\nMesma instância: " + (reenviada == texto));
        System.out.println(reenviada);
    }

}
