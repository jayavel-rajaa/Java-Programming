import java.util.Scanner;
public class Q26{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;int tot=0;
        int arr[] = new int[n];
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
            sum= sum+arr[i];
        }
        for(int i =1;i<=arr[n-1];i++){
            tot=tot+i;
        }
        int res = tot - sum;
        if(res==0){
            System.out.print(arr[n-1]+1);
        }
        else 
            System.out.print(res);
    }
}