import java.util.Scanner;
public class Q9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int even =0 , odd =0;
        for(int i=0;i<n;i++){
            if(i%2==0)
                even+=i;
            else
                odd+=i;
        }System.out.println(even+" even sum");
        System.out.println(odd+" odd");
    }
}