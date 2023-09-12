package Atv02;

public class PessoaFisica extends Pessoa{
    private String cpf;
    private String dataNacimento;
    private String estadoCivil;

    public PessoaFisica(String nome, String endereco, String email, String cpf, String dataNacimento, String estadoCivil) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.dataNacimento = dataNacimento;
        this.estadoCivil = estadoCivil;
    }

    public String getDataNacimento() {
        return dataNacimento;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    @Override
    public String getIdentificaco() {
        return cpf;
    }
}
