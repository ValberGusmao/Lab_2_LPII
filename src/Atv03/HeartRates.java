package Atv03;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRates {
    private String nome;
    private String sobrenome;
    private LocalDate dataNascimento;
    private final LocalDate dataAtual;

    public HeartRates(String nome, String sobrenome, int dia, int mes, int ano) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        dataNascimento = LocalDate.of(ano,mes,dia);
        dataAtual = LocalDate.now();
    }

    public int getIdade(){
        Period periodo = Period.between(dataNascimento, dataAtual);
        return periodo.getYears();
    }

    public int getFrequenciaMaxima(){
        return 220 - getIdade();
    }
    public String getFrequenciaAlvo(){
        String fAlvo;
        fAlvo = String.valueOf((int) (getFrequenciaMaxima()*0.50));
        fAlvo = fAlvo.concat(" ~ ");
        fAlvo = fAlvo.concat(String.valueOf(((int) (getFrequenciaMaxima()*0.85))));
        return fAlvo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getDataNascimento() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return dataNascimento.format(formatter);
    }

    public void setDataNascimento(int dia, int mes, int ano) {
        this.dataNascimento = LocalDate.of(ano,mes,dia);
    }
}
