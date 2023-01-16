package matrizes;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

    public class Matrizes003 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    System.out.println("Quantos nomes voce gostaria de digitar ? ): ");
        int nome = sc.nextInt();


        if (nome % 3 != 0) {
            System.out.println("falha !! o numero precisa ser divisivel por 3!");
        } else {
            int quantidade = nome / 3;


            String[] nomesPedidos = new String[nome];
            for (int i = 0; i < nome; i++) {
                System.out.println("Digite o próximo nome: ");
                nomesPedidos[i] = sc.next();
            }


            List<String> nomesLista = Arrays.asList(nomesPedidos);
            Collections.shuffle(nomesLista);
            String[] nomessorteios = nomesLista.toArray(nomesPedidos);


            int indexador = 0;
            for (int j = 0; j < quantidade; j++) {
                int numeroGrupo = j + 1;
                System.out.printf("Grupo %d: \n", numeroGrupo);
                for (int k = 0; k < 3; k++) {
                    System.out.println(nomessorteios[indexador]);
                    indexador++;

                }
            }
        }
    }
}