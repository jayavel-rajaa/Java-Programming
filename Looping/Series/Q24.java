import java.util.Scanner;
public class Q24{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 =1;
        for(int i=1;i<=n;i++){
            if(n1>n){
                return;
            }
            System.out.print(n1+" ");
            n1 = n1*2;
            
        
            
        }
    }
}