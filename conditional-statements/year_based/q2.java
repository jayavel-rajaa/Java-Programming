//Q2.Java Program to check whether a given year is a century year or not.
import java.util.Scanner;
public class q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a % 100;
        if(b == 0){
            System.out.println("Year is Century");
        }
        else{
            System.out.println("Not a Century Year");
        }
    }
}
