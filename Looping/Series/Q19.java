import java.util.Scanner;
public class Q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =1;i<=n;i++){
            int sum =0;
            int tem = i;
            for(int j=1;j<i;j++){
                if(i%j==0){
                    sum=sum+j;
                }
            } if(sum==i){
                System.out.print(sum+" ");
            }
        }
    }
}