/*A teacher distributes candies equally among students.
The program finds how many candies each student gets and how many remain undistributed.*/
import java.util.Scanner;
public class q7 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int can=sc.nextInt();
    int s=sc.nextInt();
    int eq=(can/s);
    System.out.println("candies each student gets: "+eq);
    int rem=can%s;
    System.out.println("remain undistributed: "+rem);
}
}
