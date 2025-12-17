//Q8. Write a Java program to find the LCM and GCD of two numbers.

import java.util.Scanner;
public class q8q9{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int t1=a, t2=b;
        
       while(t2!=0){
        int temp=t2;
        t2=t1%t2;
        t1=temp;
       }
       int gcd = t1;
       int lcm = (a*b)/gcd;
        System.out.print("GCD is "+gcd);
        System.out.print("LCM is "+lcm);
    }
}
