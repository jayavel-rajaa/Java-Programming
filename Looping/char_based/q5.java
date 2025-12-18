//Q5. Write a Java program to print vowels and consonants separately.

import java.util.Scanner;
public class q5 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int r=0;
    System.out.println("A E I O U");
    for(char i='A';i<='Z';i++){
    if(i=='A' || i=='U' || i=='I' || i=='E' || i=='O')
        r=1;   
    else
        System.out.print(i+" ");
    }
 }
}