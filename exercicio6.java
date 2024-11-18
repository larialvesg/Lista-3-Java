package exercicios.lista3;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        int numero_pessoa = 0, numero_tabuada = 0, resultado = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero para ver a tabuada: ");
        numero_pessoa = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < 11; i++) {
            System.out.printf("%d X %d = %d \n", numero_pessoa, numero_tabuada, resultado);
            numero_tabuada = numero_tabuada + 1;
            resultado = numero_tabuada * numero_pessoa;

        }
    }
}
