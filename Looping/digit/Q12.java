import java.util.Scanner;
public class Q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int evensum =0;
        int oddsum = 0;
        int evenres =0;
        int oddres = 0;
        while(num!=0){
            int dig=num%10;
            if(dig%2==0){
                evensum++;
                evenres+=dig;
            }
            else {
                oddsum++;
                oddres+=dig;
            }
            num = num/10;
        }
        int diff =evensum - oddsum;
        int diff1 = evenres - oddres;
        System.out.println(Math.abs(diff));
        System.out.println(Math.abs(diff1));
    }
}
