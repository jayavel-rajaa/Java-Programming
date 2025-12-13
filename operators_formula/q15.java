package operators_formula;
//Q15. Write a Java Program to find Surface Area, Volume of a Cylinder
import java.util.Scanner;
public class q15 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double r=sc.nextDouble(); 
    double h=sc.nextDouble(); 
    double sur=3.14285*r*r*h;
    System.out.println("Suraface Area(3.14*r^2*h): "+sur);
    double vol=(2*3.14285*r)*(r+h);
    System.out.println("Volume(2*3.14*r)*(r+h): "+vol);
}
}