package main.com.iphone;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
        // Testando o reprodutor musical
        meuIphone.tocarMusica();
        meuIphone.pausarMusica();
        meuIphone.selecionarMusica();

        // Testando o aparelho telefônico
        meuIphone.fazerChamada();
        meuIphone.atenderChamada();
        meuIphone.encerrarChamada();

        // Testando o navegador de internet
        meuIphone.abrirPagina();
        meuIphone.adicionarFavorito();
        meuIphone.exibirHistorico();
    }
}