package br.com.benefrancis.model;

/**
 * Expressão de soma
 */
public record Adicao(Expressao a, Expressao b) implements Expressao {
    public double eval() {
        return a.eval() + b.eval();
    }
}