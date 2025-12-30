import java.util.Scanner;
public class Q18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            int tem =i;
            int sum =0;
            while(tem!=0){
                int fact =1;
                int dig=tem%10;
                for(int j=1;j<=dig;j++)
                    fact=fact*j;
                sum=sum+fact;
                tem = tem/10;
            }
            if(sum == i)
                System.out.print(sum+" ");
        }

    }
}