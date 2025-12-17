//Q14.Write a Java program to assign ticket price based on
//  passenger age (child, adult, senior).
import java.util.*;
public class q14 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    if(b>0 && b<=18)
      System.out.println("Child");
   else if(b>18 && b>55)
      System.out.println("Adult");
    else
        System.out.println("Senior");
sc.close();
}
}