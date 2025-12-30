import java.util.Scanner;
public class Q25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print((char)(j+64)+" ");
            }
             for(int k=i-1;k>=1;k--){

                System.out.print((char)(k+64)+" ");


           }
          
           System.out.println();
            
    }
}
}
