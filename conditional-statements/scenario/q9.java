//Q9.Write a Java program to check if withdrawal amount ≤ balance and
//  is a multiple of 100 (ATM Withdrawal Validation).
import java.util.*;
public class q9 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      int b=2000;
    int a=sc.nextInt();
    if(a<=b){
      if(a%100==0){

      System.out.println("Withdraw success");
      b=b-a;
    }
      else
          System.out.println("Withdraw amount must end with 00's");
       } else
        System.out.println("Withdraw amount exceeds the balance!");
sc.close();
}
}