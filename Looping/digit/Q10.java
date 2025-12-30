import java.util.Scanner;
public class Q10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int min =1000000000;
        while(num!=0){
            int dig = num%10;
            if(dig<min){
                min =dig;
            }
            num = num/10;
        }System.out.println(min);
    }
}