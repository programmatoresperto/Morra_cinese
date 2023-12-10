import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char scelta1;
        char scelta2;
        Scanner input = new Scanner(System.in);
        System.out.println("Inserire primo elemento A (carta) S (sasso) D (forbici)\n");
        scelta1 = input.next().charAt(0);
        System.out.println("Inserire secondo elemento J (carta) K (sasso) L (forbici)\n");
        scelta2 = input.next().charAt(0);
        if ((scelta1 == 'A' && scelta2 == 'J') ||
                (scelta1 == 'S' && scelta2 == 'K') ||
                (scelta1 == 'D' && scelta2 == 'L')) {
            System.out.println("È un pareggio!");
        } else if ((scelta1 == 'A' && scelta2 == 'K') ||
                (scelta1 == 'S' && scelta2 == 'L') ||
                (scelta1 == 'D' && scelta2 == 'J')) {
            System.out.println("Il Giocatore 1 vince!");
        } else {
            System.out.println("Il Giocatore 2 vince!");

        }

    }
}