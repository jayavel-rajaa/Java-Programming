//Q1. Write a Java program to print all the English alphabets in uppercase.
import java.util.Scanner;
public class q1 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    for(char ch='A';ch<='Z';ch++){
        System.out.print(ch+" ");
    }
    }
}