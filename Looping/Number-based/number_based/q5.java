//Q5. Write a Java program to reverse a given number.

import java.util.Scanner;
public class q5{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int rev = 0;
       while(n!=0){
        int d=n%10;
        rev=rev*10+d;
        n=n/10;
       }
        System.out.print("Reverse of Number is "+rev);
    }
}
