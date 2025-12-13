/*A fruit shop has an offer: Buy 3 mangoes and get 1 free.
Based on the mango price and total mangoes purchased, 
compute total mangoes received and amount to pay..*/
import java.util.Scanner;
public class q13 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int mp=sc.nextInt();
    int tm=sc.nextInt();
    int tmr=tm+(tm/3);
    int tmp=tm*mp;
    System.out.println("total mangoes received: "+tmr);
    System.out.println("amount to pay: "+tmp);
}
}