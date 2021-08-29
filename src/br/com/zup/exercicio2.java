package br.com.zup;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int litros = 0;
        double alcool = 1.90;
        double gasolina = 2.50;

        System.out.print("Para saber o valor a ser pago pelo o combustível Digite A alcool e G gasolina: ");
        String resposta = leitor.nextLine();
        System.out.print("Por favor digite a quantidade de litros: ");
        litros = leitor.nextInt();
        System.out.println("Numero de litros comprados é: " + litros);

        if (resposta.equals("A")) {
            System.out.println("O combustível escolhido é Álcool");
            double precoDoAlcoolBaseNoLitro = descobrirPrecoDoAlcoolBaseNoLitro(litros);
            double desscontoDoAlcool = descobrirDescontoDoAlcool(litros, precoDoAlcoolBaseNoLitro);
            double valorTotal = precoDoAlcoolBaseNoLitro - desscontoDoAlcool;
            System.out.println("Valor total: R$" + valorTotal);
        } else {
            System.out.println("O combustível escolhido é Gasolina");
            double precoDaGasolina = precoDoLitroDaGasolina(litros);
            double descontoDaGasolina = descontoDaGasolina(litros, precoDaGasolina);
            double valorTotalDaGasolina = precoDaGasolina - descontoDaGasolina;
            System.out.println("Valor total: R$" + valorTotalDaGasolina);
        }

        /**
         *
         * descobrir preço do alcool baseado no litro
         * após pegar preço do alcool, aplicar valor do desconto baseado no litro
         *
         * para descobrir preço do litro, multiplicar o valor do alcool pelo o numero de litros
         * para descobir o desconto, perguntar se o valor de litros é maior que o limite
         * se for menor o desconto será igual o valor total multiplicado por 0.03
         * se for maior o desconto será igual o valor total multiplicado por 0.05
         *
         * o valor final será igual ao valor do alcool multiplicado pelo o numero de litros menos o desconto
         *
         */
    }

    public static double descobrirPrecoDoAlcoolBaseNoLitro(int litros) {
        return 1.9 * litros;
    }

    public static double descobrirDescontoDoAlcool(int litros, double alcool) {
        if (litros <= 20) {
            return alcool * 0.03;
        } else {
            return alcool * 0.05;
        }
    }

    public static double precoDoLitroDaGasolina(int litros) {
        return 2.50 * litros;
    }

    public static double descontoDaGasolina(int litros, double gasolina) {
        if (litros <= 20) {
            return gasolina * 0.04;
        } else {
            return gasolina * 0.06;
        }
    }
}

