//Q5. Write a Java Program to check whether three sides form a valid triangle.
import java.util.*;
public class q5 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
   if((a+b>c || b+c>a || a+c>b))
      System.out.println("triangle is valid");
   else
      System.out.println("not valid triangle");
}
}