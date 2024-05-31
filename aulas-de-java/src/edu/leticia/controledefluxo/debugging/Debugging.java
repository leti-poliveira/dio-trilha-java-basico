package debugging;

import java.util.Scanner;

public class Debugging {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in); // entrada do fluxo
    String[] alunos = { "Camila", "Lucas", "Bruna", "pedro" }; // array

    double media = calculaMediaDaTurma(alunos, scan); // recebe fluxo de "alunos" e o scan
    // dentro do método main, tbm estou chamado esse outro
    // método acima

    System.out.printf("Média da turma %f", media);

  }

  public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {

    double soma = 0; // variável temporária SOMA

    for (String aluno : alunos) { // pra navegar dentro do array
      System.out.printf("Nota do aluno %s: ", aluno);

      // EXCEÇÃO:

      try {
        double nota = scanner.nextDouble();
        soma += nota;
      } catch (Exception e) {
        // TODO Auto-generated catch block
        System.out.println("Valor Inválido. Digite um número");

        scanner.next();

        // Decrementa o índice do loop para que o mesmo aluno seja solicitado novamente
        // FIM DA EXCEÇÃO.
      }
      // concatenação

    }

    return soma / alunos.length;

  }
}