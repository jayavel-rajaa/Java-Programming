import java.util.Scanner;
public class Q20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r1 = sc.nextInt();
        int c1= sc.nextInt();

        int arr1[][] = new int[r1][c1];
        for(int i =0;i<r1;i++){
            for(int j=0;j<c1;j++){
                arr1[i][j] = sc.nextInt();
            }    
        }
        for(int i =0;i<r1;i++){
            for(int j=0;j<c1;j++){
                if(arr1[i][j]!=arr1[j][i]){
                    System.out.print("false");
                    return;
                }
            }
        }
        System.out.print("true");
    }
}