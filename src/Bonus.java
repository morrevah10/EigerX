import java.util.Scanner;

public class Bonus {
        static int max = Integer.MIN_VALUE;
        static int count = 0;
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int number;
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            countMax(number);
        }
        public static void countMax(int number) {
            if(number == 0) {
                System.out.println("Sequence maximum is: " + max + " and we have " + count + " in the sequence.");
            }else {
                if(number > max) {
                    max = number;
                    count = 1;
                }else if(number == max) {
                    count++;
                }
                System.out.print("Enter a number: ");
                number = new Scanner(System.in).nextInt();
                countMax(number);
            }
        }
    }


