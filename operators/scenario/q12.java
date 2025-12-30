/*A product is sold at a loss.
Given selling price and loss amount, 
the program calculates the cost price using: CP = SP + Loss.*/
import java.util.Scanner;
public class q12 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int tot=a+b;
    System.out.println("cost price: "+tot);
}
}