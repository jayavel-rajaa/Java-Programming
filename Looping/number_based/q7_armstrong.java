//Q7. Write a Java program to check whether a number is Armstrong number or not.

import java.util.Scanner;
public class q7_armstrong{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int r,sum=0;
       while(n!=0){
        int d=n%10;
        r=d*d*d;
        sum=sum+r;
        n=n/10;
       }
       if(t==sum)
        System.out.print("It is Armstrong");
       else 
        System.out.print("It is Not Armstrong");
    }
}
