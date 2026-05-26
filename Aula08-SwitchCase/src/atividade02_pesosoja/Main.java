
package atividade02_pesosoja;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
   float pesoCarga, valorTon, valorCarga,imposto = 0,valorTotal;
   char regiao;
   boolean valido = false;
   
        System.out.print("qual é o peso da carga: ");
        pesoCarga = Float.parseFloat(input.nextLine());
        
        System.out.print("quanto custa uma tonelada: ");
        valorTon = Float.parseFloat(input.nextLine());
        
      System.out.println("""
    em qual regiao do brasil voce esta:
                         a - Sul
                         b - Sudeste
                         c - centro Oeste
                         d - Nordeste
                         e - Norte
                         p - Painel 
    """);
        regiao = input.nextLine().charAt(0);
        
        valorCarga = (float) pesoCarga * valorTon;
        do{
        switch(regiao){
            case'a': imposto = (float) 0.1 * valorCarga;valido=true;     
                  break;
            case'b': imposto = (float) 0.12 * valorCarga;valido=true;  
                  break;
            case'c': imposto = (float) 0.09 * valorCarga;valido=true; 
                  break;
            case'd': imposto = (float) 0.095 * valorCarga;valido=true;
                  break;
            case'e': imposto = (float) 0.08 * valorCarga; valido=true;  
                  break;
            case'p': imposto = valorCarga * 0; valido=true; 
                  break;
            default: System.out.print("regiao invalida! tente novamente: ");
            regiao = input.nextLine().charAt(0);
            
        }
            
        }
                while (!valido);

        valorTotal = (float) valorCarga + imposto;
        
        System.out.println(valorCarga +"\n"+imposto+"\n"+valorTotal);

    }
    
}
