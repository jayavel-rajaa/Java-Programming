import java.util.Scanner;
public class Q6{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num = sc.next();
        boolean des = true;
        for(int i =0;i<num.length()-1;i++){
            if(num.charAt(i)<num.charAt(i+1)){
                des = false;
                break;
            }
        }if(des)
            System.out.println("descending");
            else
                System.out.println("not descending");
    }
}