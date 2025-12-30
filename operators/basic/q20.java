package operators.operators_basic;
//Q20.Write a Java Program to print pass/fail result based on marks.
import java.util.Scanner;
public class q20 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Exam mark :");
    double a=sc.nextDouble();
    System.out.println((a>40.0 && a<100)?"You, Passed the exam":"You, Failed the exam");    
}
}