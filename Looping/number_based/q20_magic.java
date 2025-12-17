//Q20. Write a Java program to check whether a given number is a Magic Number or not.
//magic no.(sum of dig till single dig.) if(single dig == 1) . 

import java.util.Scanner;
public class q20_magic {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int s=0,ss=0,sss=0;
        int n=sc.nextInt();
            int t=n;
            while(n!=0){
                int d=n%10;
                s=s+d;
                n=n/10;
            }
            int t1=s;
            while(s!=0){
                int dd=s%10;
                ss=ss+dd;
                s=s/10;
            }
            int t2=ss;
            while(ss!=0){
                int ddd=ss%10;
                sss=sss+ddd;
                ss=ss/10;
            }
            int t3=sss;
            if(t1==1 || t2==1 || t3==1) {
                System.out.println("Magic Number");
    }
            else {
                System.out.println("Not a Magic number");
            }
    }
} 
