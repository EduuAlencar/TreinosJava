package lacoss;

import  java.util.Scanner;
import java.util.Random;

public class laço03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();



        System.out.println("Digite um numero ");
        int numero = ler.nextInt();
        int[] sorteados = new int [numero];

        for (int e = 1; e <= numero; e++){
            int numero_random = random.nextInt(6) + 1;
            sorteados[(e-1)] = numero_random;
            System.out.println(" O numero  " +numero_random+ " foi sorteado");
        }
        int soma = 0;
        for(int i = 0; i <= (numero - 1); i++){

            soma += sorteados[i];
        }
        System.out.println("A soma dos números sorteados foi " + soma);

    }

}