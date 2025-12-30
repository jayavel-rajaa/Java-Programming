import java.util.Scanner;
public class Q15{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        for(int i=0;i<num.length();i++){
            if(num.charAt(i)=='0')
                System.out.print("Zero ");
            else if(num.charAt(i)=='1')
                System.out.print("one ");
             else if(num.charAt(i)=='2')
                System.out.print("two ");
             else if(num.charAt(i)=='3')
                System.out.print("three ");
             else if(num.charAt(i)=='4')
                System.out.print("Four ");
             else if(num.charAt(i)=='5')
                System.out.print("Five ");
             else if(num.charAt(i)=='6')
                System.out.print("Six ");
             else if(num.charAt(i)=='7')
                System.out.print("Seven ");
             else if(num.charAt(i)=='8')
                System.out.print("Eight ");
             else if(num.charAt(i)=='9')
                System.out.print("Nine ");
        }
    }
}