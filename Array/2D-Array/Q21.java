import java.util.Scanner;
public class Q21{
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
        boolean res =false;
        for(int i =0;i<r1;i++){
             res = false;
            for(int j=0;j<c1;j++){
                if((arr1[i][j]==0 && i!=j) || ((arr1[i][j]==1)&&(i==j))){
                    res = true;
                }
            }
        }
        if(res)
            System.out.print("it is identity matrix");
        else 
            System.out.print("it is not identity matrix");

    }
}