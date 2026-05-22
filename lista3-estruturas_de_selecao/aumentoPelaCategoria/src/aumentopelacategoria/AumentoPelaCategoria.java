
package aumentopelacategoria;

import java.util.Scanner;

public class AumentoPelaCategoria {

  
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nome;
        int salarioAtual, salarioNovo = 0;
        char categoria;
        boolean valido = false;
        
        System.out.print("porfavor, digite seu nome: ");
           nome = input.nextLine();
           
         System.out.print("digite seu salario atual: "); 
           salarioAtual = Integer.parseInt(input.nextLine());
           
         System.out.print("digite a sua categoria(de 'a' a 'h' em minusculo)");
           categoria = input.nextLine().charAt(0);
           
      do{
         switch(categoria) {
                  case'a': salarioNovo = salarioAtual + (int) (salarioAtual * 0.1f); 
                  valido = true; break;
                  
                  case'b': salarioNovo = salarioAtual + (int) (salarioAtual * 0.15f);
                  valido = true; break;
                           
                  case'c': salarioNovo = salarioAtual + (int) (salarioAtual * 0.25f);
                  valido = true; break;
                           
                  case'd': salarioNovo = salarioAtual + (int) (salarioAtual * 0.15f); 
                  valido = true; break;
                           
                  case'e': salarioNovo = salarioAtual + (int) (salarioAtual * 0.15f); 
                  valido = true; break;
                          
                  case'f': salarioNovo = salarioAtual + (int) (salarioAtual * 0.25f);
                  valido = true; break;
                         
                  case'g': salarioNovo = salarioAtual + (int) (salarioAtual * 0.3f);
                  valido = true; break;
                           
                  case'h': salarioNovo = salarioAtual + (int) (salarioAtual * 0.1f); 
                  valido = true; break;
                           
                  default: System.out.print("categoria invalida! tente novamente: ");
                      categoria = input.nextLine().charAt(0);
                      }}
         while(!valido);
      
      
        System.out.println("Caro(a) "+nome+" seu novo salario é "+salarioNovo+
                " R$ por voce ser da categoria "+categoria);
                       
    } 
        
    }
    

