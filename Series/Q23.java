import java.util.Scanner;
public class Q23{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            int sum =0;
            int tem =i;
            int sq = tem*tem;
            while(sq!=0){
                int dig = sq%10;
                sum +=dig;
                sq=sq/10;
            }if(sum==i)
                System.out.print(i+" ");
        }
    }
}