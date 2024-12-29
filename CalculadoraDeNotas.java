import java.util.Scanner;

public class CalculadoraDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número de notas: ");
        int numeroDeNotas = scanner.nextInt();
        double[] notas = new double[numeroDeNotas];

        for (int i = 0; i < numeroDeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        Aluno aluno = new Aluno(nome, notas);

        System.out.print("Digite a média mínima para aprovação: ");
        double mediaMinima = scanner.nextDouble();

        System.out.println("Aluno: " + aluno.getNome());
        System.out.println("Média: " + aluno.calcularMedia());
        System.out.println("Resultado: " + aluno.verificarAprovacao(mediaMinima));
    }
}
