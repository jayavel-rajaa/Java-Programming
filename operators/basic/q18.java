package operators.operators_basic;
//print whether a number is positive or negative.
import java.util.Scanner;
public class q18 {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    double a=sc.nextDouble();
    System.out.println((a>0)?"Positive":(a==0)?"Zero":"Negative");    
}
}