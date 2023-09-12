package Atv01;

public class Jogo {
    private final Acoes[][] tabuleiro;
    private final Jogador[] jogadores;

    public Jogo(Jogador[] jogadores) {
        tabuleiro = new Acoes[3][3];
        this.jogadores = jogadores;

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[0].length; j++) {
                tabuleiro[i][j] = Acoes.EMPTY;
            }
        }
    }
    public boolean movimento(String mov) {
        int linha, coluna;

        if (mov.length() == 3){
            linha = Character.getNumericValue(mov.toCharArray()[0]);
            coluna = Character.getNumericValue(mov.toCharArray()[2]);

            if ((linha >= 0 && linha < 3) && (coluna >= 0 && coluna < 3) ){
                if (tabuleiro[linha][coluna] == Acoes.EMPTY){
                    tabuleiro[linha][coluna] = getJogadorAtual().getMovimento();
                    fimDeTurno();
                    return true;
                }
            }
        }
       return false;
    }

    private void fimDeTurno() {
        Jogador aux;
        //O jogador de indice 0, é aquele que está jogando no momento
        aux = jogadores[0];
        jogadores[0] = jogadores[1];
        jogadores[1] = aux;
    }
    public boolean temEspaco(){
        for (Acoes[] i: tabuleiro){
            for (Acoes j: i){
                if (j == Acoes.EMPTY){
                    return true;
                }
            }
        }
        return false;
    }
    public EstadosJogo ganhouJogo(){
        int soma = 0;
        if (temEspaco()) {
            //Verifica a vitoria por linha
            for (Acoes[] lin : tabuleiro) {
                soma = lin[0].getValor() + lin[1].getValor() + lin[2].getValor();
                if (soma == 3 || soma == -3) {
                    return EstadosJogo.VITORIA;
                }
            }
            //Verifica a vitoria por coluna
            for (int col = 0; col < tabuleiro[0].length; col++) {
                soma = tabuleiro[0][col].getValor() + tabuleiro[1][col].getValor() + tabuleiro[2][col].getValor();
                if (soma == 3 || soma == -3) {
                    return EstadosJogo.VITORIA;
                }
            }
            //Verifica a vitoria por diagonal principal
            soma = tabuleiro[0][0].getValor() + tabuleiro[1][1].getValor() + tabuleiro[2][2].getValor();
            if (soma == 3 || soma == -3) {
                return EstadosJogo.VITORIA;
            }
            //Verifica a vitoria por diagonal segundaria
            soma = tabuleiro[0][2].getValor() + tabuleiro[1][1].getValor() + tabuleiro[2][0].getValor();
            if (soma == 3 || soma == -3) {
                return EstadosJogo.VITORIA;
            }
            return EstadosJogo.EMJOGO;
        }
        return EstadosJogo.EMPATE;
    }
    public void reiniciar(){
        for (Acoes[] i:tabuleiro) {
            for (int j = 0; j < tabuleiro[0].length; j++){
                i[j] = Acoes.EMPTY;
            }
        }
    }
    public Acoes[][] getTabuleiro() {
        return tabuleiro;
    }
    public Jogador getJogadorAtual() {
        return jogadores[0];
    }
    public Jogador getJogadorVencedor() {
        if (ganhouJogo() == EstadosJogo.VITORIA){
            return jogadores[1];
        }
        return null;
    }

}