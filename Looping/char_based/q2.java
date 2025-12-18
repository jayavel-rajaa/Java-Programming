//Q2. Write a Java program to print all the English alphabets in lowercase.
import java.util.Scanner;
public class q2 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    for(char ch='a';ch<='z';ch++){
        System.out.print(ch+" ");
    }
    }
}