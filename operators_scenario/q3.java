/*Three friends eat at a restaurant and get a single bill. They
 want to split the total bill equally. The program calculates
  how much each friend must pay.*/

import java.util.Scanner;
public class q3 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    double dd=(a/3.0);
    System.out.println("Split amount is : "+dd);
    }
}