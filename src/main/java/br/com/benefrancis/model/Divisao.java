package br.com.benefrancis.model;

public record Divisao(Expressao a, Expressao b) implements Expressao {
    @Override
    public double eval() {
        if (b.eval() == 0) throw new ArithmeticException("Divisão por zero");
        return a.eval() / b.eval();
    }
}
