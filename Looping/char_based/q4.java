//Q4. Write a Java program to print English alphabets that lie between two given alphabets.
import java.util.Scanner;
public class q4 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char ch1=sc.next().charAt(0);
    char ch2=sc.next().charAt(0);
    int a=(int)ch1;
    int b=(int)ch2;
    for(int i=a+1;i<b;i++){
        System.out.print((char)i+" ");
    }
    }
}