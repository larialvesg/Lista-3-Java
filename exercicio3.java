package exercicios.lista3;

import java.util.ArrayList;
import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){
        String resposta;
        float nota;
        float avaliacao;
        float cont = 0;
        float otimo = 0;
        float bom = 0;
        float ruim = 0;
        float otimo_porcent, bom_porcent, ruim_porcent;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Float> notas = new ArrayList<>();
        ArrayList<Float> avaliacoes = new ArrayList<>();


        while(true) {
            System.out.print("Digite uma nota para o filme Avatar: O Caminho da Água\n");
            nota = scanner.nextInt();
            notas.add(nota);
            scanner.nextLine();

            System.out.println("Digite se o filme é \n[1] Ótimo \n[2] Bom \n[3] Ruim");
            avaliacao = scanner.nextInt();
            avaliacoes.add(avaliacao);
            scanner.nextLine();

            System.out.println("Deseja continuar? S ou N?");
            resposta = scanner.nextLine();
            if (resposta.equalsIgnoreCase( "s")){
                continue;
            }
            else{
                break;
            }

        }
        for (Float f : avaliacoes) {
            cont ++;
            if (f == 1){
                otimo ++;
            }
            else if (f == 2){
                bom ++;
            }
            else if (f == 3){
                ruim ++;
            }
        }
        otimo_porcent = (otimo / cont) * 100;
        bom_porcent = (bom / cont) * 100;
        ruim_porcent = (ruim / cont) * 100;
        System.out.printf("%.0f pessoas responderam que é ótimo e isso representa %.2f%% do total\n", otimo, otimo_porcent);
        System.out.printf("%.0f pessoas responderam que é bom e isso representa %.2f%% do total\n", bom, bom_porcent);
        System.out.printf("%.0f pessoas responderam que é ruim e isso representa %.2f%% do total\n", ruim, ruim_porcent);


    }
}
