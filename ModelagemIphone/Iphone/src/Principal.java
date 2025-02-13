public class Principal {
    public static void main(String[] args) {
        // Criando objetos das classes implementadas
        ReprodutorMusical reprodutor = new ReprodutorMusicalImpl();
        AparelhoTelefonico telefone = new AparelhoTelefonicoImpl();
        NavegadorInternet navegador = new NavegadorInternetImpl();
        
        // Testando o Reprodutor Musical
        reprodutor.selecionarMusica("Imagine");
        reprodutor.tocar();
        reprodutor.pausar();
        
        // Testando o Aparelho Telefônico
        telefone.ligar("123456789");
        telefone.atender();
        telefone.iniciarCorreioVoz();
        
        // Testando o Navegador na Internet
        navegador.exibirPagina("https://www.google.com");
        navegador.adicionarNovaAba();
        navegador.atualizarPagina();
    }
}
