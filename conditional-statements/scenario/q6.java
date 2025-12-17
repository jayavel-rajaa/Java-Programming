//Q6.Write a Java program to check pass/fail based on marks (marks ≥ 35 = pass).
import java.util.*;
public class q6 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      
    int b=sc.nextInt();
    if(b>=35)
      System.out.println("pass");
   else
        System.out.println("Fail");
sc.close();
}
}