
package ler_arquivo;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner arquivo = new Scanner(new FileReader("dados.txt"));

        while (arquivo.hasNextLine()) {
            System.out.println(arquivo.nextLine());
        }

        arquivo.close();
    }
}
