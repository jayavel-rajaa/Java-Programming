//Q8.Write a Java program to check if an entered PIN matches
//  the stored ATM PIN before allowing withdrawal.
import java.util.*;
public class q8 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      int s=1234;
    int b=sc.nextInt();
    if(s==b){
      System.out.println("Pin Verified");
   } else
        System.out.println("Wrong Pin Entered !");
sc.close();
}
}