import java.util.Scanner;
public class Q22{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int tem  = i;
            if(i==7 || (i%7==0)){
                System.out.print(i+" ");
            }
        }
    }
}