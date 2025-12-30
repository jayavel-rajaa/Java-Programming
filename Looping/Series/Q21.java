import java.util.Scanner;
public class Q21{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0 ,n2=1;
        int n3=0;
        if(n==1){
            System.out.print(n1+" ");
        return;}
        if(n==2){
            System.out.print(n2+" ");
            return;
        }
        System.out.print(n1+" "+n2+" ");
        for(int i = 1;i<=n;i++){
            n3=n1+n2;
            if(n3>n)
                return;
            System.out.print(n3+" ");
            n1=n2;
            n2=n3;
        }
    }
}