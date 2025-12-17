//Q7.Write a Java program to calculate electricity bill using slab rates 
// (0–100 free, 101–300 = ₹5/unit, >300 = ₹10/unit) and
//  apply surcharge if consumption exceeds 500 units.
import java.util.*;
public class q7 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
      int s=100;
    int b=sc.nextInt();
    if(b>=0 && b<=100){
      System.out.println("Free");
      }
   else if(b>100 && b<=300){
        int bb;
        bb=b-100;
        System.out.println("Charge is "+bb*5);
}    else if(b>300 && b<=500){
        int bb;
        bb=b-100;
        System.out.println("Charge is "+bb*10);
} 
    else{
        int bb;
        bb=b-100;
        System.out.println("Charge is "+((bb*10)+s));
} 
sc.close();
}
}