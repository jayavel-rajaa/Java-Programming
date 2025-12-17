//Q16.Write a Java program to validate a mobile number .
//If it has 10 or more digits, print “Valid Number”, otherwise print “Invalid Number”.
import java.util.*;
public class q16 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    long b=sc.nextLong();
    if(b>1000000000)
      System.out.println("Valid Number");
    else
        System.out.println("InValid Number");
sc.close();
}
}