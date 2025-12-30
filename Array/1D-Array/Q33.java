import java.util.Scanner;
public class Q33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
       
        int low =0 ;int high =n-1;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         int tar = sc.nextInt();
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==tar){
                System.out.print(mid);
                return;}
            else if(arr[mid]>tar)
                high = mid-1;
            else 
                low = mid+1;

        }
    }
}