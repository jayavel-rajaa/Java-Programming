/*A bakery produces a fixed number of cakes every hour. 
Given cakes per hour and total hours, the program calculates total cakes made.
 */
import java.util.Scanner;
public class q8 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int tot=a*b;
    System.out.println("total cakes made: "+tot);
}
}