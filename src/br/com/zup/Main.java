package br.com.zup;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double salarioBruto;
        double fgts = 0;
        double salarioLiquido;
        double inss = 0;
        double impostoDeRenda = 0;
        double percentualDesconto = 0;
        int aliquta = 0;
        double totalDeDescontos = 0;

        System.out.println("Veja a sua folha de pagamento conforme o valor da hora trabalhada e a quantidade de horas trabalhadas no mês");
        System.out.print("Digite abaixo o valor da sua hora: ");
        double valorDaHora = leitor.nextDouble();

        System.out.print("Digite abaixo a quantidades de horas trabalhadas no mês : ");
        double qtdDeHoras = leitor.nextDouble();

        if (qtdDeHoras > 0 && valorDaHora > 0) {
            salarioBruto = valorDaHora * qtdDeHoras;
            fgts = salarioBruto * 11 / 100;
            inss = salarioBruto * 10 / 100;

            if (salarioBruto > 900 && salarioBruto <= 1500) {
                aliquta = 5;
            } else if (salarioBruto <= 2500) {
                aliquta = 10;
            } else {
                aliquta = 20;
            }
            salarioLiquido = salarioBruto - salarioBruto * aliquta / 100;
            impostoDeRenda = salarioBruto - salarioLiquido;
            totalDeDescontos = inss + impostoDeRenda;
            salarioLiquido = salarioBruto - totalDeDescontos;

            System.out.println("Salário Bruto: (" + valorDaHora + " * " + qtdDeHoras + ")\t\t: R$ " + salarioBruto);
            System.out.println("(-) IR (" + aliquta + "%)\t\t\t\t\t\t\t: R$ " + impostoDeRenda);
            System.out.println("(-) INSS (10%)\t\t\t\t\t: R$ " + inss);
            System.out.println("FGTS (11%)\t\t\t\t\t\t\t: R$ " + fgts);
            System.out.println("Total de descontos\t\t\t\t\t: R$ " + totalDeDescontos);
            System.out.println("Salário Liquido\t\t\t\t\t\t: R$ " + salarioLiquido);

        } else {
            System.out.println("Valores invalidos. ");
        }

    }

}