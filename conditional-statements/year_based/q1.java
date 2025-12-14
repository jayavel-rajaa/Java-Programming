//Q1. Java Program to check whether a year is a leap year or not
import java.util.Scanner;
public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if(a%400 == 0 || (a%4==0 && a%100!=0)){
            System.out.println("It is Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}