package operators_basic;
//Q14. Write a Java Program to print the cube of a given number
import java.util.Scanner;
public class q14 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble();
    double b=Math.pow(a,3);
    System.out.println(b);    
}
}