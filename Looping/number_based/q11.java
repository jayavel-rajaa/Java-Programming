//Q11. Write a Java program to print all factors of a given number.

import java.util.Scanner;
public class q11{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<n;i++){
            if(n%i==0)
                System.out.println(i);
        }
}
}