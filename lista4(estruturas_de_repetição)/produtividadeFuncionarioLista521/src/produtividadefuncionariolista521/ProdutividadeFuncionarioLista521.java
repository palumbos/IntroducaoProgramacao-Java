
package produtividadefuncionariolista521;

import java.util.Scanner;

public class ProdutividadeFuncionarioLista521 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int matricula, nivel;
        float salario, abon, salarioTotal;
        
        System.out.print("digite sua matricula: ");
           matricula = Integer.parseInt(input.nextLine());
           
         System.out.print("digite seu salário(sem acrescimo): ");
            salario = Integer.parseInt(input.nextLine());
            
         System.out.print("""
                            digite seu nivel de produtividade:
                            1 - Excelente
                            2 - Bom
                            3 - Regular
                            digite aqui: 
                            """);   
        
        
    }
    
}
