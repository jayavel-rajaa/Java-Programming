package operators_basic;
//Q17.Write a Java Program to check if a number is power of 2 using bitwise AND.
import java.util.Scanner;
public class q17 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    boolean b=(a > 0) && ((a & (a - 1)) == 0);
    System.out.println(b);    
}
}

//doubt