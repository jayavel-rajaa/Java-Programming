package operators_basic;
//Q12.Write a Java Program to print the absolute value of a given number.
import java.util.Scanner;
public class q12 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=Math.abs(a);
    System.out.println(b);    
}
}