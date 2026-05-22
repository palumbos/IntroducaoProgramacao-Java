
package numeromesaula122;
import java.util.Scanner;
public class NumeroMesAula122 {

public static Scanner input = new Scanner(System.in);
     
    public static void main(String[] args) {
        
        System.out.print("coloque um numero de 1 a 12;");
         int numero = Integer.parseInt(input.nextLine());
         
         String mes = definirMes(numero);
         
         System.out.println(mes);
    }
    
public static String definirMes(int mesNumero){
String  mesExtenso;

switch (mesNumero) {
    case 1: mesExtenso = "Janeiro"; break;
    case 2: mesExtenso = "Fevereiro"; break;
    case 3: mesExtenso = "Março"; break;
    case 4: mesExtenso = "Abril"; break;
    case 5: mesExtenso = "Maio"; break;
    case 6: mesExtenso = "Junho"; break;
    case 7: mesExtenso = "Julho"; break;
    case 8: mesExtenso = "Agosto"; break;
    case 9: mesExtenso = "Setembro"; break;
    case 10: mesExtenso = "Outubro"; break;
    case 11: mesExtenso = "Novembro"; break;
    case 12: mesExtenso = "Dezembro"; break;
    default: mesExtenso = "Mes invalido, tente novamente";break;
}
return mesExtenso;
};    
}
