package br.com.digitalhouse;

public class Divisao implements OperacaoMatematica {

    private int resultadoDivisao;
    private int restoDivisao;

    public int getResultadoDivisao() {
        return resultadoDivisao;
    }

    public void setResultadoDivisao(int resultadoDivisao) {
        this.resultadoDivisao = resultadoDivisao;
    }

    public int getRestoDivisao() {
        return restoDivisao;
    }

    public void setRestoDivisao(int restoDivisao) {
        this.restoDivisao = restoDivisao;
    }

    @Override
    public int calcula(int a, int b) {

        restoDivisao = 0;
        restoDivisao = a % b;

        return resultadoDivisao = a / b;
    }
}
