//Q15. Write a Java program to check whether a given number is a Perfect Number or not.
//perfect number => 6 = (sum of divisors) => 1+2+3 (tables) => 6

import java.util.Scanner;
public class q15_perfect {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int s=0;
        int ss=0;
        int n=sc.nextInt();
            int t=n;
            for(int i=1;i<n;i++){
                if(n%i==0){
                    s=s+i;
                }
               ss=s; 
            }
            if(ss==t) {
                System.out.println("Perfect number");
    }
            else {
                System.out.println("Not a Perfect number");
            }
    }
} 
