package operators.operators_basic;
//Q19.Write a Java Program to find the greatest of three numbers.
import java.util.Scanner;
public class q19 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble();
    double b=sc.nextDouble();
    double c=sc.nextDouble();
    System.out.println((a>b && a>c)?a+" is Greater":(b>a &&b>c)?b+" is Greater":c+" is Greater");    
}
}