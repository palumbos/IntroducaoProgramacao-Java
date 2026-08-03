package atividade01_escreverdados;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
      Scanner input = new Scanner(System.in);

        BufferedWriter escritor = new BufferedWriter(new FileWriter("dados.txt"));

        System.out.print("Digite seu nome: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = input.nextInt();

        escritor.write(nome + ";" + idade);
        escritor.newLine();

        escritor.close();
        input.close();
    }
}
