import java.util.Scanner;
public class Q16{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count1=0;
        for(int i =1 ;i<10000000;i++){
            if(count1>n-1){
                return;
            }
            int count =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;
                }
            } if(count==2){
                System.out.print(i+" ");
                count1++;
            }

        }
    }}