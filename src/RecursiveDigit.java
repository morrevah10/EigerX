import java.util.Arrays;
import java.util.Scanner;

public class RecursiveDigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = scanner.nextInt();
        int sumOfDig = sumOfDig(number);




        System.out.println("the sum of the digit of your number is  " + sumOfDig);
        scanner.close();
    }

    private static int sumOfDig(int number) {
        if (number == 0){
            return 0;
        }
        return (number %10 +sumOfDig(number/10));
    }

}


