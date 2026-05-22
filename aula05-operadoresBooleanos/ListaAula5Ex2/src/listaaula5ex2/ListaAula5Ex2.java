package listaaula5ex2;

import java.util.Scanner;

public class ListaAula5Ex2 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
   
   float preco  , conta, quilo, contaAtrasada;
   
   System.out.print("coloque  o preco de 1 Quilowatt: ");
         preco = Float.parseFloat(input.nextLine());
         
   System.out.print("coloque quantos QuiloWatts voce gastou esse mes: ");
         quilo = Float.parseFloat(input.nextLine());
         
conta = preco * quilo;
contaAtrasada = conta + conta/10f;

        System.out.print("se voce pagar no prazo, pagara: "+conta+"\n se atrasar, pagara: "+contaAtrasada+"\n");

         
         
        
        
        
        
    }
  
    
}
