//Q9. Write a Java program to convert binary to decimal.

import java.util.Scanner;
public class q9 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String bi=sc.next();
    int decimal = Integer.parseInt(bi, 2);
    System.out.println("binary no. is "+decimal); 
}
}