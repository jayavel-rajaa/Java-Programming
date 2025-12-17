//Q22. Write a Java program to multiply two numbers without using * operator.

import java.util.Scanner;
public class q22 {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int r=0;
        for(int i=1;i<=n2;i++){
            r=r+n1;
        }
        System.out.println("Multiple is "+r);
    }
}