//Q6. Write a Java program to check whether a number is palindrome or not.

import java.util.Scanner;
public class q6{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n;
        int rev = 0;
       while(n!=0){
        int d=n%10;
        rev=rev*10+d;
        n=n/10;
       }
       if(t==rev)
        System.out.print("It is palindrome");
       else 
        System.out.print("It is Not a palindrome");
    }
}
