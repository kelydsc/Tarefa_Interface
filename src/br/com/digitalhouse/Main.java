package br.com.digitalhouse;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int operadorA;
        int operadorB;
        int tipoOperacao;

        System.out.println("Digite 1 para Soma, 2 para Subtração, 3 para Divisão, 4 Multiplicação ou 5 para Sair");

        Scanner scanner = new Scanner(System.in);
        tipoOperacao = scanner.nextInt();

        if (tipoOperacao == 1){

            System.out.println("Digite um valor para o operador A: ");
            operadorA = scanner.nextInt();

            System.out.println("Digite um valor para o operador B: ");
            operadorB = scanner.nextInt();

            Soma soma = new Soma();
            soma.calcula(operadorA, operadorB);

            System.out.println("O resultado da soma é: " + soma.getResultadoSoma());

        }else if(tipoOperacao == 2){

            System.out.println("Digite um valor para o operador A: ");
            operadorA = scanner.nextInt();

            System.out.println("Digite um valor para o operador B: ");
            operadorB = scanner.nextInt();

            Subtracao subtracao = new Subtracao();
            subtracao.calcula(operadorA, operadorB);

            System.out.println("O resultado da subtração é: " + subtracao.getResultadoSubtracao());

        }else if(tipoOperacao == 3){

            System.out.println("Digite um valor para o operador A: ");
            operadorA = scanner.nextInt();

            System.out.println("Digite um valor para o operador B: ");
            operadorB = scanner.nextInt();

            Divisao divisao = new Divisao();
            divisao.calcula(operadorA,operadorB);

            System.out.println("O resultado da divisão é: " + divisao.getResultadoDivisao());
            System.out.println("o resto da divisão é: " + divisao.getRestoDivisao());

        }else if(tipoOperacao == 4){

            System.out.println("Digite um valor para o operador A: ");
            operadorA = scanner.nextInt();

            System.out.println("Digite um valor para o operador B: ");
            operadorB = scanner.nextInt();

            Multiplicacao multiplicacao = new Multiplicacao();
            multiplicacao.calcula(operadorA,operadorB);

            System.out.println("O resultado da multiplicação é: " + multiplicacao.getResultadoMultiplicacao());

        }else if (tipoOperacao == 5){

            //encerra a execução do Java
            System.exit(0);

        }else {

            System.out.println("Tipo de operação matemática invalida!");
        }
    }
}


