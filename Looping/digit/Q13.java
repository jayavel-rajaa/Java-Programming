import java.util.Scanner;
public class Q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='0')
                continue;
            System.out.print(num.charAt(i));
        }

    }
}