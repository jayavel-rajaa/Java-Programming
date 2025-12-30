import java.util.Scanner;
public class Q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int sum =0;
        for(int i=0; ;i++){
            i = sc.nextInt();
            if(i==-1)
                break;
            sum=sum+i;
           // System.out.print(sum);

        }System.out.print(sum);

        
    }
}