package aula11ex2parametrosv1;

public class Aula11Ex2ParametrosV1 {

    static void metodo1(int x){
        System.out.println(x);
        x = 10;
        System.out.println(x);
    }
    
    public static void main(String[] args) {
        int x = 5;
        
        System.out.println(x);
        metodo1(x);
        System.out.println(x);
        
    }  
}
