//Q18.Write a Java program to calculate water bill using slab rates
//(≤1000 liters free, next 2000 @ ₹5, above @ ₹10 per 1000 liters).
import java.util.*;
public class q18 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long b=sc.nextLong();
    long bb;
    if(b<=1000L)
      System.out.println("water bill liters free");
    else if(b>1000L && b<=2000L){
        bb=(b-1000L)*5;
      System.out.println("water bill liters rate Rs. "+bb);
      }
    else{
        bb=(b-1000L)*10;
      System.out.println("water bill liters rate Rs. "+bb);
      }  
sc.close();
}
}