package br.com.benefrancis.model;

/**
 * Expressão negativa
 */
public record Subtracao(Expressao e)  implements Expressao {
    @Override
    public double eval() {
        return -e.eval();
    }
}