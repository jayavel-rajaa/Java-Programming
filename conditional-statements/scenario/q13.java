//Q13.Write a Java program to display mobile battery status (full, moderate, low).
import java.util.*;
public class q13 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      System.out.println("Enter mobile % ");
    int b=sc.nextInt();
    if(b>25)
      System.out.println("low");
   else if(b>=25 && b>80)
      System.out.println("moderate");
    else
        System.out.println("full");
sc.close();
}
}