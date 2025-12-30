import java.util.Scanner;
public class Q20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(i+j>=n+1){
                    if(i+j==n+1|| j==n || i==n)
                        System.out.print("* ");
                    else 
                        System.out.print("  ");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 2;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i+j>=n+1){
                    if(i+j==n+1|| j==n || i==n)
                        System.out.print("* ");
                    else 
                        System.out.print("  ");
                }
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}