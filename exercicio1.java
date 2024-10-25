package exercicios.lista3;

import java.util.Scanner;
import java.util.*;
import java.util.List;

public class exercicio1 {
    public static void main(String[] args){
        int numero, opcao;
        ArrayList<Integer> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 10 números: ");
        for (int i = 0; i < 10; i++) {
            numero = scanner.nextInt();
            lista.add(numero);
            scanner.nextLine();
        }
        System.out.println("Você deseja: \n[1] Ver os números pares \n[2] Ver os números ímpares \n[3] Ver números negativos \n[4] Ver números positivos \n[5] Sair");
        opcao = scanner.nextInt();
        scanner.nextLine();
        switch (opcao){
            case 1 ->{
                System.out.println("Esses são os números pares: ");
                for (Integer integer : lista) {
                    if (integer % 2 == 0) {
                        System.out.println(integer + " ");
                    }
                }
            }
            case 2 ->{
                System.out.println("Esses são os números ímpares: ");
                for (Integer integer : lista) {
                    if (integer % 2 == 1) {
                        System.out.println(integer + " ");
                    }
                }
            }
            case 3 ->{
                System.out.println("Esses são os números negativos: ");
                for (Integer integer : lista) {
                    if (integer < 0) {
                        System.out.println(integer + " ");
                    }
                }
            }
            case 4 ->{
                System.out.println("Esses são os números positivos: ");
                for (Integer integer : lista) {
                    if (integer >= 0) {
                        System.out.println(integer + " ");
                    }
                }
            }
            case 5 ->{
                System.exit(0);
            }
        }


    }
}
