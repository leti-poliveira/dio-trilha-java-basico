package edu.leticia.desafios;

import java.util.Scanner;

public class DesafioSalario {

    // cálculo salarial com java.

    public static void main(String[] args) {
        // dentro do método main ocore o processamento do agoritmo = entrada -
        // processaento - saida
        System.out.println("Insira o valor do salário:");
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();

        System.out.println("Insira o valor dos benefícios:");
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;

        } else if (valorSalario >= 1100 && valorSalario <= 2500) {
            valorImposto = 0.10F * valorSalario;

        } else {
            valorImposto = 0.15F * valorSalario;

        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("O valor final, após cálculos de imposto e benefícios, é: R$ %.2f", saida));

    }

}

