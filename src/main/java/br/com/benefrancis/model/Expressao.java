package br.com.benefrancis.model;

/**
 * A interface Expressão que permite a implementação apenas pelas classes:
 * Constante, Adicao, Multiplicacao, Subtracao , Divisao
 */
sealed interface Expressao
        permits Valor, Adicao, Multiplicacao, Subtracao, Divisao {
    double eval();
}
