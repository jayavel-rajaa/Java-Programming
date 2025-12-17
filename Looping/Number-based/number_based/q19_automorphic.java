//Q19. Write a Java program to check whether a given number is an Automorphic Number or not.

import java.util.Scanner;
public class q19_automorphic {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int res=0;
        int n=sc.nextInt();
            int t=n;
            int sq=n*n;
                int d1=sq%10;
                int d2=sq%100;
                int d3=sq%1000;
                int d4=sq%10000;
                if(d1==t || d2==t || d3==t || d4==t)
                    res=1;
            System.out.print(sq);
            if(res==1) {
                System.out.println("Automorphic Number");
    }
            else {
                System.out.println("NOT an Automorphic Number");
            }
    }
} 