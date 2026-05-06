
package listadesafio;

import java.util.Scanner;


public class ListaDesafio {

  
    public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
long inserido, segundos, minutos, horas, dias, semanas, meses, anos;


  System.out.print("insira uma duracao em segundos: ");
         inserido= Long.parseLong(input.nextLine());
         
anos = inserido/31536000;
meses = inserido%31536000/2592000;
semanas = inserido%31536000%2592000/604800;
dias = inserido%31536000%2592000%604800/86400;
horas = inserido%3153600%2592000%604800%86400/3600;
minutos = inserido%31536000%2592000%604800%86400%3600/60;
segundos = inserido%31536000%2592000%604800%86400%3600%60;




  System.out.println("sua durcao expirara em: ");
  System.out.println(anos +" anos, ");
  System.out.println(meses+ " meses, ");
  System.out.println(semanas + " semanas, ");
  System.out.println(dias+ " dias, ");
  System.out.println(horas+ " horas, ");
  System.out.println(minutos+ " minutos, ");
  System.out.println(segundos+ " segundos, ");



  


        
        
      
    }
    
}
