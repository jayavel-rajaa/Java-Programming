//Q4.Write a Java Program using switch case to print the season
// based on month number(Winter, Spring, Summer, Autumn).
import java.util.*;
public class q4{
    public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter Mark: ");
    int a=sc.nextInt();
    switch(a){
        case 12: case 11: case 10: 
            System.out.println("Rainy");
            break;
        case 6: case 7: case 8: case 9: 
            System.out.println("Spring");
            break;
        case 3: case 4: case 5:  
            System.out.println("Summer");
            break;
        case 1: case 2: 
            System.out.println("Autumn");
            break;    
        default :
            System.out.println("enter valid month");                    
    }
    sc.close();
    }
}