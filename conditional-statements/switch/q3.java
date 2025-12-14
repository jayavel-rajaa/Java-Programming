//Q3.Java Program to check whether the given day number (1–7) is a weekday or weekend
import java.util.*;
public class q3{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Mark: ");
    int a=sc.nextInt();
    switch(a){
        case 7: case 1: 
            System.out.println("Weekend");
            break;
        case 2:case 3: case 4: case 5: case 6: 
            System.out.println("Weekday");
            break;
        default :
            System.out.println("enter valid day number");                    
    }
    sc.close();
    }
}