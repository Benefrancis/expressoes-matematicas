package br.com.benefrancis.model;

/**
 * Expressão de multiplicação
 */
public record Multiplicacao(Expressao a, Expressao b) implements Expressao {

    @Override
    public double eval() {
        return a.eval() * b.eval();
    }
}