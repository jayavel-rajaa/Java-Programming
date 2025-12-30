/*A computer networks student wants to convert bytes into bits.
 Since 1 byte = 8 bits, the program multiplies accordingly.*/
import java.util.Scanner;
public class q6 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    double dd=(a*8);
    System.out.println("bytes into bits: "+dd);
}
}