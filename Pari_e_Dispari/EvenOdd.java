import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Inserisci un numero: ");
        int number = input.nextInt();

        if(number %2 == 0) {
            System.out.println("il numero è pari.");
        } else {
            System.out.println("il numero è dispari.");
        }

        input.close();
    }
}