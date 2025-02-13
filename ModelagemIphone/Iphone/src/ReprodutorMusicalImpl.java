public class ReprodutorMusicalImpl implements ReprodutorMusical {
    private String musicaAtual;

    @Override
    public void tocar() {
        System.out.println("Tocando a música: " + musicaAtual);
    }

    @Override
    public void pausar() {
        System.out.println("A música foi pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        this.musicaAtual = musica;
        System.out.println("Música selecionada: " + musica);
    }
}