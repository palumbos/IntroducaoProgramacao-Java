
package atividade01_aprovacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                 Scanner input = new Scanner(System.in);
         float nota1, nota2, nota3, media;
         int faltas, frequencia;
         boolean aprovado, atestado;
         
         System.out.print("coloque sua nota 1: ");
         nota1 = Float.parseFloat(input.nextLine());
         
         System.out.print("coloque  sua nota 2: ");
         nota2 = Float.parseFloat(input.nextLine());
         
         System.out.print("coloque  sua nota 3: ");
         nota3 = Float.parseFloat(input.nextLine());
         
         System.out.print("coloque sua quantidade de faltas: ");
         faltas = Integer.parseInt(input.nextLine());
         
         System.out.print("voce possue um atestado para suas faltas(true ou false): ");
         atestado = Boolean.parseBoolean(input.nextLine());
         
         
         media = (nota1 + nota2 + nota3)/3f;
         frequencia = 100 - faltas;
         aprovado = media>=6 && (faltas<=25  ||  atestado);
    
         System.out.println("sua nota final do curso foi: "+media +"\n e voce teve uma frequencia de "+
                 frequencia+"%\n e sua situação de aprovação é:" +aprovado);
    
    }
    
}
