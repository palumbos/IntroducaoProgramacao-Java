package revisaoq2;

import java.util.Scanner;

public class RevisaoQ2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int horas;
        float valorHora, salario;
        char turno, categoria;
        System.out.print("Digite a quantidade de horas: ");
        horas = Integer.parseInt(input.nextLine());
        System.out.print("Digite o valor da hora: ");
        valorHora = Float.parseFloat(input.nextLine());
        System.out.print("Digite o turno (M, V ou N): ");
        turno = input.nextLine().charAt(0);
        System.out.print("Digite a categoria (G ou O): ");
        categoria = input.nextLine().charAt(0);
        salario = horas * valorHora;
        if (categoria == 'G'){
            salario = salario + 1000;
        }
        if (turno == 'N'){
            if (horas > 180){
                salario = salario + 6 * valorHora;
            }
            else if (horas >= 150){
                 salario = salario + 4 * valorHora;
            }
            else if (horas >= 120){
                 salario = salario + 2 * valorHora;
            }
        }
        if (categoria=='O' && turno == 'M' && horas > 150){
            salario = salario + valorHora;
        }
        System.out.println("Salario do funcionario: "+salario);
    }
    
}
