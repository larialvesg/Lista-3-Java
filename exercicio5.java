package exercicios.lista3;
import java.util.Scanner;

public class exercicio5 {
    public static void main (String[] args){
        double saldo = 0;
        int saldo_positivo = 0, saldo_negativo = 0, total_pessoa = 0;
        String resposta;
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Informe seu saldo: ");
            saldo = scanner.nextDouble();
            scanner.nextLine();
            if (saldo > 0){
                saldo_positivo ++;
            }
            else {
                saldo_negativo ++;
            }
            System.out.println("Deseja continuar? S ou N?");
            resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase( "s")){
                continue;
            }
            else{
                break;
            }
        }
        total_pessoa = saldo_negativo + saldo_positivo;
        System.out.println("Total de pessoas com saldo positivo: " + saldo_positivo);
        System.out.println("Total de pessoas com saldo negativo: " + saldo_negativo);

        if (saldo_positivo > total_pessoa / 2) {
            System.out.println("Nenhum risco!");
        }
        else {
            System.out.println("Risco ao banco!");
        }
    }
}
