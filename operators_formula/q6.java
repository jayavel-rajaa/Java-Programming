package operators_formula;
//Q6.Write a Java Program to calculate Fahrenheit to Celsius
import java.util.Scanner;
public class q6 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble(); 
    double b=(a-32)*5/9;
    System.out.println("Fahrenheit Degree for given Celcius is: "+b);     
}
}
//Formula
//f=c*9/5+32