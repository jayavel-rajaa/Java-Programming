//Q4. Write a Java program to print the product of digits of a given number.

import java.util.Scanner;
public class q4{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int p = 1;
       while(n!=0){
        int d=n%10;
        p=p*d;
        n=n/10;
       }
        System.out.print("Product of Digits is "+p);
    }
}
