package parcelas_lista2ex17;

import java.util.Scanner;

public class Parcelas_lista2Ex17 {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int parcelasTotais, parcelasPagas;
    float valorParcelas, totalPago, saldoDevedor;
    // input do usuario
    System.out.print("Digite o total de parcelas:");
    parcelasTotais = Integer.parseInt(input.nextLine());
    
    System.out.print("Digite o total de parcelas:");
    parcelasPagas = Integer.parseInt(input.nextLine());
    
    System.out.print("Digite o total de parcelas:");
    valorParcelas = Float.parseFloat(input.nextLine());
    
    // cauculos 
    totalPago = parcelasPagas * valorParcelas;
    saldoDevedor = (parcelasTotais - parcelasPagas)  * valorParcelas;
    
    // output
    System.out.println("Valor pago: "+totalPago);
    System.out.println("saldo devedor: "+saldoDevedor);
    
    
    
    
    }
    
}
