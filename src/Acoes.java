public enum Acoes {
   X(1, 'X'),O(-1,'O'),EMPTY(0, ' ');
   private final int valor;
   private final char simbolo;
   private Acoes(int valor, char simbolo) {
      this.valor = valor;
      this.simbolo = simbolo;
   }
   public int getValor(){
      return valor;
   }
   public char getSimbolo() {
      return simbolo;
   }
}
