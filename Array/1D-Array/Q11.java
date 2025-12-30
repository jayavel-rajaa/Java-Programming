import java.util.Scanner;
public class Q11{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        int k=0;
        int arr1[]=new int[n];
        for(int j=n-1;j>=0;j--){
            arr1[k]=arr[j];
            k++;
        }
        for(int i=0;i<n;i++){ 
            System.out.print(arr1[i]+" ");
        }
    }
}