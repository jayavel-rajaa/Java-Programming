//Q17.Write a Java program to assign different ticket prices 
// based on day of the week (weekday/weekend).
import java.util.*;
public class q17 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      System.out.println("enter day in no. [1/2/3/4/5/6/7]");
int b=sc.nextInt();
    if(b==1 || b==7)
      System.out.println("Day comes in Weekend. Price for one ticket is Rs.1200");
    else if(b==2 || b==3 || b==4 || b==5 || b==6)
      System.out.println("Day comes in Weekday. Price for one ticket is Rs.1000");
    else
        System.out.println("enter Valid Number for ticket prices !");
sc.close();
}
}