package lab1_DigitsDescending;

import java.util.Scanner;

public class DigitsDescending {
    
    public static int sortDigitsDescending(int num) {
        int temp = num;
        int count = 0;
        while ( temp >0 ) {
            count ++;
            temp /= 10;
        }
        int[] digits = new int[count];
        temp = num;
        for (int i = 0; i < count; i++) {
            digits [i] = temp % 10;
            temp /= 10;
        }
        for (int i = 0; i < count - 1; i++) {
            for ( int j =0; j < count - i - 1; j++ ) {
                if (digits [j] < digits [j + 1]) {
                    int swap = digits [j];
                    digits [j] = digits [j +1];
                    digits [j +1] = swap;
                }
            }
        }
        int result = 0;
        for ( int d : digits) {
            result = result * 10 + d;
        }

        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter input: ");
        int input = scanner.nextInt();

        int result = sortDigitsDescending(input);
        System.out.println("Result: " + result);
        
    }

}