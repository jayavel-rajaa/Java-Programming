import java.util.Scanner;
public class Q14{
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
        int min =Integer.MAX_VALUE ,ind =0;
        for(int i =0;i<r;i++){
            int sum =0;
            for(int j =0;j<c;j++)
                sum = sum+arr[i][j];
            if(sum<min){
                min=sum;
                ind = i;
            }
        }
        for(int i =0;i<c;i++){
            System.out.print(arr[ind][i]+" ");
        }
    }
}