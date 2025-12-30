import java.util.Scanner;
public class Q17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        boolean res = true;
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=1;j<n-i-1;j++){
                if(arr[j]==arr[j+1]){
                    res = false;
                }
            }
        }
        if(res)
            System.out.print("it is distinct");
        else 
            System.out.print("it is not distinct");
    }
}