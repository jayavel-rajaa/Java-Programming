package operators_basic;
//Q16.Write a Java Program to check whether two numbers are equal True if equal else False.
import java.util.Scanner;
public class q16 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    System.out.printf((a==b)?"Both are Equal":"Both are Not Equal");    
}
}