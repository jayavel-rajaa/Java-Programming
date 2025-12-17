//Q23. Write a Java program 
// to find N power of M (Exponentiation) without using built-in functions.

import java.util.Scanner;
public class q23 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=sc.nextInt();
        int r=1;
        for(int i=1;i<=e;i++){
            r*=n;
        }
        System.out.println(r);
    }
}