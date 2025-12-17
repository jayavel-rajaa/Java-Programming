//Twisted prime:  check no. is prime or not.
               // if prime , reverse the no.
               // check rev. no is prime or not
               // if prime then it is twisted prime 


import java.util.Scanner;
public class twisted_prime{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int s=0;
        int rrr=0;
        int rev=0;
        int sss=0;
        int n=sc.nextInt();
            int t=n;
            for(int i=2;i<n;i++){
                if(n%i==0){
                    System.out.println("Not Prime");
                    break;
                    //j++;
                }
                else{
                    sss=n;
                } 
            }
            while(sss!=0){
                int r=sss%10;
                rev=rev*10+r;
                sss=sss/10;
            }
            rrr=rev;
            for(int i=2;i<rrr;i++){
                if(rrr%i==0){
                    System.out.println("Prime but Not a Twisted Prime");
                    break;
                }
                else {
                    System.out.println("Twisted Prime");
                    break;
                }
            }

    }
}