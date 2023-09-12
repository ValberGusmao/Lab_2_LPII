public class Jogador {
    private final String nome;
    private static Acoes[] simbolosUsados;
    private static int indice = 0;
    private Acoes movimento;
    public Jogador(String nome){
        this.nome = nome;
        simbolosUsados = new Acoes[Acoes.values().length-1];
        this.movimento = definirSimbolo();
    }
    private Acoes definirSimbolo(){
        boolean siboloInvalido = false;
        for (Acoes a:Acoes.values()) {
            for (Acoes s:simbolosUsados) {
                if (a == s || a == Acoes.EMPTY){
                    siboloInvalido = true;
                    break;
                }
            }
            if(!siboloInvalido){
                simbolosUsados[indice] = a;
                indice++;
                return a;
            }
            siboloInvalido = false;
        }
        return null;
    }
    public String getNome() {
        return nome;
    }
    public Acoes getMovimento(){
        return movimento;
    }
}
