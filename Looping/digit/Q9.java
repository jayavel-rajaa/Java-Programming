import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int max =0;
        while(num!=0){
            int dig = num%10;
            if(dig>max){
                max =dig;
            }
            num = num/10;
        }System.out.println(max);
    }
}