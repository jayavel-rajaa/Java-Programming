package operators_formula;
//Q10.Write a Java Program to find Perimeter of a Triangle
import java.util.Scanner;
public class q10 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble(); 
    double b=sc.nextDouble();
    double c=sc.nextDouble(); 
    double p=a+b+c;
    System.out.println("Perimeter of Triangle is: "+p);     
}
}