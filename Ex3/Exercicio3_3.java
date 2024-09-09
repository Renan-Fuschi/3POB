/*Faça um programa que leia a idade de 10 pessoas. Ao final escreva a média das idades. */

import java.util.Scanner;

public class Exercicio3_3 {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        int i;
        int somaIdades = 0;
        int idades;
        for (i = 0; i < 10; i++) {
            System.out.print("Entre com a sua idade: ");
            idades = scanner.nextInt();
            somaIdades += idades;
        }

        float media = (float) somaIdades / i;

        System.out.println("A media das idades eh: " + media);

        scanner.close();

    }
}
