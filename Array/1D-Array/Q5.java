import java.util.Scanner;
public class Q5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int evensum =0,oddsum=0;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
            if(i%2==0)
                evensum+=arr[i];
            else
                oddsum+=arr[i];
        }
        System.out.print(evensum-oddsum);
    }
}