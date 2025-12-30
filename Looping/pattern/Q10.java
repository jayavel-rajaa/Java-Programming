import java.util.Scanner;
public class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i =n;i>=1;i--){
            for(int j=1;j<=n;j++){
                if(i+j>=n+1){
                    if(i+j==n+1|| i==n || j==n)
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