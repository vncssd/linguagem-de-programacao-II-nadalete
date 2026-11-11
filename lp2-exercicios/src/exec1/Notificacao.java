package exec1;

public abstract class Notificacao {

    private String titulo;
    private String conteudo;

    public abstract String enviar(String titulo, String conteudo, String destinatario);

}