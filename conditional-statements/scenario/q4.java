//Q4.Write a Java program to display mobile Battery check –
//  "Low Battery", "50% consumed", or "Battery Full".
import java.util.*;
public class q4 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      
    int b=sc.nextInt();
    if(b>=90)
      System.out.println("Full");
   else if(b>=30 && b<=50)
      System.out.println("50% consumed");
   else if(b>=510 && b<=90)
      System.out.println("20-40% consumed");
   else
        System.out.println("20-40% consumed");
sc.close();
}
}