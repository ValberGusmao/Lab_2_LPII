package Atv02;

import java.util.ArrayList;

public class Agenda {
    private ArrayList<Pessoa> contados;

    public Agenda() {
        this.contados = new ArrayList<>();
    }

    public boolean adicionarContado(Pessoa contado){
        if (contado != null){
            this.contados.add(contado);
            return true;
        }
        return false;
    }
    public Pessoa removerContado(String identificao){
        Pessoa cRemovido;
        cRemovido = pesquisarContado(identificao);
        if (contados.remove(cRemovido)){
            return cRemovido;
        }
        return null;
    }
    public Pessoa removerContado(Pessoa contado) {
        if (contados.remove(contado)){
            return contado;
        }
        return null;
    }

    public Pessoa pesquisarContado(String identificao){
        for (Pessoa c:contados){
            if (c.getIdentificaco().equals(identificao)){
                return c;
            }
        }
        return null;
    }

    public void exibirTodos(){
        for (Pessoa c:contados){
            System.out.println(c.getIdentificaco()+" - "+c.getNome()+" - "+c.getEndereco()+" - "+c.getEmail());
        }
        System.out.println();
    }
}
