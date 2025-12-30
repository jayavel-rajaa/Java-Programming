import java.util.Scanner;
public class Q14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        for(int i=0;i<n;i++){
            int j = sc.nextInt();
            if(j<0)
                continue;
            sum = sum + j;
        }System.out.print(sum);
        
    }
}