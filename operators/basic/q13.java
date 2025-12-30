package operators.operators_basic;
//Q13. Write a Java Program to print the square of a given number
import java.util.Scanner;
public class q13 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble();
    double b=Math.pow(a,2);
    System.out.println(b);    
}
}