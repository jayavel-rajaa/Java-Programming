package operators_basic;
//Q15. Write a Java Program to calculate the average of three numbers
import java.util.Scanner;
public class q15 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    double avg=(a+b+c)/3;
    System.out.printf("%2f",avg);    
}
}