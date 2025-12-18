//Q10. Write a Java program to convert a character from uppercase to lowercase using ASCII.

import java.util.Scanner;
public class q10 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char ch=sc.next().charAt(0);
    int a=(int)ch;
    int b=a+32;
    System.out.println("Upper to Loweer case is "+(char)b);
}
}