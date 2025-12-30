package operators_formula;
//Q14.Write a Java Program to find Surface Area, Volume of a Sphere
import java.util.Scanner;
public class q14 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double r=sc.nextDouble(); 
    double sur=4*3.14285*r*r;
    System.out.println("Suraface Area= 4*(3.14*r^2)): "+sur);
    double vol=1.33*3.14285*r*r*r;
    System.out.println("Volume(4/3 *3.14*r^3): "+vol);
}
}