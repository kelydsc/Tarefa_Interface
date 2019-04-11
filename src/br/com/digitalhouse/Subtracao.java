package br.com.digitalhouse;

public class Subtracao implements OperacaoMatematica{

    private int resultadoSubtracao;

    public int getResultadoSubtracao() {
        return resultadoSubtracao;
    }

    public void setResultadoSubtracao(int resultadoSubtracao) {
        this.resultadoSubtracao = resultadoSubtracao;
    }

    @Override
    public int calcula(int a, int b) {

        return resultadoSubtracao = a - b;
    }
}
