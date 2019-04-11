package br.com.digitalhouse;

public class Soma implements OperacaoMatematica {

    private int resultadoSoma;

    public int getResultadoSoma() {
        return resultadoSoma;
    }

    public void setResultadoSoma(int resultadoSoma) {
        this.resultadoSoma = resultadoSoma;
    }

    @Override
    public int calcula(int a, int b) {

        return resultadoSoma = a + b;
    }
}
