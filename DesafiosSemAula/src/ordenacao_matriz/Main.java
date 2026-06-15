package ordenacao_matriz;

import java.util.Random;

public class Main {

    public static void main(String args[]) {
        int[][] matriz = new int[20][20];
        int aux, posicao = 0;

        // definição de cada posição
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
        int quantidade = matriz.length *  matriz[0].length;

        // colocando cada elemento da matriz no mesmo array
        int[] total = new int[quantidade];
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                total[posicao] = matriz[i][j];
                posicao++;
            }
        }

        // ordenação
        for (int i = 0; i < quantidade; i++) {
            for (int j = i + 1; j < quantidade; j++) {
                if (total[i] > total[j]) {
                    aux = total[i];
                    total[i] = total[j];
                    total[j] = aux;
                }
            }
        }

        // printar 
        for (int i = 0; i < quantidade; i++) {
            System.out.printf("%02d ", total[i]);

            if ((i + 1) % 20 == 0) {
                System.out.println();
            }
        }
        System.out.println("");

    }

}
