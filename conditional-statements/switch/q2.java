//Q2.Java Program to check grade of a student based on marks (A, B, c, Fail)
import java.util.*;
public class q2{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Mark: ");
    int a=sc.nextInt();
    switch(a/10){
        case 10:case 9: 
            System.out.println("Grade "+"A");
            break;
        case 7: case 8: 
            System.out.println("Grade "+"B");
            break;
        case 5:case 6: 
            System.out.println("Grade "+"C");
            break;
        default :
            System.out.println("Fail");                    
    }
    sc.close();
    }
}