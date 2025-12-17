//Q18. Write a Java program to check whether a given number is a Buzz Number or not.

import java.util.*;
public class q18_buzz {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%7==0 || n%10==7){
            System.out.println("It is Buzz Number");
        }
        else {
            System.out.println("Not a Buzz Number");
        }
    }
}