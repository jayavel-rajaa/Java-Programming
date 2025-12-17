//Q13. Write a Java program to check whether a given integer is a perfect square or not.

import java.util.Scanner;
public class q13 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int j=0;
        for(int i=1;i<n;i++){
            if(i*i==n)
                j=1;
        }

        if(j==1)
            System.out.println("It is perfect square");
        else
            System.out.println("It is NOT perfect square");
    }
}