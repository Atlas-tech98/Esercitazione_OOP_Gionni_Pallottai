import java.util.Scanner;

public class UserArray {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Quanti elementi vuoi inserire?: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        int sum = 0;
        for (int i = 0; i < numbers.length; i++){

            System.out.print("Inserisce il numero " + (i + 1) + ": ");
            numbers[i] = input.nextInt();

            sum += numbers[i];
        }

        System.out.println("La somma è: " + sum);

        input.close();
    }
}