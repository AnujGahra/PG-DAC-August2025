// Develop a program that prints the multiplication table for a given number using function.

import java.util.Scanner;

public class MultiplicationTable {
    
    public static void printTable(int num) {
        for(int i = 1; i<= 10; i++) {
            System.out.println(num*i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        printTable(num);
    }
}
