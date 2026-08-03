package atividade02_lerdados;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader leitor = new BufferedReader(new FileReader("dados.txt"));

        String linha;

        while ((linha = leitor.readLine()) != null) {
            String[] dados = linha.split(";");

            String nome = dados[0];
            int idade = Integer.parseInt(dados[1]);

            System.out.println("Idade: " + nome);
            System.out.println("Nome: " + idade);
            System.out.println("----------------");
        }

        leitor.close();
    }
}
