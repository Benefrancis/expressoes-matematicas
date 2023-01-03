package br.com.benefrancis.model;

/**
 * Expressão de multiplicação
 */
public final class Multiplicacao implements Expressao {
    Expressao a, b;

    public Multiplicacao(Expressao a, Expressao b) {
        this.a = a;
        this.b = b;
    }

    public double eval() {
        return a.eval() * b.eval();
    }
}