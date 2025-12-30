import java.util.Scanner;
public class Q26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            int tem = i;
            int root = (int)Math.cbrt(i);
            int c = root*root*root;
            if(c == tem){
                System.out.print(tem+" ");
            }
        }
    }
}