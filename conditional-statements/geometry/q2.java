//Q2. Java Program to check whether a triangle is right-angled or not
import java.util.*;
public class q2 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
   if(((a+b==90) && (c==90)) || ((b+c==90) && (a==90)))
      System.out.println("triangle is right-angled");
   else
      System.out.println("not right triangle");
}
}