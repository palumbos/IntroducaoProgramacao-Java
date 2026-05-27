
package atividade01_acrescimo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        double precoAntigo, precoNovo, acrescimo;
// === input ===

          System.out.print("coloque o preco antigo:");
                  precoAntigo = Double.parseDouble(input.nextLine());
          
          System.out.print("coloque o novo preco:");
                  precoNovo = Double.parseDouble(input.nextLine());

// === funçao ===                  
        
        acrescimo = cauculeAcrecimo(precoAntigo, precoNovo);
        
// === output ===
if(acrescimo >= 0) System.out.println(acrescimo);

else System.out.println("acrescimo nao pode ser menor que 0");
    }  
    
public static double cauculeAcrecimo( double antigo, double novo){
    double acrescimo;
    if(novo>antigo) acrescimo = novo - antigo;
    
   else acrescimo = -1;
    
         return acrescimo;
                  };   
    
}
