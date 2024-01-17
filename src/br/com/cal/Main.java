package br.com.cal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner memoria = new Scanner(System.in);

        Usuario dados = new Usuario();

        System.out.println("================================");
        System.out.println("    Calculadora Educ360");
        System.out.println("================================");

        System.out.println("Faça seu Cadastro");
        System.out.println("Qual é seu nome?");
        dados.nome = memoria.nextLine();
        System.out.println("Qual é sua idade?");
        dados.idade = memoria.nextInt();

        System.out.println("====================================");
        System.out.println("Ola, " + dados.nome + " Seja bem vindo! ");
        System.out.println("Você tem, " + dados.idade + " anos! ");
        System.out.println("====================================");


        Calculadora cal = new Calculadora();

        System.out.println(" Digite o primeiro valor = ");
        double numero1 = memoria.nextDouble();

        System.out.println(" Digite o segundo valor = ");
        double numero2 = memoria.nextDouble();

        System.out.println(" Selecione Operador. ");
        char operacao = memoria.next().charAt(0);

        double resultado = cal.calcular(numero1, numero2, operacao);
        System.out.println("==============\n "+"Resultado : " + resultado + "\n===============");
        System.out.println("Programa Finalizado!");
        System.out.println("Programa by Gabriel Alves de Lima!");
        memoria.close();
    }
}