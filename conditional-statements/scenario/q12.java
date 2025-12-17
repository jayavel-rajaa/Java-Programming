//Q12.Write a Java program to show weather condition 
// (cold, pleasant, hot, heatwave) based on temperature.
//Q6.Write a Java program to check pass/fail based on marks (marks ≥ 35 = pass).
import java.util.*;
public class q12 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter temperature in Celcius");
    int b=sc.nextInt();
    if(b>35)
      System.out.println("Heatwave");
   else if(b<=35 && b>26)
      System.out.println("Hot");
    else  if(b>20&&b<=26)
      System.out.println("Pleasant");
    else
        System.out.println("Cold");
sc.close();
}
}