package Atv03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nome, sobrenome;
        int dia,mes,ano;

        System.out.println("Insira as seguintes informações:");
        System.out.print("Nome: ");
        nome = scan.next();
        System.out.print("Sobrenome: ");
        sobrenome = scan.next();
        System.out.println("Data de Nascimento: ");
        System.out.print("Dia: ");
        dia = scan.nextInt();
        System.out.print("Mes: ");
        mes = scan.nextInt();
        System.out.print("Ano: ");
        ano = scan.nextInt();

        HeartRates pessoa = new HeartRates(nome, sobrenome, dia, mes, ano);

        System.out.println("\nSuas informações são:");
        System.out.println(pessoa.getNome()+"."+pessoa.getSobrenome()+" - "+pessoa.getDataNascimento());

        System.out.println("Sua idade é: "+pessoa.getIdade());
        System.out.println("Sua frequencia cardiaca máxima é: "+pessoa.getFrequenciaMaxima());
        System.out.println("Sua frequencia cardiaca alvo é: "+pessoa.getFrequenciaAlvo());
    }
}
