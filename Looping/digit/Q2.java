import java.util.Scanner;
public class Q2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dig=0;
        while(n!=0){
            dig = n%10;
            n = n/10;
        }
        if(dig%2==0)
            System.out.println("even");
        else 
            System.out.println("odd");

    }
}