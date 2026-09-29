package sistemaDeNotas;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static int lerInteiro(Scanner entrada, String mensagem) {
        while (true) {
            System.out.print(mensagem);

            if (entrada.hasNextInt()) {
                int valor = entrada.nextInt();
                entrada.nextLine();
                return valor;
            } else {
                entrada.next();
                System.out.println("Digite um número inteiro válido.");
            }
        }
    }

    private static double lerNota(Scanner entrada, String mensagem) {
        while (true) {
            System.out.print(mensagem);

            if (entrada.hasNextDouble()) {
                double valor = entrada.nextDouble();
                entrada.nextLine();
                return valor;
            } else {
                entrada.next();
                System.out.println("Digite uma nota válida.");
            }
        }
    }

    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Nome ou Numero da matéria: ");
        String nomeDaMateria = entrada.nextLine();

        int quantidadeDeAtividades = lerInteiro(entrada, "Quantidade de atividades: ");

        int quantidadeDeAlunos = lerInteiro(entrada, "Quantidade de alunos: ");

        ArrayList<Aluno> alunos = new ArrayList<>();

        for (int i = 0; i < quantidadeDeAlunos; i++) {
            Aluno aluno = new Aluno();

            System.out.println("\nAluno " + (i + 1));
            System.out.print("Nome: ");
            aluno.setNome(entrada.nextLine());

            for (int atividade = 1; atividade <= quantidadeDeAtividades; atividade++) {
                aluno.adicionarNota(lerNota(entrada, "Nota da atividade " + atividade + ": "));
            }

            alunos.add(aluno);
        }

        int opcao;
        do {
            System.out.println("1 - Modificar nota");
            System.out.println("2 - Adicionar aluno");
            System.out.println("0 - Finalizar cadastro");
            opcao = lerInteiro(entrada, "Escolha uma opção: ");

            if (opcao == 1) {
                if (alunos.isEmpty()) {
                    System.out.println("Não há alunos cadastrados.");
                    continue;
                }

                for (int i = 0; i < alunos.size(); i++) {
                    System.out.println((i + 1) + " - " + alunos.get(i).getNome());
                }

                int numeroDoAluno = lerInteiro(entrada, "Número do aluno: ");

                if (numeroDoAluno < 1 || numeroDoAluno > alunos.size()) {
                    System.out.println("Aluno inválido.");
                    continue;
                }

                Aluno aluno = alunos.get(numeroDoAluno - 1);
                int numeroDaNota = lerInteiro(entrada, "Qual atividade deseja modificar? (1 a "
                    + quantidadeDeAtividades + "): ");

                if (numeroDaNota < 1 || numeroDaNota > quantidadeDeAtividades) {
                    System.out.println("Atividade inválida.");
                    continue;
                }

                double novaNota = lerNota(entrada, "Digite o novo valor: ");
                aluno.modificarNota(numeroDaNota, novaNota);

                System.out.println("Nota modificada com sucesso.");
            } else if (opcao == 2) {
                Aluno novoAluno = new Aluno();

                System.out.print("Nome: ");
                novoAluno.setNome(entrada.nextLine());

                for (int atividade = 1; atividade <= quantidadeDeAtividades; atividade++) {
                    novoAluno.adicionarNota(lerNota(entrada, "Nota da atividade " + atividade + ": "));
                }

                alunos.add(novoAluno);
                System.out.println("Aluno adicionado com sucesso.");
            }
        } while (opcao != 0);

        System.out.println("\nRelatório de Notas:");
        for (Aluno aluno : alunos) {
            System.out.println(aluno.getNome() + " - Média: " + aluno.calcularMedia());
            System.out.println(" - Maior Nota: " + aluno.maiorNota());
            System.out.println(" - Menor Nota: " + aluno.menorNota());
        }

        if (!alunos.isEmpty()) {
            Aluno alunoComMaiorNota = alunos.get(0);

            for (Aluno aluno : alunos) {
                if (aluno.maiorNota() > alunoComMaiorNota.maiorNota()) {
                    alunoComMaiorNota = aluno;
                }
            }

            System.out.println("\nMaior nota entre todos os alunos: "
                    + alunoComMaiorNota.maiorNota()
                    + " - Aluno: " + alunoComMaiorNota.getNome());
        }

        int[] quantidadePorFaixa = new int[10];

        for (Aluno aluno : alunos) {
            for (double nota : aluno.getNotas()) {
                int faixa = (int) nota;

                if (faixa == 10) {
                    faixa = 9;
                }

                if (faixa >= 0 && faixa < quantidadePorFaixa.length) {
                    quantidadePorFaixa[faixa]++;
                }
            }
        }

        System.out.println("\nHistograma de Notas - " + nomeDaMateria + ":");
        for (int faixa = 0; faixa < quantidadePorFaixa.length; faixa++) {
            System.out.print(faixa + "/" + (faixa + 1) + ": ");

            for (int quantidade = 0; quantidade < quantidadePorFaixa[faixa]; quantidade++) {
                
            }

            System.out.println(" (" + quantidadePorFaixa[faixa] + ")");
        }

        entrada.close();
    }

}
