
package cilindroaula102;

import java.util.Scanner;

public class CilindroAula102 {

    public static void main(String[] args) {
                                Scanner input = new Scanner(System.in);
          float preco, raio, altura, area, gasto, areaBase, areaLateral;
          int latas; 
          
// === input ===          
          System.out.print("digite o raio da base do cilindro:");
                  raio = Float.parseFloat(input.nextLine());
          
          System.out.print("digite a altura desse cilindro:");
                  altura = Float.parseFloat(input.nextLine());
                  
          System.out.print("insira quanto custa cada lata de tinta:"); 
                  preco = Float.parseFloat(input.nextLine());
                  
// === Caulculo da Area ===
         
         areaBase =  (float)((float) Math.PI * Math.pow(raio, 2)); //A = (PI) * Raio^2
         areaLateral = (float) ((float) altura *( 2 * Math.PI * raio)); // A = altura * circuferencia
         area = (areaBase * 2) + areaLateral;
         
// === Quantidade de Tintas  e preço total ===

         latas = (int) Math.ceil(area/12f); //dividi a area total pela Area de cada lata, para ter o valor inteiro de latas
         gasto =(float) latas * preco;
         
// == output ===         
         
        System.out.println("A Area total que voce precisa pintar é "+area+" metros");
        System.out.println("A quantidade de latas que voce vai precisar gastar é " + latas + " latas");
        System.out.println("o dinheiro total que voce gastará é "+gasto + " R$");
        
         
    }
    
}
