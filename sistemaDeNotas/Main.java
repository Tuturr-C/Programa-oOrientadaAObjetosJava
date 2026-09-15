package sistemaDeNotas;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Valor da Primeira nota:");
        aluno.setPrimeiraNota(entrada.nextDouble());

        
        System.out.println("Valor da Segunda Noya:");
        aluno.setSegundaNota(entrada.nextDouble());


        System.out.println ("Media das notas = "+ aluno.calcularMedia());

        
        
    }
    

}
