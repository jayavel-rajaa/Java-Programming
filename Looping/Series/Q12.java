import java.util.Scanner;
public class Q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=16;i++){
            System.out.println(i+"*"+n+"="+(i*n));
        }

        
    }
}