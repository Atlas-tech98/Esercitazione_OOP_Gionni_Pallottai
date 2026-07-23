import java.util.Scanner;

public class Average{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Quanti numeri vuoi inserire? ");
        int n = input.nextInt();
        
        int sum = 0;
        int sumEven = 0;
        int sumOdd = 0;

        int CountEven = 0;
        int CountOdd = 0;

        for (int i=0; i<n; i++) {

            System.out.print("Inserisci un numero: ");
            int number = input.nextInt();

            sum += number;

            if (number %2 == 0){
                sumEven += number;
                CountEven++;

            } else {
                sumOdd += number;
                CountOdd++;
            }
        }

        System.out.println("Media totale: " + (double) sum/n);
        if(CountEven > 0)
            System.out.println("Media pari: " + (double) sumEven/CountEven);

        if(CountOdd > 0)
            System.out.println("Media dispari: " + (double) sumOdd/CountOdd);

        input.close();
    }
}