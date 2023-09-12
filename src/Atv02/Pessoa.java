package Atv02;

public abstract class Pessoa {
    protected String nome;
    protected String endereco;
    protected String email;

    public Pessoa(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getEmail() {
        return email;
    }

    public abstract String getIdentificaco();
}
