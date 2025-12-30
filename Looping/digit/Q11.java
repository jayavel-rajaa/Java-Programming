import java.util.Scanner;
public class Q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int tem = num;
        int count =0;
        int even =0,odd=0;
        while(num!=0){
            int dig = num%10;
            num=num/10;
            count++;
        }
        while(tem!=0){
            int dig = tem%10;
            if(dig%2==0)
                even++;
            else
                odd++;
            tem = tem/10;

        }if(even == count)
            System.out.print("even");
        else if(odd == count)
            System.out.print("odd");
        else 
            System.out.print("Mixed");
    }
}