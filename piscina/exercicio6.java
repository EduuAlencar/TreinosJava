package piscina;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[]args) {

        Scanner entrada = new Scanner(System.in);

        double poolheight = 20;
        double poolwidth = 10;
        double pooheight = 1.8;

        double volume = pooheight * poolheight * poolwidth * 100;

        System.out.println("As dimensoes da piscina são \n " + poolheight + "de altura \n" + poolwidth + "de largura \n");
        System.out.println();
        System.out.println("o volume de agua que cabe na piscina é de " + volume + "lados");


    }
}
