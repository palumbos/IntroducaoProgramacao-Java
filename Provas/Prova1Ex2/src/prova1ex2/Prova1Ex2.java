
package prova1ex2;

import java.util.Scanner;

public class Prova1Ex2 {

    public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
         String nome;
         char genero;
         float peso, altura, pesoIdeal; 
         
         System.out.print("digite seu nome: ");
         nome = input.nextLine();
         
         System.out.print("digite seu genero(M ou F):");
         genero = input.nextLine().charAt(0);
         
         System.out.print("digite seu peso: ");
         peso = Float.parseFloat(input.nextLine());
         
         System.out.print("digite sua altura: ");
         altura = Float.parseFloat(input.nextLine());
         
         if(genero == 'F') {
             pesoIdeal =  62.1f * altura - 44.7f;
             
                  if(peso <pesoIdeal*0.9f) System.out.println("prezada, senhora "+nome+" seu peso ideal é "+pesoIdeal+" e seu peso atual é " +peso+ " por isso voce esta magra"); 
                  //usei apenas < para caso seja exatamente 10% a menos se encaixe no caso normal
             
                  else if(peso >pesoIdeal*1.1)System.out.println("prezada, senhora "+nome+" seu peso ideal é "+pesoIdeal+" e seu peso atual é " +peso+ " por isso voce esta em situação de obesidade");
                  //usei apenas > para caso seja exatamente 10% a mais se encaixe no caso normal
             
                  else System.out.println("prezada, senhora "+nome+" seu peso ideal é "+pesoIdeal+" e seu peso atual é " +peso+ " por isso voce esta com seu peso normal");
         
         }
         
         else if (genero == 'M'){ 
             pesoIdeal = 72.7f * altura - 58;
         
                  if(peso <pesoIdeal*0.9f) System.out.println("prezado, senhor "+nome+ " seu peso ideal é "+pesoIdeal+" e seu peso atual é " +peso+ " por isso voce esta magro");
                  //usei apenas < para caso seja exatamente 10% a menos se encaixe no caso normal

                  else if(peso >pesoIdeal*1.1)System.out.println("prezado, senhor "+nome+" seu peso ideal é "+pesoIdeal+" e seu peso atual é " +peso+ " por isso voce esta em situação de obesidade");
                   //usei apenas > para caso seja exatamente 10% a mais se encaixe no caso normal

                  else System.out.println("prezado, senhor "+nome+" seu peso ideal é "+pesoIdeal+" e seu peso atual é " +peso+ " por isso voce esta com seu peso normal");
         }
         
         else System.out.println("genero invalido, tente novamente!");
         
         
         
             
         
         

         
        
        
    }
    
}
