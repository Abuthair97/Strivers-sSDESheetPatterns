package StriversSDEsheetPatterns;

import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = 1;
        int n = sc.nextInt();
        for (int i = 1; i <= n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(value+" ");
                value++;
            }
            System.out.println();
        }
    }
}
