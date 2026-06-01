package atividade05_vendedor;

import java.util.Scanner;

public class Main {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] vendas = new int[12];
        float[] totalVendido = new float[12];
        int vendedor, totalVendas=0;
        float valor, valorTotal=0;

        System.out.print("quem foi o vendedor que fez a venda(digite -1 para sair da venda): ");
        vendedor = input.nextInt();

        while (vendedor != -1) {

            System.out.print("digite de quanto foi a venda: ");
            valor = input.nextFloat();

            switch (vendedor) {

                case 1: {
                    vendas[1] = vendas[1] + 1;
                    totalVendido[1] = vendas[1] + valor;
                    break;
                }

                case 2: {
                    vendas[2] = vendas[2] + 1;
                    totalVendido[2] = vendas[2] + valor;
                    break;
                }

                case 3: {
                    vendas[3] = vendas[3] + 1;
                    totalVendido[3] = vendas[3] + valor;
                    break;
                }

                case 4: {
                    vendas[4] = vendas[4] + 1;
                    totalVendido[4] = vendas[4] + valor;
                    break;
                }

                case 5: {
                    vendas[5] = vendas[5] + 1;
                    totalVendido[5] = vendas[5] + valor;
                    break;
                }

                case 6: {
                    vendas[6] = vendas[6] + 1;
                    totalVendido[6] = vendas[6] + valor;
                    break;
                }

                case 7: {
                    vendas[7] = vendas[7] + 1;
                    totalVendido[7] = vendas[7] + valor;
                    break;
                }

                case 8: {
                    vendas[8] = vendas[8] + 1;
                    totalVendido[8] = vendas[8] + valor;
                    break;
                }

                case 9: {
                    vendas[9] = vendas[9] + 1;
                    totalVendido[9] = vendas[9] + valor;
                    break;
                }

                case 10: {
                    vendas[10] = vendas[10] + 1;
                    totalVendido[10] = vendas[10] + valor;
                    break;
                }
                case 11: {
                    vendas[11] = vendas[11] + 1;
                    totalVendido[11] = vendas[11] + valor;
                    break;
                }
                case 12: {
                    vendas[12] = vendas[12] + 1;
                    totalVendido[1] = vendas[1] + valor;
                    break;}
                  
                    default : {
                 System.out.println("vendedor invalido, valor nao computado!!!");
                }
                

            }
            
            for (int i = 0; i < vendas.length; i++) {
                valorTotal = valorTotal + totalVendido[i];
                totalVendas = totalVendas + vendas[i];
            }
         System.out.print("quem foi o vendedor que fez a venda(digite -1 para sair da venda): ");
        vendedor = input.nextInt();
            
        }
System.out.print("o total de vendas foi : "+totalVendas+
                    "\n vendedor 1: "+vendas[0]+
                    "\n vendedor 2: "+vendas[1]+
                    "\n vendedor 3: "+vendas[2]+
                    "\n vendedor 4: "+vendas[3]+
                    "\n vendedor 5: "+vendas[4]+
                    "\n vendedor 6: "+vendas[5]+
                    "\n vendedor 7: "+vendas[6]+
                    "\n vendedor 8: "+vendas[7]+
                    "\n vendedor 9: "+vendas[8]+
                    "\n vendedor 10: "+vendas[9]+
                    "\n vendedor 11: "+vendas[10]+
                    "\n vendedor 12: "+vendas[11]+ "\n \n");
            
            System.out.print("o total vendido foi : "+valorTotal+
                    "\n vendedor 1: "+totalVendido[0]+
                    "\n vendedor 2: "+totalVendido[1]+
                    "\n vendedor 3: "+totalVendido[2]+
                    "\n vendedor 4: "+totalVendido[3]+
                    "\n vendedor 5: "+totalVendido[4]+
                    "\n vendedor 6: "+totalVendido[5]+
                    "\n vendedor 7: "+totalVendido[6]+
                    "\n vendedor 8: "+totalVendido[7]+
                    "\n vendedor 9: "+totalVendido[8]+
                    "\n vendedor 10: "+totalVendido[9]+
                    "\n vendedor 11: "+totalVendido[10]+
                    "\n vendedor 12: "+totalVendido[11]);
    }

}
