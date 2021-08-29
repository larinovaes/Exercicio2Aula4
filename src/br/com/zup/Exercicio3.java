package br.com.zup;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int contador = 0;

        System.out.println("Interrogatório, escolha S para Sim e N para Não");

        System.out.println("Telefonou para a vítima?");
        String resposta1 = leitor.nextLine();
        if (resposta1.equals("S")) {
            contador += 1;
        }
        System.out.println("Esteve no local do crime?");
        String resposta2 = leitor.nextLine();
        if (resposta2.equals("S")) {
            contador += 1;
        }
        System.out.println("Mora perto da vítima?");
        String resposta3 = leitor.nextLine();
        if (resposta3.equals("S")) {
            contador += 1;
        }
        System.out.println("Devia para a vítima?");
        String resposta4 = leitor.nextLine();
        if (resposta4.equals("S")) {
            contador += 1;
        }
        System.out.println("Já trabalhou com a vítima?");
        String resposta5 = leitor.nextLine();
        if (resposta5.equals("S")) {
            contador += 1;
        }

        if (contador == 2) {
            System.out.println("Você é suspeito");
        } else if (contador == 3 || contador == 4) {
            System.out.println("Você é cumplice");

        } else if (contador == 5) {
            System.out.println("Você é  Culpado");
        } else {
            System.out.println("Voce é inocente");
        }
    }
}
