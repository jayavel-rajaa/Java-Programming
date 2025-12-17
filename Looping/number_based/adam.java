//Adam number:  (1. == 2.)
//  (1.)sqrt given no. 
//  (2.)rev given no. => sqrt rev no. => rev result of rev. sqrt no.

import java.util.Scanner;
public class adam{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int s=0;
        int sq;
        int rev=0;
        int rr=0;
        int rrr=0;
        int rsq;
        int n=sc.nextInt();
            int t=n;
            sq=n*n;
            
            while(n!=0){
                int r=n%10;
                rev=rev*10+r;
                n=n/10;
            }
            rr=rev;
            rsq=rr*rr;
            while(rsq!=0){
                int re=rsq%10;
                rrr=rrr*10+re;
                rsq=rsq/10;
            }
            if(rrr==sq) {
                    System.out.println("Adam Number");
                }
                else {
                    System.out.println("Not Adam Number");
                
                }
            }

    }