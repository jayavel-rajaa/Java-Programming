import java.util.Scanner;
public class Q13{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean res = true;
        int arr[] = new int[n];
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]==arr[j+1])
                    res =false;
            }
        }
        if(res)
            System.out.println("it does not have duplicate");
        else 
            System.out.println("it has duplicates");

    }
}