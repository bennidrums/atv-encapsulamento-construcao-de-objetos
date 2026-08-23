import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int quantidadeAlunos;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o total de alunos a serem cadastrados: ");
        quantidadeAlunos = sc.nextInt();

        System.out.println("Quantas provas os alunos fizeram?");
        int quantidadeProvas = sc.nextInt();
        sc.nextLine();

        Aluno[] alunos = new Aluno[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.println("Digite o nome do aluno: ");
            String nome = sc.nextLine();
            alunos[i] = new Aluno(nome, quantidadeProvas);

            for (int j = 0; j < quantidadeProvas; j++) {
                System.out.println("Digite a nota " + (j + 1) + ": ");
                double nota = sc.nextDouble();
                sc.nextLine();

                while (nota < 0 || nota > 10) {
                    System.out.println("Nota inválida! Digite uma nota entre 0 e 10: ");
                    nota = sc.nextDouble();
                }
                alunos[i].adicionarNota(j, nota);
            }
        }
        for (int i = 0; i < quantidadeAlunos; i++) {
            double media = alunos[i].calcularMedia();

            System.out.println("Aluno: " + alunos[i].getNomeAluno());
            System.out.println("Média: " + media);
        }
    }
}