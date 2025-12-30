/*A stationery shop offers: Buy 5 pens, pay only for 3.
 Given price per pen and pens bought, the program calculates
  how many pens need to be paid for and total cost.*/
import java.util.Scanner;
public class q14 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int t1=(a/5)*2;
    int tt=b-t1;
    int tot=tt*a;
   System.out.println("Pens to pay for: " + tt);
        System.out.println("Total cost: " + tot);
}
}