package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = scan.nextLine();

        System.out.println("Enter yourProgramming Language");
        String programming = scan.nextLine();

        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine();// to capture the enter in the age

        System.out.println("Enter your School name: ");
        String schoolName = scan.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);
        scan.close();
    }
}
