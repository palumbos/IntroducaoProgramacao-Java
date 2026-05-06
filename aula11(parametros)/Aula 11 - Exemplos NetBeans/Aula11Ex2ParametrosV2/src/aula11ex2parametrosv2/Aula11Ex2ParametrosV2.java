package aula11ex2parametrosv2;

public class Aula11Ex2ParametrosV2 {

    static int metodo1(int x){
        System.out.println(x);
        x = 10;
        System.out.println(x);
        return x;
    }
    
    public static void main(String[] args) {
        int x = 5;
        
        System.out.println(x);
        x = metodo1(x);
        System.out.println(x);   
    }
    
}
