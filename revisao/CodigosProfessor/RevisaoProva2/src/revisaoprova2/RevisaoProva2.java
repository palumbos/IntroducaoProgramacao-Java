package revisaoprova2;

import java.util.Scanner;

public class RevisaoProva2 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int contM = 0, contF = 0, contI = 0, contN = 0, contS = 0,
            somaS = 0, somaN = 0, cont35S=0, maisJovem = 1000;        
        char genero = leiaGenero();
        while(genero!='X'){
            System.out.print("Digite a idade: ");
            int idade = Integer.parseInt(input.nextLine());        
            System.out.print("Possui experiencia (S/N)? ");
            char experiencia = input.nextLine().charAt(0);       
            switch (genero){
                case 'M': contM  = contM + 1;
                          break;
                case 'F': contF  = contF + 1;
                          break;
                case 'I': contI  = contI + 1;
                          break;
            }
            switch (experiencia){
                case 'S': contS = contS + 1;
                          somaS = somaS + idade;
                          break;
                case 'N': contN  = contN + 1;
                          somaN = somaN + idade;
                          break;
            }
            cont35S = conteJovensExperiencia(idade,experiencia,cont35S);
            if (idade < maisJovem){
                maisJovem = idade;
            }
            genero = leiaGenero();   
        }
        float mediaS = (float) somaS / contS;
        float mediaN = (float) somaN / contN;
        float perc35S = (float) cont35S * 100 / (contM + contF + contI);
        mostreResultados(contM,contF,contI,contS,contN,mediaS,mediaN,
                         perc35S, maisJovem);
    }

    public static void mostreResultados(int contM,int contF,int contI,
                    int contS,int contN, float mediaS,float mediaN,
                    float perc35S, int maisJovem){
        System.out.println("Quantidade de homens: "+contM);
        System.out.println("Quantidade de mulheres: "+contF);
        System.out.println("Quantidade de indefinidos: "+contI);
        System.out.println("Quantidade com experiencia: "+contS);
        System.out.println("Quantidade sem experiencia: "+contN);
        System.out.println("Idade media com experiencia: "+mediaS);
        System.out.println("Idade media sem experiencia: "+mediaN);
        System.out.println("Percentual < 35 e experiencia: "+perc35S);
        System.out.println("Idade do mais jovem: "+maisJovem);
    }
    
    public static int conteJovensExperiencia(int idade, 
                                       char experiencia, int cont){
        if (idade < 35 && experiencia=='S'){
            cont++;
        }
        return cont;
    }
    
    
    public static char leiaGenero(){
        char genero;
        do {
            System.out.print("Digite o genero: ");
            genero = input.nextLine().charAt(0);
        }while(genero!='X'&&genero!='M'&&genero!='F'&&genero!='I');   
        return genero;
    }
    
    
}
