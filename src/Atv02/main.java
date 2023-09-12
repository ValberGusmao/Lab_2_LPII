package Atv02;

public class main {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        PessoaFisica p1 = new PessoaFisica("Fulano de Tal","Algum lugar","falaninho@gmail.com",
                "123.456.789-10", "10-01-2004","Solteiro");
        PessoaFisica p2 = new PessoaFisica("Beltrano","Onde judas perdeu as botas",
                "Beltrano98@gmail.com","098.765.432-11", "09-07-1998","Solteiro");
        PessoaFisica p3 = new PessoaFisica("Astrogildo","Desconhecido","ASTROgil@gmail.com",
                "245.974.110.47", "24-10-1974","casado");

        agenda.adicionarContado(p1);
        agenda.adicionarContado(p2);
        agenda.adicionarContado(p3);

        agenda.exibirTodos();

        PessoaJuridica ufma = new PessoaJuridica("UFMA"," Cidade Universitária","ufma@ufma.com",
                "06.279.103/0001-19", "077.044.780.018", "FUNDACAO UNIVERSIDADE FEDERAL DO MARANHAO");
        agenda.adicionarContado(ufma);

        agenda.exibirTodos();

        Pessoa p =  agenda.removerContado(p1.getIdentificaco());
        if (p != null){
            System.out.println("Pessoa Removida: "+p.getIdentificaco()+" - "+p.getNome());
            agenda.exibirTodos();
        }
        p = agenda.removerContado(ufma);
        if (p != null){
            System.out.println("Pessoa Removida: "+p.getIdentificaco()+" - "+p.getNome());
            agenda.exibirTodos();
        }

        if (agenda.pesquisarContado(p1.getIdentificaco()) != null){
            System.out.println("A pessoa " + p1.getNome() + " existe");
        }
        else {
            System.out.println("A pessoa " + p1.getNome() + " NÃO existe");
        }
    }
}
