public class BiggestOne{

    public static void main(String[] args) {
        int[] numbers = {15, 22, 3, 19, 100};

        int max = numbers[0];
        
        for (int i = 1; i < numbers.length; i++){
            
            if(numbers[i] > max){
                max = numbers[i];
            }
        } 

        System.out.println("Il numero più grande è: " + max);
    }
}