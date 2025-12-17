//prime no. or not

import java.util.Scanner;
public class prime{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int s=0;
        int j=0;
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
                    System.out.println("Prime");
                    break;
                    //sss=n;
                } 
            }
            
    }
}