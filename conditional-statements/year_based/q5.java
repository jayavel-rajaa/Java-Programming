//Q5.Write a Java Program to check whether a given year and month combination is valid and print the number of days in that month (consider leap years for February).
import java.util.Scanner;
public class q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if((a%400 == 0 || (a%4==0 && a%100!=0) && b == 2)){
            System.out.println("29 Days");
        }

        else if(b==1 || b==3 || b==5 || b==7 || b==8 || b==10 || b==12){
            System.out.println("31 Days");
        }
        else if(b==4 || b==6 || b==7 || b==9 || b==11){
            System.out.println("30 Days");
        }
        else if(b==2){
            System.out.println("28 Days");
        }
        else {
            System.out.println("Enter Valid Month");
        }
    }
}