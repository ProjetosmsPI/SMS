/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicios.pkgswitch.pkgcase;

import java.util.Scanner;

/**
 *
 * @author GUSTAVO
 */
public class Exercicio1 {

    static Scanner leia = new Scanner(System.in);

    /**
     * @param args the command line arguments 1. Crie um programa que receba um
     * inteiro, de 1 até 12, representando os meses do ano e retorne o número de
     * dias do mês
     *
     */
    public static void main(String[] args) {

        meses();

    }

    public static void meses() {

        System.out.println("Digite um numero de 1 a 12");
        System.out.println("TESTANDO GITHUBBBBBBBB");

        int n = leia.nextInt();
        String mes = "";
        switch (n) {

            case 1:
                mes = "Janeiro, 31 dias";
                break;
            case 2:
                mes = "Fevereiro, 28 dias";
                break;
            case 3:
                mes = "Março, 31 dias";
                break;
            case 4:
                mes = "Abril , 30 dias";
                break;
            case 5:
                mes = "Maio , 31 dias";
                break;
            case 6:
                mes = "Junho, 30 dias";
                break;
            case 7:
                mes = "Julho ,31 dias";
                break;
            case 8:
                mes = "Agosto , 31 dias";
                break;
            case 9:
                mes = "Setembro ,30 dias";
                break;
            case 10:
                mes = "Outubro , 31 dias";
                break;
            case 11:
                mes = "Novembro , 30 dias";
                break;
            case 12:
                mes = "Dezembro , 31 dias";
                break;

            default:
                System.out.println("Numero invalido tente novamente");
                meses();
                break;

        }
        System.out.println(mes);
        continuacao();

    }

    public static void continuacao() {
        System.out.println("Deseja checar outro numero?");
        String txt = leia.next();
        if (txt.equalsIgnoreCase("s")) {
            meses();

        } else if (txt.equalsIgnoreCase("n")) {
            System.out.println("Programa finalizado");
        } else if (txt != "s" || txt != "n") {
            System.out.println("Opção invalida, tente novamente");
            continuacao();

        }

    }
}
