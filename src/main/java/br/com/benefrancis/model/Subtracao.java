package br.com.benefrancis.model;

/**
 * Expressão negativa
 */
public final class Subtracao implements Expressao {
    Expressao e;

    public Subtracao(Expressao e) {
        this.e = e;
    }

    public double eval() {
        return -e.eval();
    }
}