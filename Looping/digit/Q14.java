import java.util.Scanner;
public class Q14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sq =0;
        int c = 0;
        while(num!=0){
            int dig = num%10;
            sq = sq+(dig*dig);
            c = c+(dig*dig*dig);
            num = num/10;
        }System.out.println(sq);
        System.out.println(c);
    }
}