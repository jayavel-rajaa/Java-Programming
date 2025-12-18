//Q6. Write a Java program to print ASCII values from A–Z.

import java.util.Scanner;
public class q6 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    for(char ch='A';ch<='Z';ch++){
        System.out.print((int)ch+" ");
    }
 }
}