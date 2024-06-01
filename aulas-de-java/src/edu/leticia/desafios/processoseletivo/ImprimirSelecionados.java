package edu.leticia.desafios.processoseletivo;

public class ImprimirSelecionados {
    public static void main(String[] args) {
        imprimirSelecionados();
    }

    static void imprimirSelecionados() {
        String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento.");

        for (int indice = 0; indice < candidatos.length; indice++) {

            System.out.println("O candidato de n " + (indice + 1) + " é " + candidatos[indice]);

        }

    }

}
