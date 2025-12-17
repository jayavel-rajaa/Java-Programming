//Q21. Write a Java program to check whether a given integer is a power of 3 or not.

import java.util.Scanner;
public class q21 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int p,j=0;
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            p=i*i*i;
            if(p==n)
                j=1;
        }
        if(j==1)
            System.out.println("Number is Power of 3");
        else
            System.out.println("Number is Not a Power of 3");
    }
}