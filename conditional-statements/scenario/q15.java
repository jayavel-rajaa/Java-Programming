//Q15.Write a Java program to check whether vehicle speed exceeds 100 km/h.
import java.util.*;
public class q15 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int b=sc.nextInt();
    if(b>100)
      System.out.println("Go Slown, speed exceeds 100 km/h.");
    else
        System.out.println("speed is moderate");
sc.close();
}
}