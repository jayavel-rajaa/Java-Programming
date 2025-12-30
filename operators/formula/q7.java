package operators_formula;
//Q7.Write a Java Program to calculate Celsius to Fahrenheit
import java.util.Scanner;
public class q7 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble(); 
    double b=(a*9/5)+32;
    System.out.println("Fahrenheit Degree for given Celcius is: "+b);     
}
}