//Q1. Java Program to check whether a triangle is equilateral, isosceles, or scalene
import java.util.*;
public class q1 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
   if(a==b && a==c)
      System.out.println("It is equilateral");
   if(a==b || a==c || b==c)
      System.out.println("It is isosceles");   
   else
      System.out.println("scalene");
}
}