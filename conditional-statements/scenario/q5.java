//Q5.Write a Java program to check if temperature is above 100 (fever check).
import java.util.*;
public class q5 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      
    int b=sc.nextInt();
    if(b>=100)
      System.out.println("Fever");
   else
        System.out.println("Not Fever");
sc.close();
}
}