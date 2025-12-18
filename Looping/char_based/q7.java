//Q7. Write a Java program to count the number of 1s and 0s in a binary number.

import java.util.Scanner;
public class q7 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    int count0=0,count1=0;
    while(n!=0){
        long d=n%10;
        if(d==0)
            count0++;
        else
            count1++;
        n=n/10;
    }
    System.out.println("0's : "+count0);
    System.out.println("1's : "+count1);
}
}