package atividadeemaula5;

import java.util.Scanner;


public class AtividadeEmAula52 {

  
    public static void main(String[] args) {
                         Scanner input = new Scanner(System.in);
int ano;
boolean bissexto;

 System.out.print("coloque o seu ano: ");
         ano = Integer.parseInt(input.nextLine());
         
         bissexto = (ano%4 == 0)  &&  ((ano%100 != 0)  ||  (ano%400 ==0));
         
         System.out.print(bissexto+"\n");
        
        
        
        
    }
    
}
