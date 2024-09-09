/*Elabore um programa que leia o sexo de um número indeterminado de pessoas.
 Ao final escreva a quantidade de pessoas cadastradas e o total de pessoas  de cada sexo.
 */

import java.util.Scanner;

public class Exercicio4_3 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entre com o numero de pessoas: ");
        int qtd = scanner.nextInt();

        int i;
        int contM = 0;
        int contF = 0;

        for (i = 0; i < qtd; i++) {
            System.out.print("Entre com o seu sexo (M/F): ");
            char sexo = scanner.next().charAt(0);

            if ((sexo == 'M') || (sexo == 'm')) {
                contM++;
            } else {
                contF++;
            }
        }

        System.out.println("A quantidade de pessoas cadastradas eh: " + qtd);
        System.out.println("Quantidade de pessoas do sexo masculino: " + contM);
        System.out.println("Quantidade de pessoas do sexo feminino: " + contF);

        scanner.close();

    }
}
