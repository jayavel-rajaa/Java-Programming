import java.util.Scanner;
public class Q8{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num =sc.nextInt();
        for(int i =0;i<=9;i++){
            int tem =num;
            int count =0;
            while(tem>0){
                if(tem%10 == i){
                    count++;
                }
                 tem=tem/10;
            }
           
            if(count>=1)
                System.out.println(i+":"+count);
        }
    }
}