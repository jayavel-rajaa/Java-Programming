//Q16. Write a Java program to check whether a given number is a Neon Number or not.
//     9 => 81 => 8+1 =>9 It is Neon number

import java.util.Scanner;
public class q16_neon {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int s=0;
        int n=sc.nextInt();
            int t=n;
            int sq=n*n;
            while(sq!=0){
                int d=sq%10;
                s+=d;
                sq=sq/10;
            }
            if(s==t) {
                System.out.println("Neon number");
    }
            else {
                System.out.println("Not a Neon number");
            }
    }
} 
