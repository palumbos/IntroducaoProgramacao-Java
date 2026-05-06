
package imaginarioaula114;

import java.util.Scanner;

public class ImaginarioAula114 {

    public static void main(String[] args) {
        double n1, raiz;
n1 = leiaNumero();
raiz = cauculeRaiz(n1);
printarRaiz(raiz);
        
    }
    
public static double leiaNumero(){
                           Scanner input = new Scanner(System.in);

    System.out.println("digite um numero: ");
      return   Double.parseDouble(input.nextLine());
}    

public static double cauculeRaiz(double numero){
double raiz;    
if(numero >= 0)  raiz  =  Math.sqrt(numero);

else{ 
numero = numero * -1;
raiz = Math.sqrt(numero) * -1;} 

return raiz;
}

public static void printarRaiz(double raiz){
    if(raiz >= 0) System.out.print(raiz);
    
    else{
        raiz = raiz * -1;
        System.out.println(raiz + " i");
    }
}
    
}
