package atividade33;

import java.util.Scanner;



public class Atividade33 {
       

    public static void main(String[] args) {
     System.setProperty("file.encoding", "UTF-8");
        
     Scanner input = new Scanner(System.in);
     String nome;
     int idade;
     float peso;
     char genero;
     boolean matriculado;
     
        System.out.print("Digite seu nome: ");
        nome = input.nextLine();
        
        System.out.print("Digite sua idade: ");
        idade = Integer.parseInt(input.nextLine());
        
        
        System.out.print("Digite seu peso: ");
        peso = Float.parseFloat(input.nextLine());
        
        System.out.print("Digite seu genero: ");
        genero = input.nextLine().charAt(0);
        
        System.out.print("Digite se esta matriculado (coloque true ou false): ");
        matriculado = Boolean.parseBoolean(input.nextLine());
        
        System.out.println("seu nome  é " + nome + ", você tem  " + idade + " anos, pesa "+ peso + "kilos, seu genero e " + genero + " e sua situação de matrícula e:" + matriculado );

    }

}
