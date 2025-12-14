//Q4.Java Program to check whether two given years have the same last digit.
import java.util.Scanner;
public class q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a%10 == b%10){
            System.out.println("years have the same last digit.");
        }
        else{
            System.out.println("Not Same");
        }
    }
}