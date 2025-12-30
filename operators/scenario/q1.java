//A shop offers festival discounts. The customer enters the 
// original price and discount percentage. The program 
// must calculate the discount amount and the final price 
// payable after applying the discount.
import java.util.Scanner;
public class q1 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    double dd=a*(b/100.0);
    System.out.println("Discount amount: "+dd);
    double ff=a-dd;
    System.out.println("Final price after discount: "+ff);
}
}