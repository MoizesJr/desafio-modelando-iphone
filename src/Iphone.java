
public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    public void tocar() {
        System.out.println("Tocando musica");
    }

    public void pausar() {
        System.out.println("Musica pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Musica selevionada: " + musica);
    }

    public void exibirPaginas(String url) {
        System.out.println("Pagina " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Pagina atualizada");
    }

    public void ligar(String numero) {
        System.out.println("Chamando " + numero);
    }

    public void atender() {
        System.out.println("Ligação atendida");
    }

    public void iniciarCorreioVoz() {
        System.out.println("mensagem de voz");
    }
}
