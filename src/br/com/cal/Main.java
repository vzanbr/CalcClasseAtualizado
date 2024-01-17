package br.com.cal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner memoria = new Scanner(System.in);

        Calculadora cal = new Calculadora();

        System.out.println(" numero 1 = ");
        double numero1 = memoria.nextDouble();

        System.out.println(" numero 2 = ");
        double numero2 = memoria.nextDouble();

        System.out.println(" Qual operador ? + , - , * , / ");
        char operacao = memoria.next().charAt(0);

        double resultado = cal.calcular(numero1, numero2, operacao);
        System.out.println("Resultado : " + resultado);

        memoria.close();
    }
}