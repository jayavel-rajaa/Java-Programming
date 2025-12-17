//Q10. Write a Java program to check whether a given number is prime or not.

import java.util.Scanner;
public class q10{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean isprime=true;
        if(n<=1)
            isprime=false;
        else{
        for(int i=2;i<n;i++){
            if(n%i==0)
              isprime=false;
        }
    }
    if(isprime)
        System.out.println("Prime");
    else
        System.out.println("Not Prime");
}
}
