/*A person deposits money in the bank.
Using the formula SI = (P × R × T) / 100, the program computes simple interest.*/
import java.util.Scanner;
public class q9 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    int n=sc.nextInt();
    int r=sc.nextInt();
    int si=(p*n*r)/100;
    System.out.println("simple interest is: "+si);
}
}