//Q3.Java Program to check whether the first two digits and
//  last two digits of a year are equal.
import java.util.Scanner;
public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = a % 100;
        int c = a/100;
        int d = c%100;
        if(b == d){
            System.out.println("Year of First 2 dig and Last 2 dig are Equal");
        }
        else{
            System.out.println("Not Equal");
        }
    }
}