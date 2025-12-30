import java.util.Scanner;
public class Q19{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min =Integer.MAX_VALUE;
        int arr[] = new int [n];
        for(int i =0;i<n;i++){ 
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){ 
           if(min>arr[i]){
            min =arr[i];
           }
          }
          System.out.print(min);
        }

    }
