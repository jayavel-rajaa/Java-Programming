import java.util.Scanner;
public class Q12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i =0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j] = sc.nextInt();
            }    
        }
        for(int i =0;i<r;i++){ 
            int min = Integer.MAX_VALUE;
            for(int j=0;j<c;j++){
                if(min>arr[i][j])
                    min = arr[i][j];
            }
            System.out.print(min+" ");
        }
    }
}