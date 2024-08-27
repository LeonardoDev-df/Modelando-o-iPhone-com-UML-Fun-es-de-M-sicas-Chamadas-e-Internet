package main.com.iphone;
public class iPhone extends Dispositivo 
                implements IReprodutorMusical, IAparelhoTelefonico, INavegadorInternet {

    @Override
    public void tocarMusica() {
        System.out.println("Reproduzindo música.");
    }

    @Override
    public void pausarMusica() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada.");
    }

    @Override
    public void fazerChamada() {
        System.out.println("Fazendo chamada.");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atendendo chamada.");
    }

    @Override
    public void encerrarChamada() {
        System.out.println("Chamada encerrada.");
    }

    @Override
    public void abrirPagina() {
        System.out.println("Abrindo página na internet.");
    }

    @Override
    public void adicionarFavorito() {
        System.out.println("Adicionando página aos favoritos.");
    }

    @Override
    public void exibirHistorico() {
        System.out.println("Exibindo histórico de navegação.");
    }
}
