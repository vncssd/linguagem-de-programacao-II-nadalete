package exec1;

public class NotificacaoSMS extends Notificacao {

    @Override
    public String enviar(String titulo, String conteudo, String destinatario) {
        return "PARA: " + destinatario +
                "ASSUNTO: " + titulo + "\n" +
                conteudo + "\n";
    }

}
