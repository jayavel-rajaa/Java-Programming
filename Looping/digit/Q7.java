import java.util.Scanner;
public class Q7{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
            char f = num.charAt(0);
            //System.out.print(f);
            char l = num.charAt(num.length()-1);
            System.out.print(l);
            for(int i = 1;i<num.length()-1;i++){
                System.out.print(num.charAt(i));
            }
            System.out.print(f);
            
        

    }

}