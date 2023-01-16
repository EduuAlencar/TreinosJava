package fahren;

import java.util.Scanner;
public class exercicio5 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        Scanner ler1 = new Scanner(System.in);

        System.out.println("Qual o valor da temperatura? ");
        int temp = ler.nextInt();

        System.out.println("Qual medida é? ");
        String valor = ler1.nextLine();

        valor = valor.toUpperCase();
        if (valor.equals("F")) {
            vousimplificar(temp);
        }


        if (valor.equals("C")) {
            double C = (temp - 32) / 1.8;
            System.out.println("O resultado de Fahrenheit para Celsius é: " + C + " C°");
        }




    }
    static void vousimplificar(double temp){
        double F = temp * 1.8 + 32;
        System.out.println("O resultado de Celsius para Fahrenheit é: " + F + " F°");
     }

}
