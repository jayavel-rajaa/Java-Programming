package operators_formula;
//Q12.Write a Java Program to find Surface Area, Volume, and Perimeter of a Cube
import java.util.Scanner;
public class q12 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble(); 
    double sur=6*a*a;
    System.out.println("Suraface Area(6a^2): "+sur);
    double vol=a*a*a;
    System.out.println("Volume(a^3): "+vol);
    double per=12*a;
    System.out.println("Perimeter(12^a): "+per);
}
}