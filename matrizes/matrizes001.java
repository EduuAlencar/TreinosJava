package matrizes;

import java.util.Scanner;

public class matrizes001 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int maior = 0;
        int menor = 0;
        int numerosdigitados;
        int array[];

        System.out.println("maior e menor numero ");
        System.out.println("Quantos numeros voce quer digitar ? ");
        numerosdigitados = scanner.nextInt();

        array = new int[numerosdigitados];

        for (int i = 0 ; i < numerosdigitados; i++){
            System.out.println("\n informe quantos numeros pretende digitar : ");
            array[i] = scanner.nextInt();

            maior = array[1];
            menor = array[1];
        }

        for (int i = 0 ; i < numerosdigitados ; i++){
            if (array[i] > maior){
                maior = array[i];
            }
        }

        System.out.println("maior: " + maior);
        System.out.println("menor : " + menor);







}
    }