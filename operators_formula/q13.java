package operators_formula;
//Q13.Write a Java Program to find Surface Area, Volume, and Perimeter of a Cuboid
import java.util.Scanner;
public class q13 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double l=sc.nextDouble(); 
    double b=sc.nextDouble(); 
    double h=sc.nextDouble(); 
    double sur=2*(l*b+b*h+l*b);
    System.out.println("Suraface Area(2*(lb+bh+lh)): "+sur);
    double vol=l*b*h;
    System.out.println("Volume(l*b*h): "+vol);
    double per=4*(l+b+h);
    System.out.println("Perimeter(12^a): "+per);
}
}