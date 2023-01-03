package br.com.benefrancis.model;

public final class Valor implements Expressao {
    double i;

    public Valor(double i) {
        this.i = i;
    }

    public double eval() {
        return i;
    }
}