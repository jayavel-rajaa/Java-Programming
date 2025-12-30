import java.util.Scanner;
public class Q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i =1;i<=n;i++){
            int cons =i;
             int tem = i;
             int count=0;
             int res =0;
            while(tem!=0){
                  int dig=tem%10;
                  tem=tem/10; 
                  count++;         
            } //System.out.print("count"+count);
            while(cons!=0){
                int dig = cons%10;
                res = (int) (res+Math.pow(dig,count));
                cons=cons/10;
            } //System.out.print(res+" ");
            if(res==i){
                System.out.print(res+" ");
            }
        }
    }
}