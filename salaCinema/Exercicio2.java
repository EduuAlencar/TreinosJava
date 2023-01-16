package salaCinema;

public class Exercicio2 {
    public static void main(String[] args) {

     int totalChairPerRow = 8;
     int totalRow = 10;
     int totalChairs = totalRow * totalChairPerRow;
     int reserved = 10;
     int totalreservedPCD = (totalChairs * reserved)/ 108;

     System.out.printf("Cada sala de cinema tem %d fileiras e %d cadeiras \n", totalRow,totalChairPerRow);
     System.out.printf("A capacidade dessa sala é de %d pessoas sendo que %d lugares são reservados para pcds",totalChairs,totalreservedPCD);
    }

    }

