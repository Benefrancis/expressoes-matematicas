package br.com.benefrancis.model;

public final class Divisao implements Expressao {

    Expressao a, b;

    public Divisao(Expressao a, Expressao b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double eval() {
        if (b.eval() == 0) throw new ArithmeticException("Divisão por zero");
        return a.eval() / b.eval();
    }
}
