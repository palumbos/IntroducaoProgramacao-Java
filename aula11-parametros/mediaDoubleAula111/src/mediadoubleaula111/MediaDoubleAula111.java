
package mediadoubleaula111;

import java.util.Scanner;
public class MediaDoubleAula111 {

    public static void main(String[] args) {
         double n1, n2, media, maior;
         
          n1 = leiaValor();
          n2 = Math.random();
          media = mediaDosValores(n1, n2);
          maior = Math.max(n1, n2);
          printarValores(n1, n2, media, maior);
    }

 public static double leiaValor(){
               Scanner input = new Scanner(System.in);
               
               System.out.print("digite um numero de 1 a 0:");
                 return Double.parseDouble(input.nextLine());
 }    
 
 public static double mediaDosValores(double numero1, double numero2){
   return (numero1 + numero2)/2;
 }
 
 public static void printarValores(double foda, double fodissimo, double pica, double kkk){
     System.out.println(foda);
     System.out.println(fodissimo);
     System.out.println(pica);
     System.out.println(kkk);
 }

  
}
