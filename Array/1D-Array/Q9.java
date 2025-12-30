import java.util.Scanner;
public class Q9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int low = 0;
        for(int i=0;i<n;i++){ 
            if(arr[i]<0){
                int temp = arr[i];
                 arr[i] = arr[low];
                arr[low]= temp;
                low++;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }
}