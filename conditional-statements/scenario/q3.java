//Q3.Write a Java Program to check whether a person is
// eligible for senior citizen benefits (age ≥ 60)
import java.util.*;
public class q3 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      
    int b=sc.nextInt();
    if(b>=60)
      System.out.println("eligible for senior citizen");
   else 
      System.out.println("Not eligible for senior citizen");
sc.close();
}
}