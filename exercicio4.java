package exercicios.lista3;
import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args) {
        int incremento = 0, numero = 0, aux = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite um incremento: ");
        incremento = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numero; i++) {
            System.out.print(aux + " ");
            if (aux == numero){
                break;
            }
            aux = aux + incremento;
        }


    }
}
