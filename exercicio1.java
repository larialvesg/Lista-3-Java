package exercicios.lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int numero, opcao;
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números: ");

        for (int i = 0; i < 10; i++) {
            numero = scanner.nextInt();
            scanner.nextLine();
            numeros.add(numero);
            System.out.println(numeros);
        }
        while(true){

            System.out.println("O que você deseja saber? \n[1] Quantos números pares? \n[2] Quantos números ímpares? \n[3] Quantos números negativos? \n[4] Quantos números positivos? ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1 -> {
                    System.out.println("Os seguintes números são pares: ");
                    for (int n : numeros) {
                        if (n % 2 == 0){
                            System.out.print(n + " ");
                        }
                    }
                    System.out.println("\n");
                }
                case 2 ->{
                    System.out.println("Os seguintes números são ímpares: ");
                    for (int n : numeros) {
                        if (n % 2 == 1){
                            System.out.print(n + " ");
                        }
                    }
                    System.out.println("\n");
                }
                case 3 -> {
                    System.out.println("Os seguintes números são negativos: ");
                    for (int n : numeros) {
                        if (n < 0){
                            System.out.print(n + " " );
                        }
                    }
                    System.out.println("\n");
                }
                case 4 -> {
                    System.out.println("Os seguintes números são positivos: ");
                    for (int n : numeros) {
                        if (n >= 0){
                            System.out.print(n + " ");
                        }
                    }
                    System.out.println("\n");
                }
            }
        }
    }
}
