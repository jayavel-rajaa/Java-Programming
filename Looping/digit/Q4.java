import java.util.Scanner;
public class Q4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int find = sc.nextInt();
        int count =0;
        while(num!=0){
            int dig = num%10;
            if(dig == find)
                count++;
            num = num/10;
        } System.out.println(count);
    }
}