//harshad no. : 1. sum of dig
//              2. orig no. % sum of dig == 0 
import java.util.Scanner;
public class q17_harshad{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int s=0;
        int ss;
        int n=sc.nextInt();
        int t=n;
        while(n!=0){
            int d=n%10;
            s=s+d;
            n=n/10;
        }
        ss=s;
        if(t%ss == 0){
            System.out.println("Harshad Number");
        }
        else {
            System.out.println("NOT a Harshad Number");
        }
    }
}