//Q2.Write a Java Program to check whether a person is eligible to vote (age ≥ 18)
import java.util.*;
public class q2 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      
    int b=sc.nextInt();
    if(b>=18)
      System.out.println("Eligible to vote");
   else 
      System.out.println("Not Eligible");
sc.close();
}
}