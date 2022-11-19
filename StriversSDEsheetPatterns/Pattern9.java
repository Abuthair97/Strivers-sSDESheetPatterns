package StriversSDEsheetPatterns;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = n; i > 0 ; i--) {
            char value = 65;
            for (int j = 1; j <= i ; j++) {
                System.out.print(value);
                value++;
            }
            System.out.println();
        }
    }
}
