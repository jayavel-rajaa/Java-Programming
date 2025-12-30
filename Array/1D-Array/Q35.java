import java.util.Scanner;
public class Q35{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int arr1[] = new int[n1];
        int arr2[] = new int[n2];
        for(int i =0;i<n1;i++)
            arr1[i]=sc.nextInt();
        for(int i = 0;i<n2;i++)
            arr2[i]=sc.nextInt();

        int merge[] = new int[n1+n2];
        int i =0;
        int j = 0;
        int k =0;
        while(i<n1 && j<n2){
            if(arr1[i]<arr2[j]){
                merge[k]=arr1[i];
                i++;
            }
            else {
                merge[k]=arr2[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            merge[k] = arr1[i];
            i++;
            k++;
        }
        while(j<n2){
            merge[k] = arr2[j];
            j++;
            k++;
        }
        int n = n1+n2;
        for(int m =0;m<n;m++){
            System.out.print(merge[m]+" ");

        }

    }
}