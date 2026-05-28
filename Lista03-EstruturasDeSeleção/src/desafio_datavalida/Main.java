
package desafio_datavalida;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int ano, mes, dia, hora, minuto, segundo;
        boolean valido;
        //esse  "do" é caso a data seja invalida volta pra ca
       do{
        System.out.print("digite um ano(0000 a 9999): ");
          ano = Integer.parseInt(input.nextLine());
          
         System.out.print("digite um mes(00 a 12): ");
          mes = Integer.parseInt(input.nextLine());
          
         System.out.print("digite um dia(00 a 31): ");
          dia = Integer.parseInt(input.nextLine());
          
         System.out.print("digite uma hora (00 a 24): ");
          hora  = Integer.parseInt(input.nextLine());
          
         System.out.print("digite um minuto (00 a 60): ");
          minuto  = Integer.parseInt(input.nextLine());
          
         System.out.print("digite um segundo (00 a 60): ");
          segundo = Integer.parseInt(input.nextLine()); 
        // definição de variaveis
        
                  if(segundo > 60 || segundo < 0) valido = false;
            
                  else if(minuto > 60 || minuto < 0) valido = false;
            
                  else if(hora > 25 ||  hora < 0) valido = false;
                  
                  else if(dia > 31 || dia < 0) valido = false;

                  else if(mes > 12 ||  mes < 0) valido = false;

                  else if(ano > 9999 || ano < 0) valido = false;
                  // primeiro os cauculos basicos que todas as datas precisam satisfazer
                  else{
                      if((ano % 4==0 ) && ((ano % 100 != 0) || (ano % 400 == 0))){
                          switch(mes){
                              case 1, 3, 5, 7, 8 ,10 ,12: valido = dia <= 31; break;
                                  
                              case 4, 6, 9, 11: valido = dia<=30; break;
                                  
                              case 2: valido = dia<=29; break;
                                  
                              default: valido = false;
                           // esse é o caso ano bissexto                   
                          }
                      }
                      else{
                     switch(mes){
                              case 1, 3, 5, 7, 8 ,10 ,12: valido = dia <= 31; break;
                                  
                              case 4, 6, 9, 11: valido = dia<=30; break;
                                  
                              case 2: valido = dia<=28; break;
                                  
                              default: valido = false; 
                           // aqui é os demais anos
                     }}
        
        
        }
           if(!valido) System.out.println("data invalida tente novamente! ");
           // essa mensagem sempre ativara quando a data for invalida, e o codigo repetira desde o inicio
       }
        
                   while (!valido); //aqui quebra o loop, quando a data for valida
                   
                System.out.println("A data "+segundo+" segundos");   
                System.out.println(minuto+"minutos"); 
                System.out.println(hora+" horas"); 
                System.out.println("do dia "+ dia); 
                System.out.println("do mes "+ mes); 
                System.out.println("no ano "+ ano +" é valido!"); 
                //o output nao tem muito oque explicar
    }
    
}
