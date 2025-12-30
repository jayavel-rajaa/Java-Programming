import java.util.Scanner;
public class Q30{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n+1];
        int pos =0;
        
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            boolean res = true;
            for(int j=0;j<n;j++){
                if(i!=j && arr[i]==arr[j]){
                   res = false;
                }
            }
            if(res){
            System.out.print(arr[i]+" ");
            }
        }
       
    }
}

