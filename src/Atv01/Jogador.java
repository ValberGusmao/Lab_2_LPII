package Atv01;

public class Jogador {
    private final String nome;
    private static int numJogador = 0;
    private final Acoes movimento;
    public Jogador(String nome){
        this.nome = nome;
        this.movimento = Acoes.values()[numJogador];
        numJogador++;
    }
    public String getNome() {
        return nome;
    }
    public Acoes getMovimento(){
        return movimento;
    }
}
