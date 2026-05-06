
package revisao2prova1;

import java.util.Scanner;

public class Revisao2Prova1 {

    public static void main(String[] args) {
                        Scanner input = new Scanner(System.in);
                        int horas;
                        char turno, categoria;
                        float valorHora, salario;
                        
                        System.out.print("digite a quantidade de horas");
                        horas = Integer.parseInt(input.nextLine());
                        
                        System.out.print("digite a quantidade de horas");
                        valorHora = Float.parseFloat(input.nextLine());
                        
                        System.out.print("digite a quantidade de horas");
                        turno = input.nextLine().charAt(0);
                        
                        System.out.print("digite a quantidade de horas");
                        categoria = input.nextLine().charAt(horas);

    }
    
}
