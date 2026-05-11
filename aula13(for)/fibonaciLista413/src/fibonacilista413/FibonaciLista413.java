
package fibonacilista413;

import java.util.Scanner;

public class FibonaciLista413 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n, n1=1, n2=1 , sequencia;
        
        System.out.print("digite a posição do numero na sequencia de fibonaci: ");  
            n = Integer.parseInt(input.nextLine());
            
            if(n==0 || n==1){
                System.out.println(0);
            }
            
            else if(n==2){ 
                System.out.println(0);
                System.out.println(1);
            }
            
            else if(n==3){
                 System.out.println(0);
                 System.out.println(1);
                 System.out.println(1);
            }
            
            else{
                 System.out.println(0);
                 System.out.println(1);
                 System.out.println(1);   
                 
                 for(int i = 3; i<n; i++){
                            sequencia = n1 +n2; 
                            n1 = n2;
                            n2 = sequencia;
            
                            System.out.println(sequencia);
                  }
           
            }
            
    }
    
}
