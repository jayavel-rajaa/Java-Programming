/*A fitness trainer tracks running distances in meters.
 Athletes give distance in kilometers, so the program converts km → meters.
 */
import java.util.Scanner;
public class q5 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    float a=sc.nextFloat();
    double dd=(a*1000);
    System.out.println("km to meters: "+dd);
}
}