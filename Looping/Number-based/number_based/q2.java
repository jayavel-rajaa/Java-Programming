//Q2. Write a Java program to calculate the sum of digits of a given number.

import java.util.Scanner;
public class q2{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum = 0;
       while(n!=0){
        int d=n%10;
        sum=sum+d;
        n=n/10;
       }
        System.out.print("Sum of Digits is "+sum);
    }
}
