package br.com.benefrancis.model;

public record Valor(double i) implements Expressao {
    @Override
    public double eval() {
        return i;
    }
}