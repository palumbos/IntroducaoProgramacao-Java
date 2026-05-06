package atividadeemaula53;

import java.util.Scanner;

public class AtividadeEmAula53 {

    public static void main(String[] args) {
                                 Scanner input = new Scanner(System.in);
                                 
boolean s1,s2,s3,s4,s5,s6, alarme;

 System.out.print("o sensor 1 foi acionado (true ou false): ");
         s1 = Boolean.parseBoolean(input.nextLine());
         
System.out.print("o sensor 2 foi acionado (true ou false): ");
         s2 = Boolean.parseBoolean(input.nextLine());
         
System.out.print("o sensor 3 foi acionado (true ou false): ");
         s3 = Boolean.parseBoolean(input.nextLine());     
         
System.out.print("o sensor 4 foi acionado (true ou false): ");
         s4 = Boolean.parseBoolean(input.nextLine());        
         
System.out.print("o sensor 5 foi acionado (true ou false): ");
         s5 = Boolean.parseBoolean(input.nextLine());     
         
System.out.print("o sensor 6 foi acionado (true ou false): ");
         s6 = Boolean.parseBoolean(input.nextLine());
         
alarme = (s1 || s2 || s3 || s4 || s5 || s6) && !(s1 && s5 && s6 && !s2 && !s3 && !s4);


         System.out.println(alarme);




        
        
    }
    
}
