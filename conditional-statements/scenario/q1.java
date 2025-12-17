//Q1.Write a Java Program to calculate different discount for different Bill amount
import java.util.*;
public class q1 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      
    int bill=sc.nextInt();
    System.out.println("Discounted bill "+bill);
    if(bill>=5000)
      System.out.println("Discounted bill "+(0.80*bill));
   else if(bill>2000 && bill<5000)
      System.out.println("Discounted bill "+(0.85*bill));
   else 
      System.out.println("Discounted bill "+(0.90*bill));
sc.close();
}
}