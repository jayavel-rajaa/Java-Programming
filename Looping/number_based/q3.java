//Q3. Write a Java program to count the number of digits in a given number.

import java.util.Scanner;
public class q3{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c = 0;
       while(n!=0){
        int d=n%10;
        c++;
        n=n/10;
       }
        System.out.print("Count of Digits is "+c);
    }
}
