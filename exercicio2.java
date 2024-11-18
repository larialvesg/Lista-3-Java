package exercicios.lista3;
import java.util.ArrayList;
import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        int pessoas_idade;
        int cont = 0;
        float pessoas_altura, pessoas_peso;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> idade = new ArrayList<>();
        ArrayList<Float> altura = new ArrayList<>();
        ArrayList<Float> peso = new ArrayList<>();


        System.out.println("Digite a idade de 10 pessoas: ");
        for (int i = 0; i < 10; i++) {
            pessoas_idade = scanner.nextInt();
            idade.add(pessoas_idade);
            scanner.nextLine();
        }
        System.out.println("Digite a altura de 10 pessoas: ");
        for (int i = 0; i < 10; i++) {
            pessoas_altura = scanner.nextFloat();
            altura.add(pessoas_altura);
            scanner.nextLine();
        }
        System.out.println("Digite o peso (em KG) de 10 pessoas: ");
        for (int i = 0; i < 10; i++) {
            pessoas_peso = scanner.nextFloat();
            peso.add(pessoas_peso);
            scanner.nextLine();
        }

        for (Integer integer : idade) {
            if (integer > 50 ) {
                cont ++;
            }
        }
        System.out.println(cont + " pessoas tem mais de 50 anos");
        cont = 0;

        for (Float a : altura) {
            if (a > 1.60 ) {
                cont ++;
            }
        }
        System.out.println(cont + " pessoas são maiores que 1,60m ");
        cont = 0;

        for (Float p : peso) {
            if (p < 80 ) {
                cont ++;
            }
        }
        System.out.println(cont + " pessoas tem menos de 80kg ");


    }
}