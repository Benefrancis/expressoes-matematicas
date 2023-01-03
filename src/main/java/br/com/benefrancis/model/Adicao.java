package br.com.benefrancis.model;

/**
 * Expressão de soma
 */
public final class Adicao implements Expressao {
    Expressao a, b;

    public Adicao(Expressao a, Expressao b) {
        this.a = a;
        this.b = b;
    }

    public double eval() {
        return a.eval() + b.eval();
    }
}