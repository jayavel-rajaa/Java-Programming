import java.util.Scanner;
public class Q14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){ 
            arr[i] = sc.nextInt();
        }
        int low = 0, high = n-1;
        while(low<=high){
            if(arr[low]%2==0)
                low++;
            else if(arr[high]%2!=0){
                high--;
            }
            else {
                int tem = arr[low];
                arr[low]=arr[high];
                arr[high]=tem;
                low++;high--;
            }
        }
        for(int i=0;i<n;i++){ 
            System.out.print(arr[i]+" ");
        }
    }
}