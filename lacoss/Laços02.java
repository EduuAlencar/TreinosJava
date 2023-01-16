package lacoss;// finalizado :


import java.util.Scanner;

public class Laços02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Informe um numero: ");
        int informe = scanner.nextInt();


        for (int e = 1; e <= informe ; e++){
            System.out.printf("-");
            System.out.print(e);


            for (int ea = 1 ; e >= ea; ea++){
                System.out.print("#");
            }
            System.out.printf("\n");
        }









    }
}
