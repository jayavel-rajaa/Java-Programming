import java.util.Scanner;
public class Q11{
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
                if(min>arr[j][i])
                    min = arr[j][i];
            }
            System.out.print(min+" ");
        }
    }
}