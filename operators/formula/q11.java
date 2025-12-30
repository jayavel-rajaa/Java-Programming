package operators_formula;
//Q11.Write a Java Program to find Circumference of a Circle
import java.util.Scanner;
public class q11 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double r=sc.nextDouble(); 
    double c=2*3.14*r;
    System.out.println("Circumference of a Circle is: "+c);     
}
}