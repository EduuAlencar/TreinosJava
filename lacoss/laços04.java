package lacoss;

import  java.util.Scanner;
import java.util.Random;

public class laços04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Digite um numero : ");
        int numb = ler.nextInt();

        for (int i = 0 ; i < numb; i++){
            int temp = random.nextInt(6)+1;
            System.out.println("O numero sorteado foi : " + temp);

            if (numb == temp) {
                System.out.println("Foram necessarios " + temp+"para o numero "+numb+"fosse sorteado");

            }
         }





    }
}