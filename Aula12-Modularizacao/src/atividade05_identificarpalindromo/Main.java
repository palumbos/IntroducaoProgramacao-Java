
package atividade05_identificarpalindromo;

import java.util.Scanner;

public class Main {
      public static Scanner input = new Scanner(System.in);
  
    public static void main(String[] args) {
        int numero;
        boolean palindromo;        
        System.out.print("digite um palindromo:");
           numero = Integer.parseInt(input.nextLine());
        
       palindromo = analisarPalindromo(numero);
        
       printarPalindromo(numero, palindromo);
    }
    
  public static boolean analisarPalindromo(int n){
       
    
    
    if(n < 10) return true;
    //todo numero de 1 casa é palindromo
    
    else if(n < 100){
        return n % 10 == n/10;
    }
    // numero de 2 casas precisa ter dezena e unidade igual
    
    else if(n < 1000){
        return n % 10 == n/100;
    }
    //numeros de 3 casa precisam ter centena e unidade =
        
    else if(n < 10000){
        return (n % 10 == n/1000) && ((n/10) % 10 == (n/100)%10);
    }
    //n de 4 precisa ter milhar = unidade e cent = deze
    
    
    else if(n < 100000){
        return (n % 10 == n/10000) && ((n/10) % 10 == (n/1000)%10);
    }
    //n de 5 precisa ter dezena de milhar = unidade e milhar = deze
    
    
    else if(n < 1000000){
        return (n % 10 == n/100000) && ((n/10) % 10 == ((n/10000)%10)) && (n/100) % 10 == (n/1000)%10;
    }
    //n de 6 precisa ter 10^5 = 10^0 e 10^4 = 10^1 e 10^3 = 10^2
    
    
    else if(n < 10000000){
        return (n % 10 == n/1000000) && ((n/10) % 10 == (n/100000)%10) && (n/100) % 10 == (n/10000)%10;
    }
    //n de 7 precisa  10^6 = 10^0 e 10^5 = 10^1 e 10^4 = 10^2
    
    
    else if(n < 100000000){
        return (n % 10 == n/10000000) && ((n/10) % 10 == (n/1000000)%10) && ((n/100) % 10 == (n/100000)%10) && ((n/1000) % 10 == (n/10000)%10);
    }
    //n de 8, 10^7 = 10^0 e 10^6 = 10^1 e 10^5 = 10^2 e 10^4 = 10^3
    
    
    else if(n < 1000000000){
        return (n % 10 == n/100000000) && ((n/10) % 10 == (n/10000000)%10) && ((n/100) % 10 == (n/1000000)%10) && ((n/1000) % 10 == (n/100000)%10);
    }
    //m de 9, 10^8 = 10^0 e 10^7 = 10^1 e 10^6 = 10^2 e 10^5 = 10^3     

    else return false;
}   

public static void printarPalindromo(int numero, boolean palindromo ){
    if(palindromo) System.out.println("O numero: "+numero+" é um palindromo");
    else System.out.println("o numero: "+numero+" não é um palindromo");
 input.close();
}  
    
    
}
