/*A company calculates employee salary using: 
Basic + HRA + Allowance. The program must compute the total salary.*/
import java.util.Scanner;
public class q10 { 
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int c=sc.nextInt();
    int tot=a+b+c;
    System.out.println("total salary of an employee: "+tot);
}
}