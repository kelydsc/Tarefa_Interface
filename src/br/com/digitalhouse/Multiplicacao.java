package br.com.digitalhouse;

public class Multiplicacao implements OperacaoMatematica {

    private int resultadoMultiplicacao;

    public int getResultadoMultiplicacao() {
        return resultadoMultiplicacao;
    }

    public void setResultadoMultiplicacao(int resultadoMultiplicacao) {
        this.resultadoMultiplicacao = resultadoMultiplicacao;
    }

    @Override
    public int calcula(int a, int b) {

        return resultadoMultiplicacao = a * b;
    }
}
