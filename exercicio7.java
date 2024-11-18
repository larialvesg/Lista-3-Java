package exercicios.lista3;

import java.util.Scanner;

public class exercicio7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] listaPeso = new double[6];
        double[] listaAltura = new double[6];
        String[] listaNome = new String[6];

        double maiorPeso = 0, maiorAltura = 0;
        String nomeMaisPesada = "", nomeMaisAlta = "";

        for (int i = 0; i < 3; i++) {
            System.out.println("Digite seu nome: ");
            listaNome[i] = scanner.nextLine();

            System.out.println("Digite sua altura: ");
            listaAltura[i] = scanner.nextDouble();

            System.out.println("Digite seu peso: ");
            listaPeso[i] = scanner.nextDouble();

            scanner.nextLine();


            if (listaAltura[i] > maiorAltura) {
                maiorAltura = listaAltura[i];
                nomeMaisAlta = listaNome[i];
            }

            if (listaPeso[i] > maiorPeso) {
                maiorPeso = listaPeso[i];
                nomeMaisPesada = listaNome[i];
            }
        }

        System.out.printf("A pessoa de maior altura é: %s com %.2f metros.\n", nomeMaisAlta, maiorAltura);
        System.out.printf("A pessoa de maior peso é: %s com %.2f kg.\n", nomeMaisPesada, maiorPeso);

        scanner.close();
    }
}
