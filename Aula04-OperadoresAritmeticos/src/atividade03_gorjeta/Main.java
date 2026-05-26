
package atividade03_gorjeta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       float despesa, gorjeta, total;
       
        System.out.println("quanto custou seu almoco?");
        despesa = Float.parseFloat(input.nextLine());
        
        gorjeta =  despesa * 0.1f;
/*lembre-se sempre que se nao tiver o f no final o programa considera os dados como double, 
 alem de gastar mais armazenamento o programa nao consegue fazer a operação*/

total = gorjeta + despesa;
        
        System.out.println("parabens suas despesas foram " + despesa + 
                " R$ porem a gorjeta do garçom foi "+ gorjeta + " R$ e no total voce precisara gastar " + total + " R$");
        
        
        
     
    }
    
}
