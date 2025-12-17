//Q4. Java Program to check whether the sum of three angles forms a valid triangle.
import java.util.*;
public class q4 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
    if(x>0 && y>0)
      System.out.println("1st quad");
    else if(x<0 && y>0)
      System.out.println("2nd quad");
    else if(x<0 && y<0)
      System.out.println("3rd quad");
   else if(x>0 && y<0)
      System.out.println("4th quad");
    else
      System.out.println("origin");
}
}