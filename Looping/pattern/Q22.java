import java.util.Scanner;
public class Q22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int tem =1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                
                    System.out.print(tem+" ");
                    tem++;
                
            }
            System.out.println();
            
        }
    }
}