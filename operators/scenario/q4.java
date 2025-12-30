/*A person drives at a constant speed. Given the speed (km/hr) and time (hr),
 the program must calculate the distance travelled using: distance = speed × time.
 */
import java.util.Scanner;
public class q4 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    double dd=(a*b);
    System.out.println("distance travelled: "+dd);
}
}