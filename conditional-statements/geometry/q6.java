//Write a Java Program to check whether four sides form a square or rectangle.

import java.util.*;
public class q6 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int d=sc.nextInt();
   if((a==b && a==c && a==d)
      System.out.println("sides are square");
   else if(a==c && b==d )
      System.out.println("sides are rectangle");
    else 
      System.out.println("sides are neither rectangle nor square");
}
}