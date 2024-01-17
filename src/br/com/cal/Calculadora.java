package br.com.cal;

public class Calculadora {

    public double calcular(double numero1, double numero2, char operacao) {
        switch (operacao) {
            case '+':
                return Soma (numero1, numero2);
            case '-':
                return Subtracao (numero1, numero2);
            case '*':
                return Multiplicacao (numero1, numero2);
            case '/':
                return Divisao (numero1, numero2);
            default:
                throw new IllegalArgumentException("Falha no calculo");
        }

        }
        private double Soma(double numero1, double numero2) {
            return numero1 + numero2;
        }

        private double Subtracao(double numero1, double numero2) {
            return numero1 - numero2;
        }

        private double Multiplicacao(double numero1, double numero2) {
            return numero1 * numero2;
        }

        private double Divisao(double numero1, double numero2) {
            if (numero2 == 0) {
                throw new ArithmeticException("Valor invalido!");
        }
            return numero1 / numero2;
    }
}