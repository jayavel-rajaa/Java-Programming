//Q3. Write a Java program to print lowercase English alphabets in reverse order.
import java.util.Scanner;
public class q3 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    for(char ch='z';ch>='a';ch--){
        System.out.print(ch+" ");
    }
    }
}