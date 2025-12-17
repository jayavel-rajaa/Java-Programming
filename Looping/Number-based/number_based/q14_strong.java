//Strong number => 145 = 1! + 4! + 5! => (145==145)

import java.util.Scanner;
public class q14_strong{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int s=0;
        int fact=1;
        int n=sc.nextInt();
            int t=n;
            while(n!=0){
                int rem=n%10;
                for(int i=1;i<=rem;i++){
                    fact=fact*i;
                }
                s=s+fact;
                fact=1;
                n=n/10;
            }
            int t1=s;
            if(t1==t) {
                System.out.println("Strong number");
        }
    }
}
