//Q8. Write a Java program to convert decimal to binary.

import java.util.Scanner;
public class q8 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int bi=0,p=1;
    while(n!=0){
        int rem=n%2;
        bi=bi+(p*rem);
        p=p*10;
        n=n/2;
    }
    System.out.println("binary no. is "+bi);
}
}