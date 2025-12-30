import java.util.Scanner;
public class Q3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = sc.nextInt();
        while(num!=0){
            int dig = num%10;
            if(dig==c){
                System.out.println("yes");
                return;
            }
             num=num/10;
        }System.out.println("no");

    }
}