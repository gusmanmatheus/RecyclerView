package br.com.jwk.myapplication;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BancoDeDados {

    public static List<Pessoa> pessoas;
    public static List<Pessoa> pessoasDoentes;

    public static void init() {

        pessoas = Arrays.asList(
                new Pessoa("Jose", 1989),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Zeze", 2001)
        );

        pessoasDoentes = Arrays.asList(
                new Pessoa("Jose", 1989),
                new Pessoa("Maria", 1989),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Renato", 1992),
                new Pessoa("Mateus", 1988),
                new Pessoa("João", 2000),
                new Pessoa("Zeze", 2001)
        );
    }

    public static Pessoa getNome(String nome) {
        for (Pessoa pessoa : pessoas) {
            if (pessoa.getNome().equals(nome))
                return pessoa;
        }

        return null;
    }

    public static List<Pessoa> getMaiores() {
        List<Pessoa> maiores18 = new ArrayList<>();
        int anoAtual = 2018;

        for (Pessoa pessoa : pessoas) {
            if ((anoAtual - pessoa.getAnoNascimento()) >= 18) {
                maiores18.add(pessoa);
            }
        }

        return maiores18;
    }
}