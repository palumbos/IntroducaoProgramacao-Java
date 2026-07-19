package escrever_arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        BufferedWriter arquivo = new BufferedWriter(new FileWriter("dados.txt"));

        while (true) {
            String frase = input.nextLine();

            if (frase.isBlank()) {
                break;
            }

            arquivo.write(frase);
            arquivo.newLine();
        }

        arquivo.close();
        input.close();
    }
}
