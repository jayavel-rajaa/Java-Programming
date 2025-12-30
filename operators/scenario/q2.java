/*A student measures experiment time in minutes
 but needs the time in seconds. The program 
 should convert minutes into seconds.
 */
import java.util.Scanner;
public class q2 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    double dd=a*60;
    System.out.printf("Exp. is "+"%.2f",dd+" seconds");
}
}